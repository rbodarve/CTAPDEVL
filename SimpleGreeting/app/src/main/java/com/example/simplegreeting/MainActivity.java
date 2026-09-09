package com.example.simplegreeting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etName;
    private TextView tvGreeting;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect XML views to Java
        etName = findViewById(R.id.etName);
        Button btnGreet = findViewById(R.id.btnGreet);
        tvGreeting = findViewById(R.id.tvGreeting);

        // Set click listener
        btnGreet.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();

            if (name.isEmpty()) {
                // Show a Toast instead of updating the TextView
                Toast.makeText(MainActivity.this,
                        R.string.please_enter_your_name,
                        Toast.LENGTH_SHORT).show();
            } else {
                String message = "Hello, " + name + "! Welcome to Android Development.";
                tvGreeting.setText(message);
            }
        });
    }
}
