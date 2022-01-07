package com.example.Admin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.carticketing.R;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder> {
    private ArrayList<Item> List;
    private OnItemClickListener mlistener;
    public interface OnItemClickListener{
        void onItemClick(int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener){
        mlistener = listener;
    }

    public ItemAdapter(ArrayList<Item> items) {
        List = items;
    }

    public static class ItemViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public ImageView imageView;
        public TextView text2;



        public ItemViewHolder(View itemView,final OnItemClickListener listener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            text2 = itemView.findViewById(R.id.vio8);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) ;
                        listener.onItemClick(position);
                    }
                }
            });
        }

        @Override
        public void onClick(View view) {

        }
    }

    @Override
    public ItemViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false );
        ItemViewHolder ivh = new ItemViewHolder(v,mlistener);
        return ivh;
    }

    @Override
    public void onBindViewHolder(ItemAdapter.ItemViewHolder holder, int position) {
        Item ci = List.get(position);

        holder.imageView.setImageResource(ci.getImage());
        holder.text2.setText(ci.getText2());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }


}
