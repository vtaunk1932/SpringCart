package com.vasu.electronic.store.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="users")
public class  User {


    @Id
    private String userId;

    @Column(name="UserName")
    private String name;

    @Column(name="UserEmail" ,unique=true)
    private String email;

    @Column(name="UserPassword" ,length=10)
    private String password;
    private String gender;

    @Column(length=1000)
    private String about;

    @Column(name="UserImageName")
    private String imageName;
}
