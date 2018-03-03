package com.example.administrator.myseekbarapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RangeSlider2 mRangeSlider;
    private float minValue;
    private float maxValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRangeSlider = (RangeSlider2) findViewById(R.id.bgm_range_slider);

        mRangeSlider.setValue(0, 100);


        mRangeSlider.setOnRangeChangedListener(new RangeSlider2.OnRangeChangedListener() {
            @Override
            public void onRangeChanged(RangeSlider2 view, float min, float max, boolean isFromUser) {
                if (isFromUser) {
                    minValue = min;
                    maxValue = max;
                }


            }

            @Override
            public void onStartTrackingTouch(RangeSlider2 view, boolean isLeft) {
            }

            @Override
            public void onStopTrackingTouch(RangeSlider2 view, boolean isLeft) {
                Log.e("MainActivity", "minValue======" + minValue);
                Log.e("MainActivity", "maxValue======" + maxValue);
                Toast.makeText(MainActivity.this, "minValue======" + minValue + "\n" + "maxValue=======" + maxValue, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
