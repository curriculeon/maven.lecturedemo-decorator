package com.github.curriculeon;

import com.github.git_leon.logging.SimpleLoggerInterface;

/**
 * @author leonhunter
 * @created 05/04/2020 - 2:46 PM
 */
public class PersonLoggerImpl implements PersonLoggerInterface {
    SimpleLoggerInterface logger;
    PersonInterface decoratee;

    public PersonLoggerImpl(SimpleLoggerInterface logger, PersonInterface decoratee) {
        this.logger = logger;
        this.decoratee = decoratee;
        logger.enable();
    }

    @Override
    public SimpleLoggerInterface getLogger() {
        return logger;
    }

    @Override
    public PersonInterface getPersonInterface() {
        return decoratee;
    }
}
