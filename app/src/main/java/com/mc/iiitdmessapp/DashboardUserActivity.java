package com.mc.iiitdmessapp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class DashboardUserActivity extends AppCompatActivity {
    ImageButton menuButton, homeButton, profileButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_dashboard_user);

        menuButton = (ImageButton) findViewById(R.id.menuButton);
        homeButton = (ImageButton) findViewById(R.id.homeButton);
        profileButton = (ImageButton) findViewById(R.id.profileButton);

        HomeUserFragment homeUserFragment = new HomeUserFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameContainer, homeUserFragment);
        fragmentTransaction.commit();

        homeButton.setBackgroundResource(R.color.black);
        homeButton.setImageResource(R.drawable.home_white);
        menuButton.setBackgroundResource(R.color.white);
        menuButton.setImageResource(R.drawable.menu_black);
        profileButton.setBackgroundResource(R.color.white);
        profileButton.setImageResource(R.drawable.user_black);

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuUserFragment menuUserFragment = new MenuUserFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameContainer, menuUserFragment);
                fragmentTransaction.commit();
                menuButton.setBackgroundResource(R.color.black);
                menuButton.setImageResource(R.drawable.menu_white);

                homeButton.setBackgroundResource(R.color.white);
                homeButton.setImageResource(R.drawable.home_black);
                profileButton.setBackgroundResource(R.color.white);
                profileButton.setImageResource(R.drawable.user_black);
            }
        });
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeUserFragment homeUserFragment = new HomeUserFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameContainer, homeUserFragment);
                fragmentTransaction.commit();
                homeButton.setBackgroundResource(R.color.black);
                homeButton.setImageResource(R.drawable.home_white);

                menuButton.setBackgroundResource(R.color.white);
                menuButton.setImageResource(R.drawable.menu_black);
                profileButton.setBackgroundResource(R.color.white);
                profileButton.setImageResource(R.drawable.user_black);
            }
        });
        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ProfileUserFragment profileUserFragment = new ProfileUserFragment();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.frameContainer, profileUserFragment);
                fragmentTransaction.commit();
                profileButton.setBackgroundResource(R.color.black);
                profileButton.setImageResource(R.drawable.user_white);

                homeButton.setBackgroundResource(R.color.white);
                homeButton.setImageResource(R.drawable.home_black);
                menuButton.setBackgroundResource(R.color.white);
                menuButton.setImageResource(R.drawable.menu_black);
            }
        });

    }
}
