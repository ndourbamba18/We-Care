package org.spring.we_care.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Apppointment {
    
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private User coach;

    @Temporal(TemporalType.DATE)
    private LocalDate date;

    private String slot;

    public Apppointment() {
    }

    public Apppointment(User user, User coach, LocalDate date, String slot) {
        this.user = user;
        this.coach = coach;
        this.date = date;
        this.slot = slot;
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
     * @return User return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return User return the coach
     */
    public User getCoach() {
        return coach;
    }

    /**
     * @param coach the coach to set
     */
    public void setCoach(User coach) {
        this.coach = coach;
    }

    /**
     * @return LocalDate return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return String return the slot
     */
    public String getSlot() {
        return slot;
    }

    /**
     * @param slot the slot to set
     */
    public void setSlot(String slot) {
        this.slot = slot;
    }

}