package com.example.Admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.carticketing.R;

import java.util.ArrayList;

public class AdminShow extends AppCompatActivity {
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_show);
        lv = findViewById(R.id.lv);
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Ferrari");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");

        cars.add("Ferrari");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");

        cars.add("Ferrari");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");

        cars.add("Ferrari");
        cars.add("Audi");
        cars.add("BMW");
        cars.add("Mercedes");

        ArrayAdapter aa = new ArrayAdapter(this,R.layout.cars, cars);
        lv.setAdapter(aa);

    }
}