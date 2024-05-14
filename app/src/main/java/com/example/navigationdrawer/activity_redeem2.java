package com.example.navigationdrawer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_redeem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redeem2);
    }
    public void imageButton9(View view) {
        Intent intent = new Intent(activity_redeem2.this, activity_ekstra.class);
        startActivity(intent);
    }
    public void imageButton6(View view) {
        Intent intent = new Intent(activity_redeem2.this, activity_redeem.class);
        startActivity(intent);
    }
}