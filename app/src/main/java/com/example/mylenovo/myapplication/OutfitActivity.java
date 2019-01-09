package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class OutfitActivity extends AppCompatActivity {

    GridView GVOutfit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfit);
        GVOutfit = (GridView) findViewById(R.id.GVOutfit);
        GVOutfit.setOnItemClickListener(new EntryClickListener());
    }

    public void ClickPlus2(View v){
        Intent intent = new Intent(this, OutfititemActivity.class);
        startActivity(intent);
    }

    public void ClickVerwijderen2(View v){
        // Verwijder
        onBackPressed();
    }

    private class EntryClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(OutfitActivity.this, ItemActivity.class);
            startActivity(intent);
        }
    }
}
