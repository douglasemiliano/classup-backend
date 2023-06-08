package com.classup.api.models;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column (name = "professor")
    private Long professorId;

    @Column (name = "Studend")
    @ManyToMany
    private List<User> students;

}
