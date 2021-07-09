package com.example.restservice.models.user;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="addr_id")
    private String addr_id;

    @Column(name="street")
    private String street;

    @Column(name="post_office")
    private String post_office;

    @Column(name="upazila")
    private String upazila;

    @Column(name="district")
    private String district;

    @Column(name="division")
    private String division;

    public Address() {
    }

    public Address(String addr_id, String street, String post_office,
                   String upazila, String district, String division) {
        this.addr_id = addr_id;
        this.street = street;
        this.post_office = post_office;
        this.upazila = upazila;
        this.district = district;
        this.division = division;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddr_id() {
        return addr_id;
    }

    public void setAddr_id(String addr_id) {
        this.addr_id = addr_id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPost_office() {
        return post_office;
    }

    public void setPost_office(String post_office) {
        this.post_office = post_office;
    }

    public String getUpazila() {
        return upazila;
    }

    public void setUpazila(String upazila) {
        this.upazila = upazila;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addr_id='" + addr_id + '\'' +
                ", street='" + street + '\'' +
                ", post_office='" + post_office + '\'' +
                ", upazila='" + upazila + '\'' +
                ", district='" + district + '\'' +
                ", division='" + division + '\'' +
                '}';
    }
}
