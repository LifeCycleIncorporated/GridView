package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;

    private String[] countryNames;

    int[] flags = {R.drawable.america, R.drawable.austria, R.drawable.azerbaijan,
            R.drawable.canada, R.drawable.georgia, R.drawable.nepal, R.drawable.netherlands,
            R.drawable.red_crse, R.drawable.suriname, R.drawable.turkey,

            R.drawable.america, R.drawable.austria, R.drawable.azerbaijan,
            R.drawable.canada, R.drawable.georgia, R.drawable.nepal, R.drawable.netherlands,
            R.drawable.red_crse, R.drawable.suriname, R.drawable.turkey};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames = getResources().getStringArray(R.array.countryName);

        gridView = findViewById(R.id.gridViewId);

        AsadAdapter asadAdapter = new AsadAdapter(this, countryNames, flags);
        gridView.setAdapter(asadAdapter);
        
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = countryNames[i];
                Toast.makeText(MainActivity.this, value+" is Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}