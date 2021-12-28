package dev.airmick.foodmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;

import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Food> foodList = Arrays.asList(
            new Food("Apple", "fruits and etc. " +
                    "once eaten never get tired of it.... " +
                    "once eaten never get tired of it., once eaten never get tired of it.",
                    R.drawable.lunch_five),
            new Food("Orange", "my favorite one",
                    R.drawable.breakfast_two),
            new Food("Pineapple", "once eaten never get tired of it.",
                    R.drawable.breakfast_one),
            new Food("Coconut", "dark fruits",
                    R.drawable.breakfast_two),
            new Food("Tomatoes", "my favorite one again",
                    R.drawable.breakfast_one),
            new Food("Lemon", "very interesting fruit.",
                    R.drawable.breakfast_two)
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
//        setExitSharedElementCallback(new MaterialContainerTransformSharedElementCallback());
//        getWindow().setSharedElementsUseOverlay(false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recycle_view);
        adapter = new FoodAdapter(foodList, R.color.list_all_color);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                1);
        recyclerView.addItemDecoration(mDividerItemDecoration);

    }
}