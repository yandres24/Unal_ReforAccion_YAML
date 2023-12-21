package com.yaml.unal_reforaccion_yaml.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.yaml.unal_reforaccion_yaml.R;

public class ForgotPasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
        Button btnClickLogin = (Button) findViewById(R.id.btnSendPassword);
        btnClickLogin.setOnClickListener(v -> {
            Intent loginView = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
            startActivity(loginView);
        });
    }
}