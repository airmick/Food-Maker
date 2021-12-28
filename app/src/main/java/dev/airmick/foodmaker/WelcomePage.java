package dev.airmick.foodmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import dev.airmick.foodmaker.categoryActivities.CocktailActivity;
import dev.airmick.foodmaker.categoryActivities.DessertActivity;
import dev.airmick.foodmaker.categoryActivities.DinnerActivity;
import dev.airmick.foodmaker.categoryActivities.LunchActivity;

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

        // Lunch Activity launcher
        lunch_textView = findViewById(R.id.lunch_textview);
        lunch_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lunchIntent = new Intent(WelcomePage.this, LunchActivity.class);
                startActivity(lunchIntent);
            }
        });

        // Dinner Activity launcher
        dinner_textView = findViewById(R.id.dinner_textview);
        dinner_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dinnerIntent = new Intent(WelcomePage.this, DinnerActivity.class);
                startActivity(dinnerIntent);
            }
        });

        //Dessert Activity launcher
        dessert_textView = findViewById(R.id.desserts_textview);
        dessert_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dessertIntent = new Intent(WelcomePage.this, DessertActivity.class);
                startActivity(dessertIntent);
            }
        });

        // Cocktail Activity launcher
        cocktail_textView = findViewById(R.id.cocktails_textview);
        cocktail_textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cocktailIntent = new Intent(WelcomePage.this, CocktailActivity.class);
                startActivity(cocktailIntent);
            }
        });
    }
}