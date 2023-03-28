package com.mc.iiitdmessapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeUserFragment extends Fragment {
    Button buyBtn;
    LinearLayout couponLayout;
    static Boolean hasBought = false;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.fragment_home_user, container, false);
        Toast.makeText(view.getContext(), "User Home", Toast.LENGTH_SHORT).show();
        if (hasBought) {
            buyBtn = (Button) view.findViewById(R.id.buyBtn);
            couponLayout = (LinearLayout) view.findViewById(R.id.couponsLayout);
            buyBtn.setVisibility(View.INVISIBLE);
            couponLayout.setVisibility(View.VISIBLE);
        } else {
            buyBtn = (Button) view.findViewById(R.id.buyBtn);
            View finalView = view;
            buyBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    couponLayout = (LinearLayout) finalView.findViewById(R.id.couponsLayout);
                    couponLayout.setVisibility(View.VISIBLE);
                    buyBtn.setVisibility(View.INVISIBLE);
                    hasBought = true;
                }
            });
        }

        return view;
    }
}