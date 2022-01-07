package com.example.Admin;

import android.content.Intent;
import android.widget.ImageView;

public class Item {


        private int miv;
        private String mText2;

        public Item(int iv, String Text2){
            miv = iv;
            mText2 = Text2;

        }



        public String getText2(){
            return mText2;
        }

        public int getImage() {
            return miv;
        }
    }
