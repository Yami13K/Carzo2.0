package com.example.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.icu.text.Edits;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.carticketing.R;
import com.example.carticketing.ViolationAdapter;
import com.example.carticketing.violation;

import java.util.ArrayList;

public class AdminEdit extends AppCompatActivity {
    private RecyclerView recyclerView;
    private EditAdapter adapter;
    private RecyclerView.LayoutManager lm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_edit);
        String m = "Select a Ticket to enable editing";
        Toast toast = Toast.makeText(this, m, Toast.LENGTH_LONG);
        View view = toast.getView();
        toast.show();
        ArrayList<Edit> Edits = new ArrayList<>();
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));
        Edits.add(new Edit("Type your description here", "Yami"));


        recyclerView = findViewById(R.id.rv);
        lm = new LinearLayoutManager(this);
        adapter = new EditAdapter(Edits);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);

        adapter.setOnItemClickListener((position, edit) -> {
            Intent i = new Intent(this, TicketEdit.class);

            Bundle bundle = new Bundle();

            violation editingViolation = new violation(edit.getText1(), edit.getText2());

            bundle.putSerializable(TicketEdit.SERIALIZED_VIOLATION, editingViolation.getText1());
            bundle.putInt(TicketEdit.VIOLATION_ID, position);

            i.putExtras(bundle);

            startActivity(i);
        });
    }
}