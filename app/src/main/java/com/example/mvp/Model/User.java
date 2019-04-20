package com.example.mvp.Model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements UserInterface {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public Boolean isVaildData() {
        return !TextUtils.isEmpty(getName())
                && Patterns.EMAIL_ADDRESS.matcher(getName()).matches()
                &&getPassword().length()>6;
    }
}
