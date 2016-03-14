package com.andynilson.android4kidsexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SimpleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }

    public void showToast(View view) {
        Toast.makeText(getApplicationContext(), "Hello World", Toast.LENGTH_LONG).show();
    }
}
