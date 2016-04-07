package com.mycompany.myapp.web.rest.dto;

import java.io.Serializable;
import java.util.Objects;


/**
 * A DTO for the Driver entity.
 */
public class DriverDTO implements Serializable {

    private Long id;

    private String firstName;


    private String lastName;


    private String phone;


    private String address;


    private String mail;


    private Integer age;


    private Integer experience;


    private Integer exp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }
    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        DriverDTO driverDTO = (DriverDTO) o;

        if ( ! Objects.equals(id, driverDTO.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "DriverDTO{" +
            "id=" + id +
            ", firstName='" + firstName + "'" +
            ", lastName='" + lastName + "'" +
            ", phone='" + phone + "'" +
            ", address='" + address + "'" +
            ", mail='" + mail + "'" +
            ", age='" + age + "'" +
            ", experience='" + experience + "'" +
            ", exp='" + exp + "'" +
            '}';
    }
}
