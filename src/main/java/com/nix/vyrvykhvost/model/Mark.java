package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Mark {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;

    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Subject subjectName;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    private int value;



}
