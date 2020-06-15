package com.mentorcliq.patterns.decorator;

import com.mentorcliq.patterns.decorator.decoration.UltraVioletRaysProtection;
import com.mentorcliq.patterns.decorator.decoration.VoiceIsolation;
import com.mentorcliq.patterns.decorator.model.BasicWindow;
import com.mentorcliq.patterns.decorator.model.PremiumWindow;
import com.mentorcliq.patterns.decorator.model.Window;

public class WindowsStoreCompany {

//    private Window window;

    public static Builder orderBasicWindow() {
        return new Builder(new BasicWindow());
    }

    public static Builder orderPremiumWindow() {
        return new Builder(new PremiumWindow());
    }

    public static class Builder {

        private Window window;

        public Builder(Window window) {
            this.window = window;
        }

        public Window build() {
            return window;
        }

        public Builder withVoiceIsolation() {
            window = new VoiceIsolation(window);
            return this;
        }

        public Builder withUltraVioletRaysProtection() {
            window = new UltraVioletRaysProtection(window);
            return this;
        }
    }
}
