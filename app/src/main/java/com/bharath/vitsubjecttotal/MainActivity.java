package com.bharath.vitsubjecttotal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void theory(View view) {
        startActivity(new Intent(this,Theory.class));
    }

    public void theoryAndLab(View view) {
        startActivity(new Intent(this,TandL.class));
    }

    public void theoryAndProject(View view) {
        startActivity(new Intent(this,TandP.class));
    }

    public void theoryAndLabAndProject(View view) {
        startActivity(new Intent(this,TandPandL.class));
    }
}
