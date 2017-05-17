package com.bharath.vitsubjecttotal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class TandL extends AppCompatActivity {
    EditText cat1,cat2,fat,das,theoryCredits,labTotal;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tand_l);
        cat1=(EditText)findViewById(R.id.cat1);
        cat2=(EditText)findViewById(R.id.cat2);
        fat=(EditText)findViewById(R.id.fat);
        das=(EditText)findViewById(R.id.daTotal);
        theoryCredits=(EditText)findViewById(R.id.credits);
        labTotal=(EditText)findViewById(R.id.labMarks);
        result=(TextView)findViewById(R.id.result);
    }
}
