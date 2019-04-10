package com.example.keshar.registerloginauthenticationfirebase;

import android.text.TextUtils;
import android.widget.EditText;

public  class ValidationCheck {
    public static boolean isValid(String value, EditText editText){
        boolean isValid=false;

        if(!TextUtils.isEmpty(value))
            isValid=true;
        else {
            isValid=false;
            editText.setError("Required...");


        }
        return isValid;

    }

}
