package com.example.carticketing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        String input = getIntent().getStringExtra("Uname");
        ((TextView) findViewById(R.id.textView3)).setText("Willkommen " + input);

        findViewById(R.id.recyclerView).setVisibility(View.INVISIBLE);

        findViewById(R.id.button).setOnClickListener((v) -> {
            toggleVisibility();
        });

        ArrayList<violation> violations = new ArrayList<>();
        violations.add(new violation("Yami", "Type your description here"));
        violations.add(new violation("Yamii", "Type your description here"));
        violations.add(new violation("Yamiii", "Type your description here"));


        recyclerView = findViewById(R.id.recyclerView);
        lm = new LinearLayoutManager(this);
        adapter = new ViolationAdapter(violations, (violation, position) -> {
            ViolationDetailsDialog dialog = new ViolationDetailsDialog(violation);
            dialog.show(getSupportFragmentManager(), "");
        });

        recyclerView.setHasFixedSize(true);


        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);


    }

    private void toggleVisibility() {
        View view = findViewById(R.id.recyclerView);
        view.setVisibility(view.getVisibility() == View.VISIBLE ? View.INVISIBLE : View.VISIBLE);
    }




}