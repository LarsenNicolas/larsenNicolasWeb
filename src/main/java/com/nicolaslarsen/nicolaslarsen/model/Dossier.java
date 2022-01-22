package com.nicolaslarsen.nicolaslarsen.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "portfolio")
public class Dossier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int phoneNumber;
    private String eMail;
    private Date dateOfBirth;
    private String locality;
    private String country;
    private String province;
    private String nationality;
// todo: use cv item to save here works experiece, couses and skills.

    public Dossier() { }

    public Dossier(String name, int phoneNumber, String eMail, Date dateOfBirth, String locality, String country, String province, String nationality) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.dateOfBirth = dateOfBirth;
        this.locality = locality;
        this.country = country;
        this.province = province;
        this.nationality = nationality;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
