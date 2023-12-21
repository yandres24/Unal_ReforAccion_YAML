package com.yaml.unal_reforaccion_yaml.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.yaml.unal_reforaccion_yaml.R;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTittleToolbar();
        addListenersMenuImageButtons();
    }
    public void setTittleToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.topAppBar);
        toolbar.setTitle(R.string.tittle_home);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void addListenersMenuImageButtons(){
        ImageView menuTips = findViewById(R.id.img_menu_consejos);
        menuTips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tipsView = new Intent(HomeActivity.this, TipsActivity.class);
                startActivity(tipsView);
            }
        });

        ImageView menuStatistics = findViewById(R.id.img_menu_estadisticas);
        menuStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent statisticsView = new Intent(HomeActivity.this, StatisticsActivity.class);
                startActivity(statisticsView);
            }
        });

        ImageView menuTreePlanting = findViewById(R.id.img_menu_plantaciones);
        menuTreePlanting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent treePlantingView = new Intent(HomeActivity.this, AddTreePlantingActivity.class);
                startActivity(treePlantingView);
            }
        });

        ImageView menuChallenge = findViewById(R.id.img_menu_retos);
        menuChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent challengeView = new Intent(HomeActivity.this, ChallengeActivity.class);
                startActivity(challengeView);
            }
        });
    }
}