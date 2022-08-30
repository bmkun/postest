package com.idho.training.dto;

import lombok.Data;

/**
 * @author Idho
 */
@Data
public class UserDto {

    private Long id;
    private String username;
    private String password;
    private int isActive;
}
