package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class CategorieActivity extends AppCompatActivity {

    GridView GVCategorie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
        GVCategorie = (GridView) findViewById(R.id.GVCategorie);
        GVCategorie.setOnItemClickListener(new EntryClickListener());
    }

    public void ClickItemToevoegen(View v){
        Intent intent = new Intent(this, NieuwItemActivity.class);
        startActivity(intent);
    }

    private class EntryClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(CategorieActivity.this, ItemActivity.class);
            startActivity(intent);
        }
    }
}
