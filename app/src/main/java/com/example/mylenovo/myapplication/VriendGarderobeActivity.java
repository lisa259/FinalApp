package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class VriendGarderobeActivity extends AppCompatActivity {

    ListView LVGarderobeV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vriend_garderobe);
        LVGarderobeV = (ListView) findViewById(R.id.LVGarderobeV);
        LVGarderobeV.setOnItemClickListener(new ClickListener());
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

    public void ClickLookbookV(View v){
        Intent intent = new Intent(this, VriendLookbookActivity.class);
        startActivity(intent);
    }

    private class ClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(VriendGarderobeActivity.this, CategorieActivity.class);
            startActivity(intent);
        }
    }
}
