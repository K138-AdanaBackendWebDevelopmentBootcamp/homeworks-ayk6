package com.wfp.week_3.dao;

public interface StudentDAO<Student> extends BaseDAO<Student> {
        Student findStudentByID(int id);
        void deleteStudentByID(int id);
        Student updateStudentByID(Student student, int id);
}
