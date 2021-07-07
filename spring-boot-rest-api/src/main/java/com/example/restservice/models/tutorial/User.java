package com.example.restservice.models.tutorial;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "institution_id")
    private String institution_id;

    @Column(name = "f_name")
    private String f_name;

    @Column(name = "l_name")
    private String l_name;

    @Column(name= "date")
    private Date date;

    @Column(name="date_of_birth")
    private Date date_of_birth;

    @Column(name="gender")
    private String gender;

    public User() {

    }

    public User(String institution_id, String f_name, String l_name, Date date, Date date_of_birth, String gender) {
        this.institution_id = institution_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.date = date;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstitution_id() {
        return institution_id;
    }

    public void setInstitution_id(String institution_id) {
        this.institution_id = institution_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", institution_id='" + institution_id + '\'' +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", date=" + date +
                ", date_of_birth=" + date_of_birth +
                ", gender='" + gender + '\'' +
                '}';
    }
}
