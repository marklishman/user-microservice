package io.lishman.userms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class PropsController {

    @Value("${user.message}")
    private String message;

    @Value("${user.basePath}")
    private String basePath;

    @Value("${user.secret.password}")
    private String password;

    @GetMapping("/props")
    public String props() {
        return message + "\n" + password + "\n" + basePath;
    }
}
