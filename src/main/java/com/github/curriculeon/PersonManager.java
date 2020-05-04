package com.github.curriculeon;

import java.util.Date;

/**
 * @author leonhunter
 * @created 05/04/2020 - 2:51 PM
 */
public class PersonManager {
    private PersonInterface personInterface;

    public PersonManager(PersonInterface personInterface) {
        this.personInterface = personInterface;
    }

    public void manipulatePerson() {
        personInterface.setName("Jack");
        personInterface.setAge(15);
        personInterface.setDateOfBirth(new Date());
    }
}
