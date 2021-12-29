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
import dev.airmick.foodmaker.categoryFragments.BreakfastFragment;
import dev.airmick.foodmaker.categoryFragments.DessertFragment;

public class DessertActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_breakfast);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, new DessertFragment())
                    .commit();
        }

    }
}