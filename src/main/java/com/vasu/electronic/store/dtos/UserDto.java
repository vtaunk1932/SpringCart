package com.vasu.electronic.store.dtos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String userId;

        private String name;

        private String email;

        private String password;
        private String gender;

        private String about;

        private String imageName;
}
