package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String code;
    private String name;
    @OneToOne
    @JoinColumn(name = "lector_id")
    private Professor professor;
    @OneToMany(mappedBy = "subjectName")
    private Set<Mark> marks;

    @Override
    public String toString() {
        return "Lesson{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
