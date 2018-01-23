package com.example.android.advertising;


import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.advertising.Activity.LoginActivity;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private NavigationView navigationView;
    private DrawerLayout drawer;
    private TextView itemViewCount;
    private TextView textViewMainRegister;

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        navigationView = (NavigationView) findViewById(R.id.nav_view);
        itemViewCount = (TextView) MenuItemCompat.getActionView(navigationView.getMenu().
                findItem(R.id.shopping_cart_main_menu_navigation_view));
        View header = navigationView.getHeaderView(0);
        textViewMainRegister = (TextView) header.findViewById(R.id.text_main_register);

        setupView();
    }

    private void setupView() {
        toolbarView();
        initializeCountDrawer();
        navigationView();
        drawerView();
        navigationHeaderView();
    }

    private void navigationHeaderView() {
        textViewMainRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }

    private void navigationView() {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {

                int id = menuItem.getItemId();

                switch (id) {
                    case R.id.home_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.list_main_menu_navigation_advertising:
                        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.shopping_cart_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.favorite_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "4", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.email_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "5", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.assignment_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "6", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.credit_card_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "7", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.special_offer_digikala_main_menu_navigation_advertising:
                        Toast.makeText(MainActivity.this, "8", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.best_sellers_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "9", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.most_viewed_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "10", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.newest_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "11", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Settings_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "12", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.frequently_asked_questions_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "13", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.about_us_main_menu_navigation_view:
                        Toast.makeText(MainActivity.this, "14", Toast.LENGTH_SHORT).show();
                        break;

                }


                return true;
            }
        });
    }

    private void toolbarView() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

    private void drawerView() {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, 0, 0);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
    }

    private void initializeCountDrawer() {
        itemViewCount.setGravity(Gravity.CENTER_VERTICAL);
        itemViewCount.setTypeface(null, Typeface.BOLD);
        itemViewCount.setTextColor(getResources().getColor(R.color.accent));
        itemViewCount.setText("99+");
    }
}
