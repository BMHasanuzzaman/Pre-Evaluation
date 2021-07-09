package com.example.restservice.models.user;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**Reg_id, institution_id,student_id/teacher_id,
 * first_name,last_name, reg_date, date_of_birth,
 * age, gender, NID, occupation,
 * address  (can be present address / permanent address and
 * splitted into different granularities e.g. street, post_office, upazila,
 * district, division), contact_no (may be multiple),
 * email, photo, created_on, created_by,
 * academic_qulifications(degree,
 *  institute, completion year, grade, etc)*/

@Entity
@Table(name="registration")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="reg_id")
    private String regid;

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

    @Column(name="nid")
    private String nid;

    @Column(name="occupation")
    private String occupation;

    @Column(name="address")
    private String address;

    public User() {
    }

    public User(String regid, String institution_id, String f_name,
                String l_name, Date date, Date date_of_birth,
                String gender, String nid, String occupation,
                String address)
    {
        this.regid = regid;
        this.institution_id = institution_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.date = date;
        this.date_of_birth = date_of_birth;
        this.gender = gender;
        this.nid = nid;
        this.occupation = occupation;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReg_id() {
        return regid;
    }

    public void setReg_id(String reg_id) {
        this.regid = reg_id;
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

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", reg_id='" + regid + '\'' +
                ", institution_id='" + institution_id + '\'' +
                ", f_name='" + f_name + '\'' +
                ", l_name='" + l_name + '\'' +
                ", date=" + date +
                ", date_of_birth=" + date_of_birth +
                ", gender='" + gender + '\'' +
                ", nid='" + nid + '\'' +
                ", occupation='" + occupation + '\'' +
                ", address=" + address +
                '}';
    }
}
