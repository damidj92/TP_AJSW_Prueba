package com.example.tp_prueba.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Entity(name = "Course")
@Table(name = "\"Courses\"", schema = "public")
public class Course implements Serializable {

    private static final long serialVersionUID = 9043845946468515038L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long key;

    @ManyToOne
    @JoinColumn(
            name = "teacher_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "fk_teacher_person",
                    foreignKeyDefinition = "FOREIGN KEY (teacher_id)\n" +
                            "        REFERENCES public.\"Teachers\" (id) MATCH SIMPLE\n" +
                            "        ON UPDATE CASCADE\n" +
                            "        ON DELETE CASCADE",
                    value = ConstraintMode.CONSTRAINT
            )
    )
    @Getter
    @Setter
    private Teacher teacher;

    @Column(name = "name", nullable = false, unique = true)
    @Getter
    @Setter
    private String name;

    @Column(name = "start_date", nullable = false, columnDefinition = "date DEFAULT 'now()'")
    @Getter
    @Setter
    private LocalDate start_date = ZonedDateTime.now(ZoneId.of("America/Argentina/Buenos_Aires")).toLocalDate();

    @Column(name = "ending_date", nullable = false)
    @Getter
    @Setter
    private LocalDate ending_date;

    @ManyToMany(mappedBy = "enrolled_courses", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @Getter
    @Setter
    private List<Student> enrolled_students;
}
