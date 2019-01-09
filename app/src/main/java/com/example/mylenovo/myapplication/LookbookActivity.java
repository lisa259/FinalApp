package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class LookbookActivity extends AppCompatActivity {

    GridView GVLookbook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lookbook);
        GVLookbook = (GridView) findViewById(R.id.GVLookbook);
        GVLookbook.setOnItemClickListener(new EntryClickListener());
    }

    public void ClickInstellingen(View v){
        Intent intent = new Intent(this, InstellingenActivity.class);
        startActivity(intent);
    }

    public void ClickPlus(View v){
        Intent intent = new Intent(this, OutfitActivity.class);
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

    public void ClickVrienden(View v){
        Intent intent = new Intent(this, vriendenActivity.class);
        startActivity(intent);
    }

    private class EntryClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(LookbookActivity.this, OutfitActivity.class);
            startActivity(intent);
        }
    }
}
