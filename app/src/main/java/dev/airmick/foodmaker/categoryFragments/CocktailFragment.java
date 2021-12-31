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
import java.util.Collections;
import java.util.List;

import dev.airmick.foodmaker.Food;
import dev.airmick.foodmaker.FoodAdapter;
import dev.airmick.foodmaker.R;

public class CocktailFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Food> foodList = Arrays.asList(
            new Food("PIÑA COLADA", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "3 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.pina_colada),
            new Food("COCKTAIL GIN ET TONIC", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "3 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.cocktail_gin_et_tonic),
            new Food("MARGARITA", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "2 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.margarita),
            new Food("COCKTAIL NEGRONI", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "5 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.breakfast_one),
            new Food("COCKTAIL MARTINI DRY", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "3 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.cocktail_martini_ry),
            new Food("CUBA LIBRE", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "2 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.cuba_libre),
            new Food("COSMOPOLITAN", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "10 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.cosmopolitan),
            new Food("COCKTAIL OLD FASHIONED", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "10 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.cocktail_old_fashioned),
            new Food("MOJITO : LA RECETTE ORIGINALE", "6 personnes\n" +
                    "Niveau : Très facile\n" +
                    "5 minutes de préparation\n" +
                    "Bon marché",
                    R.drawable.mojito),
            new Food("COCKTAIL MANHATTAN AU BOURBON", "1 personnes\n" +
                    "Niveau : Très facile\n" +
                    "3 minutes de préparation\n" +
                    "Assez cher",
                    R.drawable.the_perfect_manhattan)
    );

    public CocktailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.food_recyclerview, container, false);
        Collections.sort(foodList);
        recyclerView = rootView.findViewById(R.id.recycle_view);
        adapter = new FoodAdapter(foodList, R.color.cocktail_color);
        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                1);
        recyclerView.addItemDecoration(mDividerItemDecoration);
        return rootView;
    }
}