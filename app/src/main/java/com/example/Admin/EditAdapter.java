package com.example.Admin;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.carticketing.R;

import java.util.ArrayList;


public class EditAdapter extends RecyclerView.Adapter<EditAdapter.EditViewHolder> {
    private ArrayList<Edit> Edits;
    private EditAdapter.OnItemClickListener mlistener;

    public interface OnItemClickListener {
        void onItemClick(int position, Edit edit);
    }

    public void setOnItemClickListener(EditAdapter.OnItemClickListener listener) {
        mlistener = listener;
    }

    public EditAdapter(ArrayList<Edit> es) {
        Edits = es;
    }

    public class EditViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView text1;
        public TextView text2;


        public EditViewHolder(View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.vio8);
            text2 = itemView.findViewById(R.id.vio9);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mlistener != null) {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION) ;
                        mlistener.onItemClick(position, Edits.get(position));
                    }
                }
            });
        }


        @Override
        public void onClick(View view) {


        }
    }


    @Override
    public EditViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.viols, parent, false);
        EditViewHolder evh = new EditViewHolder(v);
        return evh;

    }


    @Override
    public void onBindViewHolder(EditViewHolder holder, int position) {
        Edit ci = Edits.get(position);

        holder.text1.setText(ci.getText1());
        holder.text2.setText(ci.getText2());
    }

    @Override
    public int getItemCount() {
        return Edits.size();
    }
}
