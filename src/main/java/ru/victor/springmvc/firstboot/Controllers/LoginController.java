package ru.victor.springmvc.firstboot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.victor.springmvc.firstboot.models.LoginProcessor;

@Controller
public class LoginController {
    private final LoginProcessor loginProcessor;
    public LoginController(LoginProcessor loginProcessor){
        this.loginProcessor = loginProcessor;
    }

    @GetMapping("/")
    public String loginGet(){

        return("login.html");
    }
    @PostMapping("/")
    public String loginPost(@RequestParam String password,
                            Model model,
                            @RequestParam String username) {
        loginProcessor.setUsername(username);
        loginProcessor.setPassword(password);
        boolean logedIn = loginProcessor.login();
        if (logedIn == true) {
            return "redirect:/main";//Если этот метод вернул нам тру выполняется первая часть иф если нет то вторая
//            model.addAttribute("message", "You are now loge in.");

        } else {
            model.addAttribute("message", "Login failed");
        }
        return "login.html";
    }

}
