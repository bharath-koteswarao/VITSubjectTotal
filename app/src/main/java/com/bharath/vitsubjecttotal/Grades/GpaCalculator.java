package com.bharath.vitsubjecttotal.Grades;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import com.bharath.vitsubjecttotal.R;

public class GpaCalculator extends AppCompatActivity {
    RecyclerView gpaRecview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa_calculator);
        gpaRecview = (RecyclerView) findViewById(R.id.gpaCalcRecView);
    }
}
