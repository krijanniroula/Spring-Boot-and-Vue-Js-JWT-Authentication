package com.npksahakari.system.models;

import com.npksahakari.system.enumconstants.GenderType;
import com.npksahakari.system.enumconstants.MaritalType;
import com.npksahakari.system.enumconstants.Status;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.sql.Date;

@Entity
@Table(name = "share_member",uniqueConstraints = {
        @UniqueConstraint(columnNames = "loanAccountNumber")
}
)
//@EntityListeners(AuditingEntityListener.class)
//@JsonIgnoreProperties(allowGetters = true)
public class ShareMember extends BaseEntity{


    @Column(name = "share_no")
    private String shareNo;
    @Column(name = "amount_paid")
    private Double amountPaid;
    @Column(name = "extra_amount",nullable = true)
    private Double extraAmount;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "middle_name",nullable = true)
    private String middleName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "mobile")
    private String mobile;
    @Column(name = "alt_contact_no",nullable = true)
    private String altContactNo;

    @Column(name = "gender_type")
    private GenderType genderType;
    @Column(name = "marital_type")
    private MaritalType maritalType;
    @Column(name = "status",columnDefinition = "DEFAULT 'ACTIVE'")
    private Status status;

    @Column(name = "country",nullable = true)
    private String country;
    @Column(name = "provision",nullable = true)
    private String provision;
    @Column(name = "district",nullable = true)
    private String district;
    @Column(name = "municipal",nullable = true)
    private String municipal;
    @Column(name = "house_no",nullable = true)
    private String houseNo;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;
    @Column(name = "age")
    private Integer age;
    @Column(name = "father_name")
    private String fatherName;
    @Column(name = "mother_name")
    private String motherName;
    @Column(name = "grand_father_name",nullable = true)
    private String grandFatherName;
    @Column(name = "alt_person",nullable = true)
    private String altPerson;
    @Column(name = "citizenship_no")
    private String citizenshipNo;

    public String getShareNo() {
        return shareNo;
    }

    public void setShareNo(String shareNo) {
        this.shareNo = shareNo;
    }

    public Double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Double getExtraAmount() {
        return extraAmount;
    }

    public void setExtraAmount(Double extraAmount) {
        this.extraAmount = extraAmount;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAltContactNo() {
        return altContactNo;
    }

    public void setAltContactNo(String altContactNo) {
        this.altContactNo = altContactNo;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    public MaritalType getMaritalType() {
        return maritalType;
    }

    public void setMaritalType(MaritalType maritalType) {
        this.maritalType = maritalType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getProvision() {
        return provision;
    }

    public void setProvision(String provision) {
        this.provision = provision;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMunicipal() {
        return municipal;
    }

    public void setMunicipal(String municipal) {
        this.municipal = municipal;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getGrandFatherName() {
        return grandFatherName;
    }

    public void setGrandFatherName(String grandFatherName) {
        this.grandFatherName = grandFatherName;
    }

    public String getAltPerson() {
        return altPerson;
    }

    public void setAltPerson(String altPerson) {
        this.altPerson = altPerson;
    }

    public String getCitizenshipNo() {
        return citizenshipNo;
    }

    public void setCitizenshipNo(String citizenshipNo) {
        this.citizenshipNo = citizenshipNo;
    }

    @Override
    public String toString() {
        return "ShareMember{" +
                "shareNo='" + shareNo + '\'' +
                ", amountPaid=" + amountPaid +
                ", extraAmount=" + extraAmount +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", altContactNo='" + altContactNo + '\'' +
                ", genderType=" + genderType +
                ", maritalType=" + maritalType +
                ", status=" + status +
                ", country='" + country + '\'' +
                ", provision='" + provision + '\'' +
                ", district='" + district + '\'' +
                ", municipal='" + municipal + '\'' +
                ", houseNo='" + houseNo + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", grandFatherName='" + grandFatherName + '\'' +
                ", altPerson='" + altPerson + '\'' +
                ", citizenshipNo='" + citizenshipNo + '\'' +
                '}';
    }
}
