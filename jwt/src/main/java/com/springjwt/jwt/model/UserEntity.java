package com.springjwt.jwt.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String password;

    @ManyToMany
    @JoinTable(name="user_roles",joinColumns = @JoinColumn(name="user_id",referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn (name="role_id",referencedColumnName = "id")
    )
    private List<Role> userRoles;

}
