package dev.airmick.foodmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FoodActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");

        nameTextView = findViewById(R.id.food_name);
        descriptionTextView = findViewById(R.id.food_description);

        nameTextView.setText(name);
        descriptionTextView.setText(description);
    }
}