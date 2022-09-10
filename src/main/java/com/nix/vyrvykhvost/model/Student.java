package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class Student extends Human{

    private LocalDateTime time;

    public Student(){
        mark = null;
    }

    public Student(String firstName,String lastName, int age){
        super(firstName,lastName,age);
        this.time = LocalDateTime.now();
    }

    @OneToOne(mappedBy ="student")
    private Mark mark;

    @ManyToOne
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
