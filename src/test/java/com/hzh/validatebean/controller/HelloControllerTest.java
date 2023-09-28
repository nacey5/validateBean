package com.hzh.validatebean.controller;

import com.hzh.validatebean.core.user.bo.User;
import com.hzh.validatebean.core.user.controller.HelloController;
import com.hzh.validatebean.core.user.mock.MockService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;


@ExtendWith(SpringExtension.class)
@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MockService mockService;

    @BeforeEach
    public void setUp() {
        when(mockService.add(any())).thenReturn(true);
    }

    @Test
    void testProcessHello() throws Exception {
        // Setup
        // Run the test

        mockMvc.perform(MockMvcRequestBuilders.get("/hello"))
                .andExpect(status().isOk())
                .andDo(MockMvcResultHandlers.print());

        // Verify the results
    }

    @Test
    public void testProcessMockAdd() throws Exception {
        User user = new User();
        user.setAccount("testAccount");
        String userJson = "{ \"account\": \"testAccount\" }"; // Simplified JSON representation of the user

        mockMvc.perform(post("/mockAdd")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(userJson))
                .andExpect(status().isOk());

        verify(mockService, times(1)).add(any());
    }
}
