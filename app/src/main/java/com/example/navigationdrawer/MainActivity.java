package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ImageButton buttonDrawerToggle;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = findViewById(R.id.drawerLayout);
        buttonDrawerToggle = findViewById(R.id.buttonDrawerToggle);

        buttonDrawerToggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                drawerLayout.openDrawer(GravityCompat.END);
            }
        });
    }
    public void imageButton4(View view) {
        Intent intent = new Intent(MainActivity.this, activity_scan.class);
        startActivity(intent);
    }
    public void imageButton10(View view) {
        Intent intent = new Intent(MainActivity.this, activity_redeem.class);
        startActivity(intent);
    }
    public void imageButton11(View view) {
        Intent intent = new Intent(MainActivity.this, activity_ekstra.class);
        startActivity(intent);
    }
    public void imageButton12(View view) {
        Intent intent = new Intent(MainActivity.this, activity_royal.class);
        startActivity(intent);
    }
}
