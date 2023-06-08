package com.classup.api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "student_profile")
public class StudentProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String apelido;
    @ManyToMany
    private List<Lesson> lessons;
    @ManyToOne
    private Classroom classroom;
    @ManyToOne
    private User student;
    private Integer totalPoints;
    @ManyToMany
    private List<Badge> badges;



}
