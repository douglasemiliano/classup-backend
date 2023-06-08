package com.classup.api.controllers;

import com.classup.api.models.Classroom;
import com.classup.api.service.ClassroomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private ClassroomService classroomService;

    @GetMapping
    public ResponseEntity<List<Classroom>> getAll(){
        return ResponseEntity.ok(classroomService.getAllClassroom());
    }
    @PostMapping
    @PreAuthorize("hasRole('USER') or hasRole('MODERATOR') or hasRole('ADMIN')")
    public ResponseEntity<Classroom> createClassroom(@RequestBody Classroom classroomRequestDto){
        System.err.println("TESTE");
        return ResponseEntity.ok(classroomService.createClassroom(classroomRequestDto));
    }
}
