package com.github.curriculeon;

import com.github.git_leon.logging.SimpleLoggerInterface;

import java.util.Date;

/**
 * @author leonhunter
 * @created 05/04/2020 - 1:45 PM
 */
public interface PersonLoggerInterface extends PersonInterface {
    SimpleLoggerInterface getLogger();

    PersonInterface getPersonInterface();

    @Override
    default Integer getAge() {
        String name = getPersonInterface().getName();
        getLogger().info("Getting age of [ %s ]", name);
        Integer age = getPersonInterface().getAge();
        getLogger().info("Age of [ %s ] is [ %s ]", name, age);
        return age;
    }

    @Override
    default void setAge(Integer newAge) {
        String name = getPersonInterface().getName();
        Integer age = getPersonInterface().getAge();
        getLogger().info("Setting age of [ %s ] from [ %s ] to [ %s ]", name, age, newAge);
        getPersonInterface().setAge(newAge);
        getLogger().info("Age of [ %s ] is [ %s ]", age, newAge);
    }

    @Override
    default String getName() {
        String name = getPersonInterface().getName();
        getLogger().info("Getting name of [ %s ]", name);
        getLogger().info("Name of [ %s ] is [ %s ]", name, name);
        return name;
    }

    @Override
    default void setName(String newName) {
        String name = getPersonInterface().getName();
        getLogger().info("Setting name of [ %s ] from [ %s ] to [ %s ]", name, name, newName);
        getPersonInterface().setName(newName);
        getLogger().info("Name of [ %s ] is [ %s ]", name, name);
    }

    @Override
    default Date getDateOfBirth() {
        getLogger().info("Getting date of [ %s ]");
        String name = getPersonInterface().getName();
        Date date = getPersonInterface().getDateOfBirth();
        getLogger().info("Age of [ %s ] is [ %s ]", name, date);
        return date;
    }

    @Override
    default void setDateOfBirth(Date dateOfBirth) {
        getPersonInterface().setDateOfBirth(dateOfBirth);
    }
}
