package com.github.curriculeon;

import com.github.git_leon.logging.SimpleLogger;

import java.util.Date;

public class MyObject implements Runnable {
    public void run() {
        System.out.println("Running 1");
        System.out.println(new String(new char[20]).replaceAll("\0", "-"));
        run1();

        System.out.println(new String(new char[20]).replaceAll("\0", "-"));
        System.out.println(new String(new char[20]).replaceAll("\0", "-"));
        System.out.println(new String(new char[20]).replaceAll("\0", "-"));

        System.out.println("Running 2");
        System.out.println(new String(new char[20]).replaceAll("\0", "-"));
        run2();
    }


    public void run1() {
        PersonImpl person = new PersonImpl(27, "Leon",  new Date());
        PersonLoggerImpl personWhoInterceptsAndLogs = new PersonLoggerImpl(new SimpleLogger("Name of logger"), person);
        PersonLoggerImpl personWhoInterceptsAndLogsLoggingExecutionTime = new PersonTimeExecutionLogger(personWhoInterceptsAndLogs.logger, personWhoInterceptsAndLogs);
        PersonManager personManager = new PersonManager(personWhoInterceptsAndLogsLoggingExecutionTime);
        personManager.manipulatePerson();
    }

    public void run2() {
        PersonImpl person = new PersonImpl(27, "Leon",  new Date());
        PersonLoggerImpl personWhoInterceptsAndLogsLoggingExecutionTime = new PersonTimeExecutionLogger(new SimpleLogger("Name of logger"), person);
        PersonLoggerImpl personWhoInterceptsAndLogs = new PersonLoggerImpl(personWhoInterceptsAndLogsLoggingExecutionTime.logger, personWhoInterceptsAndLogsLoggingExecutionTime);
        PersonManager personManager = new PersonManager(personWhoInterceptsAndLogs);
        personManager.manipulatePerson();
    }
}
