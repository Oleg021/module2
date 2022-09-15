package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class Group {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;
    private String name;

    @OneToMany(mappedBy = "groupId")
    private List<Student> students;


    @Override
    public String toString() {
        return "Group{" +
                "id='" + id + '\'' +
                ", groupName='" + name + '\'' +
                ", students=" + students.size() +
                '}';
    }
}
