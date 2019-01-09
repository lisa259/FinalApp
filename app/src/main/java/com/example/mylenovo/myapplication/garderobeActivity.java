package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class garderobeActivity extends AppCompatActivity {

    ListView LVGarderobe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_garderobe);
        LVGarderobe = (ListView) findViewById(R.id.LVGarderobe);
        LVGarderobe.setOnItemClickListener(new EntryClickListener());
    }

    public void ClickInstellingen(View v){
        Intent intent = new Intent(this, InstellingenActivity.class);
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

    public void ClickLookbook(View v){
        Intent intent = new Intent(this, LookbookActivity.class);
        startActivity(intent);
    }

    private class EntryClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(garderobeActivity.this, CategorieActivity.class);
            startActivity(intent);
        }
    }
}
