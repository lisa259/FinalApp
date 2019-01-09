package com.example.mylenovo.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NieuwItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nieuw_item);
    }

    public void ClickUpload2(View v){
        // Open gallerij
    }

    public void ClickToevoegen2(View v){
        // Opslaan in database
        onBackPressed();
    }
}
