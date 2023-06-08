package com.classup.api.service;

import com.classup.api.models.Classroom;
import com.classup.api.repository.ClassroomRepository;
import com.classup.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private ClassroomRepository classroomRepository;

    @Autowired
    private UserRepository userRepository;

    public List<Classroom> getAllClassroom(){
        List<Classroom> classroomList = classroomRepository.findAll();
        return classroomList;
    }

    public Classroom createClassroom(Classroom classroom){
        if(classroom == null) return null;
        return classroomRepository.save(classroom);
    }
}
