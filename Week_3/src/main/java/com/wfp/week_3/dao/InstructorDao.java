package com.wfp.week_3.dao;

public interface InstructorDao<Instructor>  extends BaseDAO<Instructor> {
    Instructor findByName(String name);

    void deleteByName(String name);
    Instructor updateByName(Instructor instructor, String name);

    void update(Instructor course, int id);
}
