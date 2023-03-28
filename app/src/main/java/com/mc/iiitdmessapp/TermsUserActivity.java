package com.mc.iiitdmessapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TermsUserActivity extends AppCompatActivity {
    Button acpt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_terms_user);
        acpt = (Button) findViewById(R.id.termsUserBtn);
        acpt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TermsUserActivity.this, DashboardUserActivity.class);
                startActivity(intent);
            }
        });
    }
}
