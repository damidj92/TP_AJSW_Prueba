package com.example.tp_prueba.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Teacher")
@Table(name = "\"Teachers\"", schema = "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_teacher_person"))
public class Teacher extends Person implements Serializable {

    private static final long serialVersionUID = -4353704396090102650L;

    @Column(name = "degree", nullable = false)
    @Getter
    @Setter
    private String degree;

    @Column(name = "salary", nullable = false)
    @Getter
    @Setter
    private Double salary;
}
