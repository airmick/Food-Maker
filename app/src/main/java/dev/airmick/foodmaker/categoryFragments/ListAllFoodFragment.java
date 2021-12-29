package dev.airmick.foodmaker.categoryFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

import dev.airmick.foodmaker.Food;
import dev.airmick.foodmaker.FoodAdapter;
import dev.airmick.foodmaker.R;

public class ListAllFoodFragment extends Fragment {
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
                    R.drawable.breakfast_two),
            new Food("Watermelon", "fruits and " +
                    "once eaten never get tired of it.... " +
                    "once eaten never get tired of it., once eaten never get tired of it.",
                    R.drawable.lunch_five),
            new Food("Tuna", "my favorite one",
                    R.drawable.breakfast_two)
    );

    public ListAllFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.activity_main, container, false);

        recyclerView = rootView.findViewById(R.id.recycle_view);
        adapter = new FoodAdapter(foodList, R.color.list_all_color);
        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                1);
        recyclerView.addItemDecoration(mDividerItemDecoration);
        return rootView;
    }
}