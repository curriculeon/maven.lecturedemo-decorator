package com.github.curriculeon;

import java.util.Date;

/**
 * @author leonhunter
 * @created 05/04/2020 - 1:39 PM
 */
public class PersonImpl implements PersonInterface {
    private Integer age;
    private String name;
    private Date dateOfBirth;

    public PersonImpl(Integer age, String name, Date dateOfBirth) {
        this.age = age;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public Integer getAge() {
        return age;
    }

    @Override
    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
