package com.mentorcliq.patterns.template;

import com.mentorcliq.run.PatternRunner;

public class TemplateRunner implements PatternRunner {

    @Override
    public void run() {
        ConstructionCompany constructionCompany = new ConstructionCompany();

        constructionCompany.createBusinessCenter();
        constructionCompany.createResidentialComplex();
    }
}
