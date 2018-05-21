package com.example.dakaku.mybuilderdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class SecondActivity extends AppCompatActivity {

    Spinner spinner;
    SpinnerListener spinnerListener;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        spinner = (Spinner) findViewById(R.id.spinner_second);
        SharedPreferences sharedPreferences = getSharedPreferences("MyApp", MODE_PRIVATE);
        String  position = sharedPreferences.getString(Util.ITEM_LOCATION, null);
        spinner.setSelection(Integer.parseInt(position));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedItem=(String) spinner.getItemAtPosition(position);
                SharedPreferences sharedPreferences = getSharedPreferences("MyApp", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(Util.ITEM_LOCATION, String.valueOf(position));
                editor.putString(Util.ITEM_SELECTED,selectedItem);
                editor.commit();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
