package com.bharath.vitsubjecttotal;

import android.app.Application;



public class CustomFontApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT", "fonts/firasans_medium.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "fonts/firasans_medium.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "fonts/firasans_medium.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "fonts/firasans_medium.ttf");
    }
}