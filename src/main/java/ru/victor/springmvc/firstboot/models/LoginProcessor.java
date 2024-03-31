package ru.victor.springmvc.firstboot.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import ru.victor.springmvc.firstboot.services.LoggedUserManagmentService;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagmentService loggedUserManagmentService;

    public LoginProcessor(LoggedUserManagmentService loggedUserManagmentService) {
        this.loggedUserManagmentService = loggedUserManagmentService;
    }

    private String password;
    private String username;

    public boolean login(){
        String username=this.getUsername();//так кк у нас прайват элемент мы получаем доступ через геттеры
        String password = this.getPassword();

        boolean loginResult = false;

        if ("natalie".equals(username) && "password".equals(password)) {
            loginResult = true;
            loggedUserManagmentService.setUsername(username);

        }
        return loginResult;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
