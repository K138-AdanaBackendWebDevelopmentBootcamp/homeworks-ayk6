package com.wfp.week_3.services;

import com.wfp.week_3.dao.InstructorDao;
import com.wfp.week_3.model.Instructor;
import com.wfp.week_3.model.Student;

import java.util.List;

public class InstructorServiceImp implements InstructorService<Instructor>{
    InstructorDao<Instructor> instructorDao;

    public InstructorServiceImp(InstructorDao<Instructor> instructorDao) {
        this.instructorDao = instructorDao;
    }

    @Override
    public List<Instructor> findAll() {
        return instructorDao.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return instructorDao.findById(id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        return instructorDao.save(instructor);
    }

    @Override
    public void deleteById(int id) {
        instructorDao.deleteByID(id);
    }

    @Override
    public void update(Student course, int id) {

    }

    @Override
    public void update(Instructor course, int id) {
        instructorDao.update(course,id);
    }

    @Override
    public Instructor findByID(int id) {
        return instructorDao.findById(id);
    }

    @Override
    public void deleteByID(int id) {
        instructorDao.deleteByID(id);
    }
}
