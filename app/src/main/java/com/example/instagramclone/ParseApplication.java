package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("A8quukz0TfeCH8yc9nlZyBQV9Aq42jCn92rSg2Se")
                .clientKey("sfbxikZNnU3XjRTG0ojQTW1rybAUfamEmMqAQ4Id")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
