package com.example.keshar.registerloginauthenticationfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class RegersterActivity extends AppCompatActivity {
    private EditText etEmail,etPassword;
    private Button btnRegister;
    private TextView backText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regerster);
        etEmail=findViewById(R.id.etemail);
        etPassword=findViewById(R.id.editText2);
        btnRegister=findViewById(R.id.btn_register);
        backText=findViewById(R.id.txt_back);


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegiserUser();
            }
        });

    }

    private void RegiserUser() {
        String email,password;
        email=etEmail.getText().toString().trim();
        password=etPassword.getText().toString().trim();

        if(ValidationCheck.isValid(email,etEmail) && ValidationCheck.isValid(password,etPassword)){

        }
    }
}
