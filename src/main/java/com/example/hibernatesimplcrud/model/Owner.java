package com.example.hibernatesimplcrud.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name = "owners")
public class Owner {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "owner_id")
    private Long id;


    @Column(name = "name")
    @JsonProperty("name")
    private String name;


    @Column(name = "email")
    @JsonProperty("email")
    private String email;


    @Column(name = "phone")
    @JsonProperty("phone")
    private String phone;


    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    // Добавлены сеттеры
    public void setId(Long id) {
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }
}
