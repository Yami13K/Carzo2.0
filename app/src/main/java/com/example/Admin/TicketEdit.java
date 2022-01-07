package com.example.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.EditText;

import com.example.carticketing.R;
import com.example.carticketing.violation;

public class TicketEdit extends AppCompatActivity {

    public static final String SERIALIZED_VIOLATION = "SERIALIZED_VIOLATION";
    public static final String VIOLATION_ID = "VIOLATION_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_edit);

         violation violation = (violation) getIntent().getExtras().get(SERIALIZED_VIOLATION);

        int violationId = getIntent().getExtras().getInt(VIOLATION_ID, -1);

        ((EditText) findViewById(R.id.editTextTextPersonName15)).setText(String.valueOf(violationId + 1));
    }
}