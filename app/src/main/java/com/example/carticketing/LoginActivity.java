package com.example.carticketing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.Admin.AdminPanel;

public class LoginActivity extends AppCompatActivity {
    Button b;Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
         b = findViewById(R.id.button2);
         b1 = findViewById(R.id.button3);


    }
    Intent intent;
    public void launch(View v){
        if(v==b){
        intent = new Intent(this,HomeActivity.class);
        EditText t = findViewById(R.id.editTextTextPersonName);
        String input = t.getText().toString();
        intent.putExtra("Uname",input);
        }
        else if (v==b1) {
            intent = new Intent(this, AdminPanel.class);
        }
            startActivity(intent);

    }
}