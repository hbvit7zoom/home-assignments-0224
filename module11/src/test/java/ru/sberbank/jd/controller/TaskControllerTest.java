package ru.sberbank.jd.controller;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import ru.sberbank.jd.model.Task;
import ru.sberbank.jd.service.TaskService;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TaskControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    @MockBean
    private TaskService taskService;

    @Test
    public void createTask_post_200() throws Exception {
        Task mockTask = Task.builder()
                .id("123")
                .owner("Nikita")
                .description("my description")
                .summary("First Task of the day")
                .createdDateTime(LocalDateTime.now())
                .build();
        Mockito.when(taskService.createTask(ArgumentMatchers.any())).thenReturn(mockTask);

        mockMvc.perform(post("/tasks").content("{\n" +
                "  \"description\": \"my description\",\n" +
                "  \"summary\": \"First Task of the day\",\n" +
                "  \"owner\": \"Nikita\"\n" +
                "}").accept(MediaType.APPLICATION_JSON));
    }

    @Test
    public void notFound_404_error() throws Exception {
        mockMvc.perform(get("/tasks/id-not-found")).andExpect(status().isNotFound());
    }
}