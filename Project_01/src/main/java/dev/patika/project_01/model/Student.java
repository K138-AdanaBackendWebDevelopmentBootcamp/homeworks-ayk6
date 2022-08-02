package dev.patika.project_01.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data
@Entity
public class Student {

    // A Student who has a name, a birth date, an address, and gender could
    // take zero or more courses.

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullname;
    private String birthday;
    private String adress;
    private String gender;

    @ManyToMany (mappedBy = "studentList")
    private List<Course> courseList;
}
