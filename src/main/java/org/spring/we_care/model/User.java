package org.spring.we_care.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
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

    public User() {
    }

    public User(String firstName, String lastName, String username, String password, String gender, LocalDate birth, Long phone, String email, int pinCode, Profile profile, City city, List<Apppointment> appointments) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.birth = birth;
        this.phone = phone;
        this.email = email;
        this.pinCode = pinCode;
        this.profile = profile;
        this.city = city;
        this.appointments = appointments;
    }

    public User(String firstName, String lastName, String username, String password, String gender, LocalDate birth,  Profile profile, Speciality speciality, List<Apppointment> schedules) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.birth = birth;
        this.profile = profile;
        this.speciality = speciality;
        this.schedules = schedules;
    }

    /**
     * @return int return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return String return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return String return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return String return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return String return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return LocalDate return the birth
     */
    public LocalDate getBirth() {
        return birth;
    }

    /**
     * @param birth the birth to set
     */
    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    /**
     * @return Long return the phone
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * @return String return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return int return the pinCode
     */
    public int getPinCode() {
        return pinCode;
    }

    /**
     * @param pinCode the pinCode to set
     */
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    /**
     * @return Profile return the profile
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * @param profile the profile to set
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * @return Speciality return the speciality
     */
    public Speciality getSpeciality() {
        return speciality;
    }

    /**
     * @param speciality the speciality to set
     */
    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    /**
     * @return City return the city
     */
    public City getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(City city) {
        this.city = city;
    }

    /**
     * @return List<Apppointment> return the appointments
     */
    public List<Apppointment> getAppointments() {
        return appointments;
    }

    /**
     * @param appointments the appointments to set
     */
    public void setAppointments(List<Apppointment> appointments) {
        this.appointments = appointments;
    }

    /**
     * @return List<Apppointment> return the schedules
     */
    public List<Apppointment> getSchedules() {
        return schedules;
    }

    /**
     * @param schedules the schedules to set
     */
    public void setSchedules(List<Apppointment> schedules) {
        this.schedules = schedules;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code, firstName, lastName, username, password, gender, birth, phone, email, pinCode, profile, speciality, city, appointments, schedules);
    }

}