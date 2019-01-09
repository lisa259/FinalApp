package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class VriendWishlistActivity extends AppCompatActivity {

    GridView GVWishlistV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vriend_wishlist);
        GVWishlistV = (GridView) findViewById(R.id.GVWishlistV);
        GVWishlistV.setOnItemClickListener(new ClickListener());
    }

    public void ClickHome(View v){
        Intent intent = new Intent(this, garderobeActivity.class);
        startActivity(intent);
    }

    public void ClickLookbookV(View v){
        Intent intent = new Intent(this, VriendLookbookActivity.class);
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
            Intent intent = new Intent(VriendWishlistActivity.this, CategorieActivity.class);
            startActivity(intent);
        }
    }
}
