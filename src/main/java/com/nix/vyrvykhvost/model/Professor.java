package com.nix.vyrvykhvost.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
public class Professor extends Human {

    @OneToOne
    private Subject subject;


    public Professor(String firstName, String lastName, int age, Subject subject) {
        super(firstName, lastName, age);
        this.subject = subject;
    }

}
