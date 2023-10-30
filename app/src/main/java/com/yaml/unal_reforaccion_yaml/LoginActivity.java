package com.yaml.unal_reforaccion_yaml;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnClickLogin = (Button) findViewById(R.id.btnLogin);
        btnClickLogin.setOnClickListener(v -> {
            Intent loginView = new Intent(LoginActivity.this, HomeActivity.class);
            startActivity(loginView);
        });
        Button btnClickForgot = (Button) findViewById(R.id.btnForgotPassword);
        btnClickForgot.setOnClickListener(v -> {
            Intent forgotView = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
            startActivity(forgotView);
        });
        Button btnClickRegister = (Button) findViewById(R.id.btnRegister);
        btnClickRegister.setOnClickListener(v -> {
            Intent registerView = new Intent(LoginActivity.this, RegisterActivity.class);
            startActivity(registerView);
        });
    }
}