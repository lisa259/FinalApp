package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

public class VriendLookbookActivity extends AppCompatActivity {

    GridView GVLookbookV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vriend_lookbook);
        GVLookbookV = (GridView) findViewById(R.id.GVLookbookV);
        GVLookbookV.setOnItemClickListener(new ClickListener());
    }

    public void ClickHome(View v){
        Intent intent = new Intent(this, garderobeActivity.class);
        startActivity(intent);
    }

    public void ClickWishlistV(View v){
        Intent intent = new Intent(this, VriendWishlistActivity.class);
        startActivity(intent);
    }

    public void ClickVriendenV(View v){
        Intent intent = new Intent(this, VriendVriendenActivity.class);
        startActivity(intent);
    }

    public void ClickGarderobeV(View v){
        Intent intent = new Intent(this, VriendGarderobeActivity.class);
        startActivity(intent);
    }

    private class ClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(VriendLookbookActivity.this, OutfitActivity.class);
            startActivity(intent);
        }
    }
}
