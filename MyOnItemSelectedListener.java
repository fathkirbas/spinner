package com.example.spinner;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MyOnItemSelectedListener implements AdapterView.OnItemSelectedListener {

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(parent.getContext(), "The planet is " +
                parent.getItemAtPosition(position).toString(), Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView parent) {
        // Do nothing.
    }


}