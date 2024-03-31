package ru.victor.springmvc.firstboot.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.victor.springmvc.firstboot.services.LoggedUserManagmentService;
import ru.victor.springmvc.firstboot.services.LoginCountService;

@Controller
public class MainController {
    private final LoggedUserManagmentService loggedUserManagmentService;
    private final LoginCountService loginCountService;

    public MainController(LoggedUserManagmentService loggedUserManagmentService,
                          LoginCountService loginCountService) {
        this.loginCountService=loginCountService;
        this.loggedUserManagmentService = loggedUserManagmentService;
    }

    @GetMapping("/main")
    public String main(@RequestParam(required = false) String logout,
                       Model model){
        if (logout != null){
            loggedUserManagmentService.setUsername(null);
        }
        String username = loggedUserManagmentService.getUsername();
        int count = loginCountService.getCount();

        if(username==null){
            return "redirect:/";
        }
        model.addAttribute("loginCount", count);
        model.addAttribute("username", username);
        return "main.html";
    }
}
