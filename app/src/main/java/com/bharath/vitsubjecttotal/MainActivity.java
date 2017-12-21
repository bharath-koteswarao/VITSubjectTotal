package com.bharath.vitsubjecttotal;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.TypefaceSpan;
import android.transition.TransitionInflater;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import com.bharath.vitsubjecttotal.Grades.ArrearGradeCalculator;
import com.bharath.vitsubjecttotal.Grades.CgpaCalculator;
import com.bharath.vitsubjecttotal.Grades.GpaCalculator;
import com.bharath.vitsubjecttotal.SubTotal.TandL;
import com.bharath.vitsubjecttotal.SubTotal.TandP;
import com.bharath.vitsubjecttotal.SubTotal.TandPandL;
import com.bharath.vitsubjecttotal.SubTotal.Theory;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    ListView navListView;
    DrawerLayout drawer;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;
    int exitCount = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().setSharedElementExitTransition(TransitionInflater.from(this).inflateTransition(R.transition.main_transition));
        }
        setContentView(R.layout.activity_main);
        initialize();
        setUpListView();
    }

    private void initialize() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setUpToolbar();
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        navListView = (ListView) navigationView.findViewById(R.id.navListView);
    }

    private void setUpListView() {
        String[] items = new String[]{"Gpa Calculator", "Cgpa Calculator", "Arrear Grade Calculator"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        navListView.setAdapter(adapter);
        navListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0: {
                        startActivity(new Intent(MainActivity.this, GpaCalculator.class));
                        drawer.closeDrawer(Gravity.START);
                        break;
                    }
                    case 1: {
                        startActivity(new Intent(MainActivity.this, CgpaCalculator.class));
                        drawer.closeDrawer(Gravity.START);
                        break;
                    }
                    default: {
                        startActivity(new Intent(MainActivity.this, ArrearGradeCalculator.class));
                        drawer.closeDrawer(Gravity.START);
                        break;
                    }
                }
            }
        });
    }

    private void setUpToolbar() {
        setSupportActionBar(toolbar);
        SpannableString s = new SpannableString("SUBJECT TOTAL");
        s.setSpan(new TypefaceSpan("slabo.ttf"), 0, s.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        getSupportActionBar().setTitle(s);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (exitCount == 1) {
                Toast.makeText(this, "Press again to exit", Toast.LENGTH_SHORT).show();
                exitCount += 1;
            } else finishAffinity();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.rate_app) {
            final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
            try {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
            } catch (android.content.ActivityNotFoundException ex) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return true;
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
