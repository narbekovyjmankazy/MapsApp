package com.example.mapsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.imgView);

        String imageUrl = "https://www.google.com/imgres?q=google%20maps%20logo%20with%20white%20background&imgurl=https%3A%2F%2Fstatic1.anpoimages.com%2Fwordpress%2Fwp-content%2Fuploads%2F2023%2F10%2Fgoogle_maps_logo_2020.jpg&imgrefurl=https%3A%2F%2Fwww.androidpolice.com%2Fgoogle-maps-colors-change-navigation%2F&docid=wFbp6PzqwTMVZM&tbnid=bGFW8WvBsdbhhM&vet=12ahUKEwjryaCp7PmJAxUJBxAIHS3jIxoQM3oECBUQAA..i&w=1920&h=1080&hcb=2&ved=2ahUKEwjryaCp7PmJAxUJBxAIHS3jIxoQM3oECBUQAA";

        Picasso.get()
                .load(imageUrl)
                .into(imageView);

        imageView.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        });
    }
}