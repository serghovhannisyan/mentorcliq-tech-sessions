package com.mentorcliq.patterns.decorator;

import com.mentorcliq.runner.PatternRunner;
import com.mentorcliq.patterns.decorator.model.Window;

public class DecoratorRunner implements PatternRunner {

    @Override
    public void run() {
        Window basic = WindowsStoreCompany
                .orderBasicWindow()
                .build();

        print(basic);

        Window basicWithVoiceIsolation = WindowsStoreCompany
                .orderBasicWindow()
                .withVoiceIsolation()
                .build();

        print(basicWithVoiceIsolation);

        Window premium = WindowsStoreCompany
                .orderPremiumWindow()
                .withUltraVioletRaysProtection()
                .withVoiceIsolation()
                .build();

        print(premium);
    }

    private void print(Window window) {
        System.out.println(window.getDescription());
        System.out.println(window.getPrice());
    }
}
