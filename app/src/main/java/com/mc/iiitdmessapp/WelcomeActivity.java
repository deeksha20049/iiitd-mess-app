package com.mc.iiitdmessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {
    Button userLoginBtn, adminLoginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_welcome);
        userLoginBtn = (Button) findViewById(R.id.userLoginBtn);
        userLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, TermsUserActivity.class);
                startActivity(intent);
            }
        });
        adminLoginBtn = (Button) findViewById(R.id.adminLoginBtn);
        adminLoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(WelcomeActivity.this, TermsAdminActivity.class);
                startActivity(intent);
            }
        });
    }
}