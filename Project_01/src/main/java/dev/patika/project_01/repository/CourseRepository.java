package dev.patika.project_01.repository;

import dev.patika.project_01.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    void deleteByName(String courseName);
}
