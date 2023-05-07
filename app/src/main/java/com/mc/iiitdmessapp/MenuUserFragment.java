package com.mc.iiitdmessapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MenuUserFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu_user, container, false);

        Spinner daySpinner = view.findViewById(R.id.day_spinner);
        ArrayAdapter<CharSequence> dayAdapter = ArrayAdapter.createFromResource(view.getContext(), R.array.days_of_week, android.R.layout.simple_spinner_item);
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        daySpinner.setAdapter(dayAdapter);

        Spinner breakfastSpinner = view.findViewById(R.id.breakfast_spinner);
        ArrayAdapter<CharSequence> mealAdapter = ArrayAdapter.createFromResource(view.getContext(), R.array.meal_types, android.R.layout.simple_spinner_item);
        mealAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        breakfastSpinner.setAdapter(mealAdapter);

        Spinner lunchSpinner = view.findViewById(R.id.lunch_spinner);
        lunchSpinner.setAdapter(mealAdapter);

        Spinner dinnerSpinner = view.findViewById(R.id.dinner_spinner);
        dinnerSpinner.setAdapter(mealAdapter);

        // Set default selection for meal spinners
        int idliIndex = mealAdapter.getPosition("Idli");
        breakfastSpinner.setSelection(idliIndex);
        lunchSpinner.setSelection(idliIndex);
        dinnerSpinner.setSelection(idliIndex);



        return view;
    }
}
