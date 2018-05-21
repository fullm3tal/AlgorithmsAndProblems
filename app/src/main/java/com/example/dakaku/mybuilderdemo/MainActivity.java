package com.example.dakaku.mybuilderdemo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, SpinnerListener {

    Button btClick, btMore,btNext;
    TextView tv;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = getSharedPreferences("MyApp", MODE_PRIVATE);

        btClick = (Button) findViewById(R.id.bt_click);
        btMore = (Button) findViewById(R.id.bt_more);
        btNext=(Button)findViewById(R.id.bt_next);

        tv = (TextView) findViewById(R.id.tv_main);
        btClick.setOnClickListener(this);
        btMore.setOnClickListener(this);
        btNext.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.bt_click:
                SharedPreferences sharedPreferences = getSharedPreferences("MyApp", MODE_PRIVATE);
                String position = sharedPreferences.getString(Util.ITEM_LOCATION, null);
                Log.v(TAG, " " + position);
                if (position == "0" || position == null) {
                    Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    startActivity(intent);
                }
                break;

            case R.id.bt_more:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;

            case R.id.bt_next:
                Intent intent2 = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent2);
                break;

            default:
                Toast.makeText(MainActivity.this, "Nothing clicked", Toast.LENGTH_SHORT).show();

        }


    }

    @Override
    public void spinnerSelectedItem(String selectedItem) {

    }
}
