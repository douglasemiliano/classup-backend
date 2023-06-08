package com.classup.api.controllers;

import com.classup.api.models.Classroom;
import com.classup.api.models.Lesson;
import com.classup.api.service.ClassroomService;
import com.classup.api.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/lesson")
public class LessonController {

    @Autowired
    private LessonService lessonService;

    @GetMapping
    public ResponseEntity<List<Lesson>> getAll(){
        return ResponseEntity.ok(lessonService.getAllLesson());
    }

    @PostMapping
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<Lesson> createLesson(@RequestBody Lesson lesson){
        System.err.println(lesson.getStudentsCompleted());
        return ResponseEntity.ok(lessonService.createLesson(lesson));
    }
}
