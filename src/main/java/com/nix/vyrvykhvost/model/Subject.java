package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Entity
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    private String name;

    @OneToOne(mappedBy = "subjectName")
    Mark subjectMark;

    public Subject(String name) {
        this.name = name;
    }

    @OneToOne(mappedBy = "subject")
    private Professor professor;
}
