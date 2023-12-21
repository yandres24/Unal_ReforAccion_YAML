package com.yaml.unal_reforaccion_yaml.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.yaml.unal_reforaccion_yaml.R;

import java.util.Objects;

public class TipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        setTittleToolbar();
    }

    public void setTittleToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.topAppBar);
        toolbar.setTitle(R.string.tittle_tips);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}