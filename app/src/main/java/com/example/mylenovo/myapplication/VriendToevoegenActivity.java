package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VriendToevoegenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vriend_toevoegen);
    }

    public void ClickToevoegen2(View v){
        Intent intent = new Intent(this, vriendenActivity.class);
        startActivity(intent);
    }
}
