package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_ekstra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstra);
    }
    public void imageButton6(View view) {
        Intent intent = new Intent(activity_ekstra.this, activity_redeem2.class);
        startActivity(intent);
    }
    public void imageButton7(View view) {
        Intent intent = new Intent(activity_ekstra.this, activity_ekstra2.class);
        startActivity(intent);
    }
}