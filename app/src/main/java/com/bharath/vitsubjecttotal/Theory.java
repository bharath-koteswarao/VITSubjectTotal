package com.bharath.vitsubjecttotal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Theory extends AppCompatActivity {
    EditText cat1, cat2, fat, das;
    TextView total;
    int c1, c2, f, da;
    double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory);
        cat1 = (EditText) findViewById(R.id.cat1);
        cat2 = (EditText) findViewById(R.id.cat2);
        fat = (EditText) findViewById(R.id.fat);
        das = (EditText) findViewById(R.id.daTotal);
        total = (TextView) findViewById(R.id.total);
        cat1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                total.setText(process()+"");
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
                total.setText(process()+"");
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
                total.setText(process()+"");
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
                total.setText(process()+"");
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public void setZero(EditText et) {
        et.setText("0");
    }

    public int process() {
        if ((cat1.getText().toString()).equals("")) {
            c1 = 0;
        }
        else {
            c1=Integer.parseInt(cat1.getText().toString());
        }
        if ((cat2.getText().toString()).equals("")) {
            c2 = 0;
        }
        else {
            c2=Integer.parseInt(cat2.getText().toString());
        }
        if ((fat.getText().toString()).equals("")) {
            f = 0;
        }
        else {
            f=Integer.parseInt(fat.getText().toString());
        }
        if ((das.getText().toString()).equals("")) {
            da = 0;
        }
        else {
            da=Integer.parseInt(das.getText().toString());
        }
        
        return (int) Math.ceil(((c1+c2)*0.3)+da+(f*0.4));
    }
}
