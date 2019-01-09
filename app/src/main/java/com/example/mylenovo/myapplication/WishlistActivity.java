package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class WishlistActivity extends AppCompatActivity {

    GridView GVWishlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        GVWishlist = (GridView) findViewById(R.id.GVWishlist);
        GVWishlist.setOnItemClickListener(new ClickListener());
    }

    public void ClickInstellingen(View v){
        Intent intent = new Intent(this, InstellingenActivity.class);
        startActivity(intent);
    }

    public void ClickGarderobe(View v){
        Intent intent = new Intent(this, garderobeActivity.class);
        startActivity(intent);
    }

    public void ClickVrienden(View v){
        Intent intent = new Intent(this, vriendenActivity.class);
        startActivity(intent);
    }

    public void ClickLookbook(View v){
        Intent intent = new Intent(this, LookbookActivity.class);
        startActivity(intent);
    }

    private class ClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(WishlistActivity.this, CategorieActivity.class);
            startActivity(intent);
        }
    }
}
