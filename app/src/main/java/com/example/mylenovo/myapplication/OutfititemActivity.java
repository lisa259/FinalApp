package com.example.mylenovo.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Spinner;

public class OutfititemActivity extends AppCompatActivity {

    Spinner SPItems;
    GridView GVItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfititem);
        SPItems = (Spinner) findViewById(R.id.SPItems);
        SPItems.setOnItemClickListener(new SPClickListener());
        GVItems = (GridView) findViewById((R.id.GVItems));
        GVItems.setOnItemClickListener(new GVListener());
    }

    private class SPClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            // Verander items in gridview
        }
    }

    private class GVListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            Intent intent = new Intent(OutfititemActivity.this, OutfitActivity.class);
            startActivity(intent);
        }
    }
}
