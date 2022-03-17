package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bio_Details extends AppCompatActivity {
 TextView name_txt,surname_txt,father_txt,village_txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio_details);
        binding();

        String name = getIntent().getStringExtra("n1");
        String surname = getIntent().getStringExtra("n2");
        String father = getIntent().getStringExtra("n3");
        String village = getIntent().getStringExtra("n4");


        name_txt.setText(name);
        surname_txt.setText(surname);
        father_txt.setText(father);
        village_txt.setText(village);
    }
    void binding()
    {
       name_txt= findViewById(R.id.name_txt);
       surname_txt= findViewById(R.id.surname_txt);
        father_txt=findViewById(R.id.father_txt);
        village_txt=findViewById(R.id.village_txt);

    }
}