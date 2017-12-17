package com.bharath.vitsubjecttotal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.bharath.vitsubjecttotal.Calculators.SubjectTotal;

public class TandL extends AppCompatActivity {
    EditText cat1, cat2, fat, das, totalCredits, labTotal;
    TextView result;

    SubjectTotal subjectTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tand_l);
        subjectTotal = new SubjectTotal();
        cat1 = (EditText) findViewById(R.id.tplcat1);
        cat2 = (EditText) findViewById(R.id.tplcat2);
        fat = (EditText) findViewById(R.id.tplfat);
        das = (EditText) findViewById(R.id.tpldaTotal);
        totalCredits = (EditText) findViewById(R.id.tplcredits);
        labTotal = (EditText) findViewById(R.id.tpllabMarks);
        result = (TextView) findViewById(R.id.tplresult);
        cat1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(update() + "");
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
                result.setText(update() + "");
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
                result.setText(update() + "");
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
                result.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        totalCredits.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        labTotal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                result.setText(update() + "");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public int update() {
        return subjectTotal.calculateTL(cat1, cat2, fat, das, totalCredits, labTotal);
    }
}
