package com.example.carticketing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.EditText;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");
        b = findViewById(R.id.b);
        b1 = findViewById(R.id.b1);




    }
    public void handleText(View v) {
        EditText t = findViewById(R.id.et1);
        String input = t.getText().toString();

        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }


        Intent intent;

        public void returnerClick(View v){

            if(v==b)
                intent = new Intent(this, LoginActivity.class);
            else if (v==b1)
                intent = new Intent(this, RegisterActivity.class);


            startActivity(intent);
        }


}