package ru.sberbank.jd.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import ru.sberbank.jd.controller.input.TaskInput;
import ru.sberbank.jd.model.Task;

@Service
public class TaskService {

    public Task createTask(@NonNull TaskInput taskInput) {
        Task task = Task.of(taskInput);
        return task;
    }
}
