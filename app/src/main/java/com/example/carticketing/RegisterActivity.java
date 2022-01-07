package com.example.carticketing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.channels.InterruptedByTimeoutException;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }
    /*public void handleText(View v) {
        EditText t = findViewById(R.id.et1);
        String input = t.getText().toString();
        ((TextView) findViewById(R.id.et2)).setText(input);
        Toast.makeText(this, input, Toast.LENGTH_LONG).show();
    }*/


    public void onClick(View v){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void launch(View v){
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
}
}