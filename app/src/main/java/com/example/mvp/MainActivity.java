package com.example.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.example.mvp.Presenter.LoginPresenter;
import com.example.mvp.Presenter.LoginPresenterClass;
import com.example.mvp.View.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    EditText username,password;
    Button btn;

    LoginPresenter loginPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.email_field);
        password=findViewById(R.id.pass_field);
        btn=findViewById(R.id.btn_login);


        loginPresenter =  new LoginPresenterClass(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.onLogin(username.getText().toString(),password.getText().toString());
            }
        });
    }

    @Override
    public void onLoginResults(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
