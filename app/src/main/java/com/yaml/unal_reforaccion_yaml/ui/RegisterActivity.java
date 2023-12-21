package com.yaml.unal_reforaccion_yaml.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.yaml.unal_reforaccion_yaml.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button btnClickLogin = (Button) findViewById(R.id.btnNewUser);
        btnClickLogin.setOnClickListener(v -> {
            Intent loginView = new Intent(RegisterActivity.this, AddUserActivity.class);
            startActivity(loginView);
        });
    }
}