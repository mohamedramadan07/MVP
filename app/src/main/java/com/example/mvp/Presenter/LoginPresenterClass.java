package com.example.mvp.Presenter;

import com.example.mvp.Model.User;
import com.example.mvp.View.LoginView;

public class LoginPresenterClass implements  LoginPresenter{

    public LoginPresenterClass(LoginView loginView) {
        this.loginView = loginView;
    }

    LoginView loginView;
    @Override
    public void onLogin(String email, String password) {
        User user = new User(email, password);
        boolean isLoginSuccess= user.isVaildData();

        if(isLoginSuccess) {
            loginView.onLoginResults("Login Success");
        }
        else {
            loginView.onLoginResults("Login Error");
        }
    }
}
