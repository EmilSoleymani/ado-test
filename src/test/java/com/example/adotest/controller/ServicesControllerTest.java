package com.example.adotest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.hamcrest.Matchers.containsInAnyOrder;

@SpringBootTest
@AutoConfigureMockMvc
public class ServicesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testServicesEndpoint() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/services"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$", containsInAnyOrder("Web Design", "Backend", "Cloud Services")));
    }
}
