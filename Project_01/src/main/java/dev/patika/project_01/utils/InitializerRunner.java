package dev.patika.project_01.utils;


import dev.patika.project_01.model.Course;
import dev.patika.project_01.model.Instructor;
import dev.patika.project_01.model.Student;
import dev.patika.project_01.repository.CourseRepository;
import dev.patika.project_01.repository.InstructorRepository;
import dev.patika.project_01.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Component
public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    private final CourseRepository courseRepository;
    private final InstructorRepository instructorRepository;
    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public void run(String... args) throws Exception {

        courseRepository.deleteAll();
        studentRepository.deleteAll();
        instructorRepository.deleteAll();

        // student, instructor ve course oluşturulabilir
        // Student student1 = new Student(001L,"hamit","01.01","bağcılar","m");
        // Instructor inst1 = new Instructor("önder","esenyurt","3141592");
        //Course course1 = new Course("mat",102,4.00);

        // inst, student ve course arasında atamalar yapılabilir
        // course1.serCourse(student1);

        logger.info("All data saved.");
    }
}
