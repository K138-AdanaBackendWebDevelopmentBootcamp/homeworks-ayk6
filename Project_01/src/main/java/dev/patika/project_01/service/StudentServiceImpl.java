package dev.patika.project_01.service;

import dev.patika.project_01.model.Student;
import dev.patika.project_01.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl {

    @Autowired
    final StudentRepository studentRepository;

    @Transactional (readOnly = true)
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        Iterable<Student> studentIterable = studentRepository.findAll();
        studentIterable.iterator().forEachRemaining(students::add);
        return students;
    }

    @Transactional
    public Student save(Student student) {

        return studentRepository.save(student);
    }

    @Transactional (readOnly = true)
    public Student findById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Transactional
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

    @Transactional
    public void deleteByName(String name) {studentRepository.deleteByName(name);
    }
}
