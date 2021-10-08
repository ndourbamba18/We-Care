package org.spring.we_care.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true, length = 50, nullable = false)
    private String code;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true, length = 50, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String gender;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private LocalDate birth;

    @Column(unique = true, nullable = false)
    private Long phone;

    @Column(unique = true)
    private String email;

    @Column(unique = true, nullable = true)
    private int pinCode;

    @ManyToOne
    private Profile profile;

    @ManyToOne
    private Speciality speciality;

    @ManyToOne
    private City city;

    @OneToMany(mappedBy = "user")
    private List<Apppointment> appointments;

    @OneToMany(mappedBy = "coach")
    private List<Apppointment> schedules;
}