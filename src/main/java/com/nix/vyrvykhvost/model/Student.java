package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDateTime time;
    @OneToMany(mappedBy = "student")
    private Set<Mark> gradeSet;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group groupId;

    @Override
    public String toString() {
        return "Student{" +
                ", id='" + id + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName=" + getLastName() +
                ", time=" + getTime() +
                ", group=" + groupId.getName() +
                '}';
    }
}
