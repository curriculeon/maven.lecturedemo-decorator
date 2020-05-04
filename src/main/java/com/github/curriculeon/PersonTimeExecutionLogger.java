package com.github.curriculeon;

import com.github.git_leon.logging.SimpleLoggerInterface;

import java.util.Date;

/**
 * @author leonhunter
 * @created 05/04/2020 - 3:04 PM
 */
public class PersonTimeExecutionLogger extends PersonLoggerImpl {
    public PersonTimeExecutionLogger(SimpleLoggerInterface logger, PersonInterface personWhoInterceptsAndLogs) {
        super(logger, personWhoInterceptsAndLogs);
    }


    @Override
    public Integer getAge() {
        Long startTime = System.nanoTime();
        Integer age = getPersonInterface().getAge();
        Long endTime = System.nanoTime();
        Long deltaTime = endTime - startTime;
        getLogger().info("It took [ %s ] nanoseconds to execute `getAge`\n", deltaTime);
        return age;
    }

    @Override
    public void setAge(Integer newAge) {
        Long startTime = System.nanoTime();
        getPersonInterface().setAge(newAge);
        Long endTime = System.nanoTime();
        Long deltaTime = endTime - startTime;
        getLogger().info("It took [ %s ] nanoseconds to execute `setAge`\n", deltaTime);
    }

    @Override
    public String getName() {
        Long startTime = System.nanoTime();
        String name = getPersonInterface().getName();
        Long endTime = System.nanoTime();
        Long deltaTime = endTime - startTime;
        getLogger().info("It took [ %s ] nanoseconds to execute `getName`\n", deltaTime);
        return name;
    }

    @Override
    public void setName(String newName) {
        Long startTime = System.nanoTime();
        getPersonInterface().setName(newName);
        Long endTime = System.nanoTime();
        Long deltaTime = endTime - startTime;
        getLogger().info("It took [ %s ] nanoseconds to execute `setName`\n", deltaTime);
    }

    @Override
    public Date getDateOfBirth() {
        Long startTime = System.nanoTime();
        Date date = getPersonInterface().getDateOfBirth();
        Long endTime = System.nanoTime();
        Long deltaTime = endTime - startTime;
        getLogger().info("It took [ %s ] nanoseconds to execute `getDateOfBirth`\n", deltaTime);
        return date;
    }

    @Override
    public void setDateOfBirth(Date dateOfBirth) {
        getPersonInterface().setDateOfBirth(dateOfBirth);
    }
}
