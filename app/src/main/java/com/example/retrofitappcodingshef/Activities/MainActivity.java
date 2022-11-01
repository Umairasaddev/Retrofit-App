package com.example.retrofitappcodingshef.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitappcodingshef.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView loginLinkTv;
    EditText nameEt, emailEt, passwordEt;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        nameEt = findViewById(R.id.etName);
        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        loginLinkTv = findViewById(R.id.loginLinkTv);
        btnRegister = findViewById(R.id.btnRegister);

        //  loginLinkTv.setOnClickListener(this);

        //    btnRegister.setOnClickListener(this);

        //     btnRegister.setOnClickListener(new View.OnClickListener() {
    }
    @Override
    public void onClick(View view){

            switch (view.getId()) {
                case R.id.btnRegister:
                    Intent intent = new Intent(MainActivity.this, Login_Activity.class);
                    startActivity(intent);
                    break;

                case R.id.loginLinkTv:
                    switchOnLogin();
            }

        }


    private void switchOnLogin() {

        Intent intent = new Intent(MainActivity.this, Login_Activity.class);
        startActivity(intent);
    }
}

