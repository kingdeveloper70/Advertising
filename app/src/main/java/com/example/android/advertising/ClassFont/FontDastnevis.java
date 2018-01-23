package com.example.android.advertising.ClassFont;


import android.app.Application;

import com.example.android.advertising.R;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

public class FontDastnevis extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/ir.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}