package com.example.retrofitappcodingshef.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.retrofitappcodingshef.R;

public class Login_Activity extends AppCompatActivity implements View.OnClickListener {

    EditText etLoginEmail, etLoginPassword;
    Button btnLogin;
    TextView registerLinkTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etLoginEmail = findViewById(R.id.etLoginEmail);
        etLoginPassword = findViewById(R.id.etLoginPassword);
        registerLinkTv = findViewById(R.id.registerLinkTv);
        btnLogin = findViewById(R.id.btnLogin);
        //   registerLinkTv.setOnClickListener((View.OnClickListener) this);
        //       btnLogin.setOnClickListener((View.OnClickListener) this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnLogin:
                startActivity(new Intent(Login_Activity.this, Home_Activity.class));
                break;
            case R.id.registerLinkTv:
                switchOnRegister();
                break;
        }
    }


    private void switchOnRegister() {
        Intent intent = new Intent(Login_Activity.this, MainActivity.class);
        startActivity(intent);
    }
}

