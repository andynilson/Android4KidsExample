package com.andynilson.android4kidsexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navigateToActivity(View view) {
        Intent intent = null;

        if (view.getId() == R.id.dpsp_button) {
            intent = new Intent(this, DpSpActivity.class);
        } else if (view.getId() == R.id.wrapped_match_button) {
            intent = new Intent(this, WrapMatchActivity.class);
        } else if (view.getId() == R.id.orientationhorizontal_button) {
            intent = new Intent(this, OrientationHorizontalActivity.class);
        } else if (view.getId() == R.id.orientationvertical_button) {
            intent = new Intent(this, OrientationVerticalActivity.class);
        } else if (view.getId() == R.id.weight_vertical_button) {
            intent = new Intent(this, WeightActivity.class);
        } else if (view.getId() == R.id.relative_layout_button) {
            intent = new Intent(this, RelativeActivity.class);}
          else if (view.getId() == R.id.birthday_card_button) {
                intent = new Intent(this, BirthdayCardActivity.class);
        } else if (view.getId() == R.id.activity_button) {
            intent = new Intent(this, SimpleActivity.class);
        }else if(view.getId() == R.id.onclick_button) {
                intent = new Intent(this, onclickactivity.class);



        }


        if (intent == null) {
            Log.e(TAG, "bad view for navigation" + view);
            //TODO toast
            return;
        }

        startActivity(intent);
    }

}
