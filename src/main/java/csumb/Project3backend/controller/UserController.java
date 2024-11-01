package csumb.project3backend.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // Endpoint to retrieve authenticated user information
    @GetMapping("/user")
    public String userInfo(@AuthenticationPrincipal OAuth2User principal) {
        // Returns user information as JSON
        return "User Info: " + principal.getAttributes();
    }
}