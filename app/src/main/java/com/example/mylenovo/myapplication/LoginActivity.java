package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.json.JSONArray;

public class LoginActivity extends AppCompatActivity {

    LoginHelper request;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        request = new LoginHelper(this);
        request.getLogins(this);
    }

    @Override
    public void gotLogins(JSONArray scores) {
        // do something
    }

    @Override
    public void gotLoginsError(String message){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }



    public void ClickLogin(View v){
        Intent intent = new Intent(this, garderobeActivity.class);
        startActivity(intent);
    }

    public void ClickAanmelden1(View v){
        Intent intent = new Intent(this, RegistreerActivity.class);
        startActivity(intent);
    }


}
