package com.example.christmasgreetingcard;

import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Apply window insets to the root layout
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets bars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(bars.left, bars.top, bars.right, bars.bottom);
            return insets;
        });

        // Fade-in animation for the Christmas tree
        ImageView tree = findViewById(R.id.treeImage);
        AlphaAnimation fadeIn = new AlphaAnimation(0f, 1f);
        fadeIn.setDuration(2000);
        fadeIn.setFillAfter(true);
        tree.startAnimation(fadeIn);

        // Button Toast interaction
        Button toastButton = findViewById(R.id.toastButton);
        toastButton.setOnClickListener(v -> {
            Toast.makeText(
                    MainActivity.this,
                    "Maayong Pasko Ma and Pa!",
                    Toast.LENGTH_LONG
            ).show();
        });
    }
}
