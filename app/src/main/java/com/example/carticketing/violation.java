package com.example.carticketing;

import java.io.Serializable;

public class violation implements Serializable {

    private String mText1;
    private String mText2;
    private ViolationType type;

    public violation(String Text1,String Text2){
        mText1 = Text1;
        mText2 = Text2;

    }

    public String getText2(){
        return mText2;
    }

    public String getText1() {
        return mText1;
    }
}
