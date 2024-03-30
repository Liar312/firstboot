package ru.victor.springmvc.firstboot.models;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private String password;
    private String username;

    public boolean login(){
        String username=this.getUsername();//так кк у нас прайват элемент мы получаем доступ через геттеры
        String password = this.getPassword();

        if ("natalie".equals(username) && "password".equals(password)) {
            return true;
        }
        else {
            return false;
        }

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
