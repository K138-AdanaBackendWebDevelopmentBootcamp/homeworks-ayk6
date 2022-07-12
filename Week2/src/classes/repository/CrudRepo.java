package classes.repository;


import java.util.List;

public interface CrudRepo<t> {
    // create , read , update , delete

    List<t> findAllStudent();


}
