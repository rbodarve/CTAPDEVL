package com.example.cvapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button callButton = findViewById(R.id.callButton);
        Button emailButton = findViewById(R.id.emailButton);
        Button portfolioButton = findViewById(R.id.portfolioButton);

        // Call button - opens dialer
        callButton.setOnClickListener(v -> {
            Intent dialIntent = new Intent(Intent.ACTION_DIAL);
            dialIntent.setData(Uri.parse("tel:+639691912966"));
            startActivity(dialIntent);
        });

        // Email button - opens email app
        emailButton.setOnClickListener(v -> {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:rbodarve@gmail.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Contact from CV App");
            startActivity(emailIntent);
        });

        // Portfolio button - opens browser
        portfolioButton.setOnClickListener(v -> {
            Intent browserIntent = new Intent(Intent.ACTION_VIEW);
            browserIntent.setData(Uri.parse("https://ph.linkedin.com/in/renaire-odarve-b82117345"));
            startActivity(browserIntent);
        });
    }
}