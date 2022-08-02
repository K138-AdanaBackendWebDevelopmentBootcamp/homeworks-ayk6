package dev.patika.project_01.service;

import dev.patika.project_01.model.Instructor;
import dev.patika.project_01.repository.InstructorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorServiceImpl {

    @Autowired
    final InstructorRepository instructorRepository;

    @Transactional(readOnly = true)
    public List<Instructor> findAll() {
        List<Instructor> instructors = new ArrayList<>();
        Iterable<Instructor> instructorIterable = instructorRepository.findAll();
        instructorIterable.iterator().forEachRemaining(instructors::add);
        return instructors;
    }

    @Transactional
    public Instructor save(Instructor instructor){
        return instructorRepository.save(instructor);
    }

    @Transactional (readOnly = true)
    public Instructor findById(Long id){
        return instructorRepository.findById(id).get();
    }

    @Transactional
    public Instructor update(Instructor instructor){
        return instructorRepository.save(instructor);
    }

    @Transactional
    public void deleteById(Long id){
        instructorRepository.deleteById(id);
    }
    @Transactional
    public void deleteByName(String name) {instructorRepository.deleteByName(name);
    }

    public List<Instructor> findTop3BySalary(Long salary){
        return instructorRepository.findTop3BySalary(salary);
    }

    public List<Instructor> findBot3BySalary(Long salary){
        return instructorRepository.findBot3BySalary(salary);
    }

}
