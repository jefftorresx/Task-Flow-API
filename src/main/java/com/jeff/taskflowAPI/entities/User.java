package com.jeff.taskflowAPI.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String userName;

    @Email
    @NotBlank
    @Column(unique = true)
    private String email;

    @NotBlank
    private String password;

    @ManyToMany(mappedBy = "members")
    private List<Projeto> projects;

    public User() {
    }

    public User(Long id, String userName, String email, String password, List<Projeto> projects) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.projects = projects;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Projeto> getProjects() {
        return projects;
    }

    public void setProjects(List<Projeto> projects) {
        this.projects = projects;
    }
}
