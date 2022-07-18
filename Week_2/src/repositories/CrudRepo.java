package repositories;

import model.Student;

import java.util.List;

public interface CrudRepo <T>{
    // create , read , update , delete
    List<Student> listAll();
    T findById(int id);
    void saveToDatabase(T t);
    void updateDatabase(T t,int id);
    void deleteFromDatabase(T t,int id);
}
