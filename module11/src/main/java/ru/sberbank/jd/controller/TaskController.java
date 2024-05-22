package ru.sberbank.jd.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import ru.sberbank.jd.controller.input.TaskInput;
import ru.sberbank.jd.model.Task;
import ru.sberbank.jd.service.TaskService;

@RestController
@RequestMapping("/tasks")
@Slf4j
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping
    public Task createTask(@RequestBody TaskInput taskInput) {
        log.debug("[createTask] taskInput={}", taskInput);
        Task task = taskService.createTask(taskInput);

        // Для GET
        // throw new ResponseStatusException(HttpStatus.NOT_FOUND, "message")

        return task;
    }
}
