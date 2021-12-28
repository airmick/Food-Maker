package dev.airmick.foodmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {
    private TextView listAllTextView;
    private TextView breakfast_textView;
    private TextView lunch_textView;
    private TextView dinner_textView;
    private TextView dessert_textView;
    private TextView cocktail_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        listAllTextView = findViewById(R.id.list_all);
        listAllTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listAllIntent = new Intent(WelcomePage.this, MainActivity.class);
                startActivity(listAllIntent);
            }
        });

        // Breakfast
        breakfast_textView = findViewById(R.id.breakfast_textview);
        breakfast_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent breakfastIntent = new Intent(WelcomePage.this, BreakfastActivity.class);
                startActivity(breakfastIntent);
            }
        });

    }
}