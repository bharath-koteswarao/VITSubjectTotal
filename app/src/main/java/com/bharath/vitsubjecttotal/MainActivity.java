package com.bharath.vitsubjecttotal;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setSharedElementExitTransition(TransitionInflater.from(this).inflateTransition(R.transition.main_transition));
        }
        setContentView(R.layout.activity_main);
    }

    public void theory(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Pair<View, String> pair = Pair.create(view, getString(R.string.trans_name));
            ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair);
            startActivity(new Intent(this, Theory.class), compat.toBundle());
        } else {
            startActivity(new Intent(this, Theory.class));
        }
    }

    public void theoryAndLab(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Pair<View, String> pair = Pair.create(view, getString(R.string.trans_name));
            ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair);
            startActivity(new Intent(this, TandL.class), compat.toBundle());
        } else {
            startActivity(new Intent(this, TandL.class));
        }
    }

    public void theoryAndProject(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Pair<View, String> pair = Pair.create(view, getString(R.string.trans_name));
            ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair);
            startActivity(new Intent(this, TandP.class), compat.toBundle());
        } else {
            startActivity(new Intent(this, TandP.class));
        }
    }

    public void theoryAndLabAndProject(View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Pair<View, String> pair = Pair.create(view, getString(R.string.trans_name));
            ActivityOptionsCompat compat = ActivityOptionsCompat.makeSceneTransitionAnimation(this, pair);
            startActivity(new Intent(this, TandPandL.class), compat.toBundle());
        } else {
            startActivity(new Intent(this, TandPandL.class));
        }
    }
}
