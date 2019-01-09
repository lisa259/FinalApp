package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class VriendVriendenActivity extends AppCompatActivity {

    GridView GVVriendenV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vriend_vrienden);
        GVVriendenV = (GridView) findViewById(R.id.GVVriendenV);
        GVVriendenV.setOnItemClickListener(new ClickListener());
    }

    public void ClickHome(View v){
        Intent intent = new Intent(this, garderobeActivity.class);
        startActivity(intent);
    }

    public void ClickWishlistV(View v){
        Intent intent = new Intent(this, VriendWishlistActivity.class);
        startActivity(intent);
    }

    public void ClickLookbookV(View v){
        Intent intent = new Intent(this, VriendLookbookActivity.class);
        startActivity(intent);
    }

    public void ClickGarderobeV(View v){
        Intent intent = new Intent(this, VriendGarderobeActivity.class);
        startActivity(intent);
    }

    private class ClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(VriendVriendenActivity.this, VriendGarderobeActivity.class);
            startActivity(intent);
        }
    }
}
