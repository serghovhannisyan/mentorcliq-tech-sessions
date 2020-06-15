package com.mentorcliq.runner;

import com.mentorcliq.patterns.decorator.DecoratorRunner;
import com.mentorcliq.patterns.template.TemplateRunner;

public class PatternRunnerFactory {

    public static PatternRunner createPatternRunner(Pattern pattern) {
        switch (pattern) {
            case DECORATOR:
                return new DecoratorRunner();
            case TEMPLATE:
                return new TemplateRunner();
            default:
                throw new RuntimeException("Unknown pattern implementation " + pattern);
        }
    }
}
