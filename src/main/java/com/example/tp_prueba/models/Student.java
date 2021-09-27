package com.example.tp_prueba.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "\"StudentCourse\"",
            joinColumns = @JoinColumn(
                    name = "student_id",
                    referencedColumnName = "id",
                    foreignKey = @ForeignKey(
                            name = "fk_student_course",
                            foreignKeyDefinition = "FOREIGN KEY (student_id)\n" +
                                    "        REFERENCES public.\"Students\" (id) MATCH SIMPLE\n" +
                                    "        ON UPDATE CASCADE\n" +
                                    "        ON DELETE CASCADE",
                            value = ConstraintMode.CONSTRAINT
                    )
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "course_key",
                    referencedColumnName = "key",
                    foreignKey = @ForeignKey(
                            name = "fk_course_student",
                            foreignKeyDefinition = "FOREIGN KEY (course_key)\n" +
                                    "        REFERENCES public.\"Courses\" (key) MATCH SIMPLE\n" +
                                    "        ON UPDATE CASCADE\n" +
                                    "        ON DELETE CASCADE",
                            value = ConstraintMode.CONSTRAINT
                    )
            ),
            uniqueConstraints = @UniqueConstraint(name = "composite_keys", columnNames = {"student_id", "course_key"})
    )
    @Getter
    @Setter
    private List<Course> enrolled_courses;
}
