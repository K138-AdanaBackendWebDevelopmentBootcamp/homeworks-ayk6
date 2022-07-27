package com.wfp.week_3.services;

import org.springframework.stereotype.Service;

@Service
public interface InstructorService<Instructor> extends BaseService<Instructor>{
    Instructor findByID(int id);
    void deleteByID(int id);
    void update(com.wfp.week_3.model.Instructor course, int id);
}
