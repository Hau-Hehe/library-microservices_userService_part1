package com.example.library_user_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegisterRequestDto {
    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    private String lastName;

    @Email(message = "Invalid Format")
    @NotBlank(message = "First Name is required")
    private String email;

    @NotBlank(message = "First Name is required")
    @Size(min = 6, message = "Password must be at leat 6 characters")
    private String password;
}
