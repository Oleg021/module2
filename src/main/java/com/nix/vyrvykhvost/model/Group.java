package com.nix.vyrvykhvost.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity

@NamedNativeQueries({
        @NamedNativeQuery(name = "FIND_AVG_GRADE", query = """
                SELECT AVG(gr.value), s.groupid_id, g.name
                FROM Grade gr
                LEFT JOIN Student s on gr.student_id = s.id
                LEFT JOIN studentgroup g ON g.id = s.groupid_id
                Group by s.groupid_id, g.name
                """),
})
@ToString
public class Group {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    protected String id;
    
    private String name;

    public Group() {

    }
    @OneToMany(mappedBy = "groupId",
            cascade = {
                    CascadeType.PERSIST,CascadeType.MERGE },
            fetch = FetchType.EAGER)
    private List<Student> students = new ArrayList<>();

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

}
