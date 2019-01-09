package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class vriendenActivity extends AppCompatActivity {

    GridView GVVrienden;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vrienden);
        GVVrienden = (GridView) findViewById(R.id.GVVrienden);
        GVVrienden.setOnItemClickListener(new VriendClickListener());
    }

    public void ClickInstellingen(View v){
        Intent intent = new Intent(this, InstellingenActivity.class);
        startActivity(intent);
    }

    public void ClickGarderobe(View v){
        Intent intent = new Intent(this, garderobeActivity.class);
        startActivity(intent);
    }

    public void ClickWishlist(View v){
        Intent intent = new Intent(this, WishlistActivity.class);
        startActivity(intent);
    }

    public void ClickLookbook(View v){
        Intent intent = new Intent(this, LookbookActivity.class);
        startActivity(intent);
    }

    private class VriendClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(vriendenActivity.this, VriendGarderobeActivity.class);
            startActivity(intent);
        }
    }
}
