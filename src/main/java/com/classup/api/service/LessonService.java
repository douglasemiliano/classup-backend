package com.classup.api.service;

import com.classup.api.models.Lesson;
import com.classup.api.repository.LessonRepository;
import com.classup.api.security.services.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    @Autowired
    private UserDetailsServiceImpl userService;

    public List<Lesson> getAllLesson(){
        return lessonRepository.findAll();
    }

    public Lesson createLesson(Lesson lesson) {
        //validating
        if (lesson == null) return null;
        return lessonRepository.save(lesson);
    }

}
