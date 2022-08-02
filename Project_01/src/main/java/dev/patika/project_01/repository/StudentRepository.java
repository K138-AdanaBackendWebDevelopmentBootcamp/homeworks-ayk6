package dev.patika.project_01.repository;

import dev.patika.project_01.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

    public void deleteByName(String name);
}
