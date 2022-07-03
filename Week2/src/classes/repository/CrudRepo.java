package classes.repository;

import classes.student.Student;

import java.util.List;

public interface CrudRepo<t> {
    // create , read , update , delete

    List<t> findAllStudent();


}
