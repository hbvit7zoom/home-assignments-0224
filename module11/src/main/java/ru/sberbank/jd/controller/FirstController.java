package ru.sberbank.jd.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.sberbank.jd.controller.input.FirstInput;
import ru.sberbank.jd.controller.out.FirstOut;

import java.util.Map;

//@Controller
@RestController
//@RequestMapping("/first")
@Slf4j
public class FirstController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/out")
    public FirstOut out() {
        return new FirstOut("1", "2", "3");
    }

    // localhost:8080/out?param1=value1&param2=value2

    @GetMapping("/out/params")
    public FirstOut outParams(
            @RequestParam("param1") String param1,
            @RequestParam("param2") String param2,
            @RequestParam("param3") String param3,
            @RequestHeader("user-x") String headerUserX
    ) {
        return new FirstOut(param1, param2, headerUserX);
    }

    @GetMapping("/out/params/all")
    public String outAllParams(@RequestParam Map<String, String> allParams) {
        return allParams.toString();
    }

    @GetMapping("/out/{id}")
    public String getId(@PathVariable("id") String id, HttpServletRequest request, HttpServletResponse response) {
        log.info("id={}", id);
        log.info("ServletRequest pathInfo = {}", request.getPathInfo());
        return id;
    }

    @PostMapping("hello")
    public FirstOut postHello(@RequestBody FirstInput input) {
        return new FirstOut(input.value1(), input.value2(), input.value3());
    }



}
