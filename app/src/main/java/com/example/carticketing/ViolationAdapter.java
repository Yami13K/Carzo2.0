package com.example.carticketing;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;



public class ViolationAdapter extends RecyclerView.Adapter<ViolationAdapter.ViolationViewHolder> {
    private ArrayList<violation> violations;
    private final OnAction onItemClicked;
    public ViolationAdapter(ArrayList<violation> viols, OnAction onItemClicked){
        violations = viols;
        this.onItemClicked = onItemClicked;
    }
    public class ViolationViewHolder extends RecyclerView.ViewHolder {
        public TextView text1;
        public TextView text2;
        public Button b6;


        public ViolationViewHolder(View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.vio8);
            text2 = itemView.findViewById(R.id.vio9);
            b6 = itemView.findViewById(R.id.b6) ;


            Button pay = itemView.findViewById(R.id.imageView);
            pay.setOnClickListener((v) -> {
                v.setVisibility(View.GONE);
                itemView.setBackground(itemView.getContext().getDrawable(R.color.Green));
            });
        }

        public void onBind(violation violation, int position) {
            b6.setOnClickListener((v) -> {
                onItemClicked.onItemClick(violation, position);
            });
        }

    }


    @Override
    public ViolationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.violation,parent,false );
        ViolationViewHolder vvh = new ViolationViewHolder(v);
        return vvh;

    }



    @Override
    public void onBindViewHolder(ViolationViewHolder holder, int position) {
        violation ci = violations.get(position);

        holder.text1.setText(ci.getText1());
        holder.text2.setText(ci.getText2());

        holder.onBind(violations.get(position), position);
    }

    @Override
    public int getItemCount() {
        return violations.size();
    }

    interface OnAction {
        void onItemClick(violation violation, int position);
    }


}