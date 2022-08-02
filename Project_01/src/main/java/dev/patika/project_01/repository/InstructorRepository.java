package dev.patika.project_01.repository;

import dev.patika.project_01.model.Instructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor, Long> {
    void deleteByName(String name);


    @Query("select e.salary, count(e.salary) from Instructor e GROUP BY e.salary")
    List<?> getSalariesWithGrouping();


    List<Instructor> findTop3BySalary(Long salary);
    // the three highest paid instructors
    List<Instructor> findBot3BySalary(Long salary);
    // the three lowest paid instructors

}
