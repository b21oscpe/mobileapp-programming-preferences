package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button button;
    SharedPreferences preferences;
    EditText edit_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edit_name = findViewById(R.id.editTextTextPersonName);
        preferences = getSharedPreferences("preferences", MODE_PRIVATE);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "Registered click");
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("name", edit_name.getText().toString());
                editor.apply();
            }
        });
    }
}