package com.example.Admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.carticketing.LoginActivity;
import com.example.carticketing.MainActivity;
import com.example.carticketing.R;

import java.util.ArrayList;


public class AdminPanel extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ItemAdapter adapter;
    private RecyclerView.LayoutManager lm ;
    Intent intent;
    Intent intent2;
    Intent intent3;
    Intent intent4;
    Intent intent5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_panel);

        ArrayList<Item> List = new ArrayList<>();
        List.add(new Item(R.drawable.index,"De/Activate Driver"));
        List.add(new Item(R.drawable.add,"Add violation"));
        List.add(new Item(R.drawable.edit,"Show violations"));
        List.add(new Item(R.drawable.view,"View cars"));
        List.add(new Item(R.drawable.search,"Search"));

        recyclerView = findViewById(R.id.adminRecycler);
        lm = new LinearLayoutManager(this);
        adapter = new ItemAdapter(List);

        recyclerView.setHasFixedSize(true);

        intent = new Intent(this, AdminActivate.class);
        intent2 = new Intent (this, AdminAdd.class);
        intent3 = new Intent (this, AdminEdit.class);
        intent4 = new Intent (this, AdminShow.class);
        intent5 = new Intent (this, AdminSearch.class);
        recyclerView.setLayoutManager(lm);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(new ItemAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
               List.get(position);

               switch (position){
                   case 0:
                       startActivity(intent);
                       break;
                   case 1:
                       startActivity(intent2);
                       break;
                   case 2:
                       startActivity(intent3);
                       break;
                   case 3:
                       startActivity(intent4);
                       break;
                   case 4:
                       startActivity(intent5);
                       break;
                   default:
                       return;
               }


            }
        });
    }
    public void onPress(View view){
        Intent i= new Intent(this, MainActivity.class);
        startActivity(i);
    }
}