package com.example.library_user_service.dto;

import com.example.library_user_service.entity.User;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private User.UserRole role;
    private Boolean active;
    private LocalDateTime createdAt;
}
