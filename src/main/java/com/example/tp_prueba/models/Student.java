package com.example.tp_prueba.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Student")
@Table(name = "\"Students\"", schema = "public")
@OnDelete(action = OnDeleteAction.CASCADE)
@PrimaryKeyJoinColumn(name = "id", foreignKey = @ForeignKey(name = "fk_student_person"))
public class Student extends Person implements Serializable {

    private static final long serialVersionUID = 8486734623882380553L;

    @Column(name = "schoolarship", columnDefinition = "boolean DEFAULT 'false'")
    @Getter
    @Setter
    private Boolean schoolarship = false;

    @Column(name = "state", columnDefinition = "integer DEFAULT '1'")
    @Getter
    @Setter
    private Integer state = 1;
}
