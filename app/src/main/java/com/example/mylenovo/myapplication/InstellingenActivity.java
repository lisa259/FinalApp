package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InstellingenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instellingen);
    }

    public void ClickUpload(View v){
        // Open gallerij
    }

    public void ClickOpslaan(View v){
        onBackPressed();
    }
}
