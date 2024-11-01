package csumb.project3backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "Redirecting to login...";
    }

    @GetMapping("/logout")
    public String logout() {
        return "Logged out successfully!";
    }
}
