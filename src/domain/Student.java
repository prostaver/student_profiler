/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;

/**
 * The object representation of student table.
 * @author prostaver
 */
public class Student {
    Integer id;
    String name;
    Date birthdate;
    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getAge() {
        int age = 0;
        Date date = new Date();
        age = date.getYear() - birthdate.getYear();
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder string;
        string = new StringBuilder("Student [id=").append(id)
                .append(", name=").append(name).append(", birthdate=").append(birthdate)
                .append(", address").append(address);
        return string.toString();
    }
    
    
}
