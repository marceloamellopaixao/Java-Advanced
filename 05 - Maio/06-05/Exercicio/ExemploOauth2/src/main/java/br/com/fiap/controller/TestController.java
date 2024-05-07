package br.com.fiap.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /**
     * Endpoint that is publicly accessible.
     * @return A welcome message that is not protected.
     */
    @GetMapping("/public")
    public String publicEndpoint() {
        return "Welcome to the Public Endpoint! No authentication required.";
    }

    /**
     * Secure endpoint that requires the user to be authenticated.
     * @return A secure message that requires user authentication.
     */
    @GetMapping("/private")
    public String privateEndpoint() {
        return "You are accessing a protected resource. Authentication validated.";
    }

    /**
     * Secure endpoint with role-based access control.
     * This endpoint requires the user to have the 'ADMIN' role.
     * @return A message only accessible by users with the ADMIN role.
     */
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @GetMapping("/admin")
    public String adminOnlyEndpoint() {
        return "Welcome, Admin! This message is only accessible with ADMIN privileges.";
    }
}