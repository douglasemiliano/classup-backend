package com.classup.api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Getter
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Long idProfessor;
    private Long idClassroom;
    private Date createdAt;
    private String deliveryDate;
    private Long badgeId;
    private Integer points;
    private String urlEvidence;
    @ManyToMany
    private List<User> studentsCompleted;



}
