package com.yaml.unal_reforaccion_yaml.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.yaml.unal_reforaccion_yaml.R;

public class ChallengeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge);
        setTittleToolbar();
    }

    public void setTittleToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.topAppBar);
        toolbar.setTitle(R.string.tittle_challenge);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}