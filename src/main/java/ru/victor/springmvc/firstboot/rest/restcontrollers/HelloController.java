package ru.victor.springmvc.firstboot.rest.restcontrollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//public class HelloController {
//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello(){
//        return "Hello!";
//    }
//    @GetMapping("/bye")
//    @ResponseBody
//    public String bye(){
//        return "bye";
//    }
//
//}

@Controller
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello"; //метод делает тоже самое только тут мы анотируем весь класс
    }
}
