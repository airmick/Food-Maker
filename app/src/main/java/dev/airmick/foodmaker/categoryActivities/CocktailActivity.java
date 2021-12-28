package dev.airmick.foodmaker.categoryActivities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

import dev.airmick.foodmaker.Food;
import dev.airmick.foodmaker.FoodAdapter;
import dev.airmick.foodmaker.R;

public class CocktailActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Food> foodList = Arrays.asList(
            new Food("Apple", "fruits",
                    R.drawable.dinner),
            new Food("Orange", "my favorite one",
                    R.drawable.dinner_two),
            new Food("Pineapple", "once eaten never get tired of it.",
                    R.drawable.lunch_three),
            new Food("Coconut", "dark fruits",
                    R.drawable.breakfast_one),
            new Food("Tomatoes", "my favorite one again",
                    R.drawable.lunch_six),
            new Food("Lemon", "very interesting fruit.",
                    R.drawable.lunch_one)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycle_view);
        adapter = new FoodAdapter(foodList, R.color.cocktail_color);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                1);
        recyclerView.addItemDecoration(mDividerItemDecoration);
    }
}