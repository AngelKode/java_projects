package com.angelkode.employeeadmin.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@lombok.Getter
@lombok.Setter
@Entity
@NoArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @Column(nullable = false, updatable = false)
    private String companyCode;
    private String name;
    private String surname;
    private String email;
    private String jobTitle;
    private String imageURl;

    @Override
    public String toString() {
        return "Employee [\nid=" + id + ", \ncompanyCode=" + companyCode + ", \nname=" + name + ", \nsurname=" + surname + ", \nemail=" + email + ", \njobTitle=" + jobTitle + ", \nimageURl=" + imageURl + "\n]";
    }

}
