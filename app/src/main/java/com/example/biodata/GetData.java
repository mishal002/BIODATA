package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GetData extends AppCompatActivity {
    // ID Building:
    EditText name_edt, surname_edt, father_edt, village_edt;
    Button submit_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);
        binding();
        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {
                    if (name_edt.getText().toString().length() <= 0) {
                        name_edt.setError("Enter The Name");
                    } else if (surname_edt.getText().toString().length() <= 0) {
                        surname_edt.setError("Surname");
                    } else if (father_edt.getText().toString().length() <= 0) {
                        father_edt.setError("Father Name");
                    } else if (village_edt.getText().toString().length() <= 0) {
                        village_edt.setError("Village Name");
                    }
                    else {
                        String name = name_edt.getText().toString();
                        String surname = surname_edt.getText().toString();
                        String father = father_edt.getText().toString();
                        String village = village_edt.getText().toString();
                        Toast.makeText(GetData.this, name + "\n" + surname + "\n" + father + "\n" + village, Toast.LENGTH_LONG).show();

                        Intent intent = new Intent(GetData.this, Bio_Details.class);
                        intent.putExtra("n1", name);
                        intent.putExtra("n2", surname);
                        intent.putExtra("n3", father);
                        intent.putExtra("n4", village);
                        startActivity(intent);
                    }
                }
            }
        });

    }


    private void binding() {
        name_edt = findViewById(R.id.name_edt);
        surname_edt = findViewById(R.id.surname_edt);
        father_edt = findViewById(R.id.father_edt);
        village_edt = findViewById(R.id.village_edt);
        submit_btn = findViewById(R.id.submit_btn);

    }

}