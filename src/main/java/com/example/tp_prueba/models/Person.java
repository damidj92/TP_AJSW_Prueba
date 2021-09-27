package com.example.tp_prueba.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity(name = "Person")
@Table(name = "\"Persons\"", schema = "public")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {

    @Id
    @Column(name = "id", length = 10)
    @Getter
    @Setter
    private String id;

    @Column(name = "name", nullable = false)
    @Getter
    @Setter
    private String name;

    @Column(name = "gender", length = 1, nullable = false)
    @Getter
    @Setter
    private String gender;

    @Column(name = "email", nullable = false)
    @Getter
    @Setter
    private String email;
}
