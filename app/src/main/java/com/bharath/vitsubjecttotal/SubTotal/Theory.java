package com.bharath.vitsubjecttotal.SubTotal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.bharath.vitsubjecttotal.Calculators.SubjectTotal;
import com.bharath.vitsubjecttotal.R;

public class Theory extends AppCompatActivity {
    EditText cat1, cat2, fat, das;
    TextView total;
    SubjectTotal subjectTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        subjectTotal = new SubjectTotal();
        cat1 = (EditText) findViewById(R.id.tplcat1);
        cat2 = (EditText) findViewById(R.id.tplcat2);
        fat = (EditText) findViewById(R.id.tplfat);
        das = (EditText) findViewById(R.id.tpldaTotal);
        total = (TextView) findViewById(R.id.total);
        cat1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                total.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        cat2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                total.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        fat.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                total.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        das.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                total.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }


    public int update() {
        return subjectTotal.calculateT(cat1, cat2, fat, das);
    }
}
