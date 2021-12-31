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

public class DessertFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Food> foodList = Arrays.asList(
            new Food("Huîtres", "Principalement cultivées dans le bassin de Marennes-Oléron, les huîtres sont l’un des mets les plus consommés lors des fêtes de fin d’année. Que serait la gastronomie française sans nos célèbres fruits de mer ?",
                    R.drawable.breakfast_two),
            new Food("Gratin dauphinois", "Pour préparer cette spécialité du Dauphiné, vous n’aurez besoin que de pommes de terres, de la crème fraîche et éventuellement un peu de ciboulette fraîche. Ce plat s’intègre parfaitement dans la cuisine traditionnelle française et peut se manger en tant que plat principal ou en accompagnement.",
                    R.drawable.dinner),
            new Food("Bœuf bourguignon", "Le bœuf bourguignon est l’un des plats les plus traditionnels (et les plus délicieux) de la gastronomie française. Pour préparer ce plat, il vous suffit de cuisiner du bœuf à petit feu dans du vin de Bourgogne. Accompagnez la viande avec des garnitures fraîches (champignons, pomme de terre vapeur, carotte…) et vous aurez la certitude de faire un bon repas.",
                    R.drawable.dinner_two),
            new Food("Eggs", "They’re an excellent source of protein, which helps support muscle synthesis. Since protein takes a while to digest, it also helps keep you feeling full",
                    R.drawable.dinner),
            new Food("Greek yogurt", "Certain types are good sources of probiotics like Bifidobacteria, which support your digestion. To make sure that your yogurt contains probiotics, look for the phrase “contains live and active cultures” on the label",
                    R.drawable.dinner_two),
            new Food("Coffee", "fruits",
                    R.drawable.dinner),
            new Food("Oatmeal", "my favorite one",
                    R.drawable.dinner_two),
            new Food("AChia seeds", "1 ounce (28 grams) of dry chia seeds\n" +
                    "1 scoop (25 grams) of whey protein powder\n" +
                    "1 cup (240 mL) of coconut milk or almond milk\n" +
                    "1/2 cup (74 grams) of berries\n" +
                    "stevia or another sweetener to taste, if desired\n",
                    R.drawable.dinner),
            new Food("Berries", "Berries also offer antioxidants called anthocyanins, which provide their characteristic blue, purple, and red colors. A diet high in anthocyanins is linked to reduced inflammation and a lower risk of illnesses like heart disease and certain types of cancer",
                    R.drawable.dinner_two),
            new Food("Cottage cheese", "Cottage cheese is a fantastic high protein breakfast item, packing an impressive 24 grams of",
                    R.drawable.dinner),
            new Food("Whole wheat toast", "Whole grain toast is high in fiber and complex carbs, which digest slowly and don’t rapidly raise blood sugar levels",
                    R.drawable.dinner_two),
            new Food("Nuts", "Brazil nuts are one of the best sources of selenium. Just 2 Brazil nuts provide more than 100% of the Daily Value",
                    R.drawable.dinner),
            new Food("Green tea", "my favorite one",
                    R.drawable.dinner_two),
            new Food("Protein shakes", "If you’re short on time or want to take your breakfast on the go, protein shakes or smoothies are a great option.",
                    R.drawable.dinner_two),
            new Food("Fruit", "All fruits are relatively low in calories and contain good amounts of fiber and simple sugars. The fiber in fruit helps slow your body’s absorption of its sugars, giving you a steady source of energy",
                    R.drawable.dinner_two)
    );

    public DessertFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.food_recyclerview, container, false);
        recyclerView = rootView.findViewById(R.id.recycle_view);
        adapter = new FoodAdapter(foodList, R.color.dessert_color);
        layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        DividerItemDecoration mDividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(),
                1);
        recyclerView.addItemDecoration(mDividerItemDecoration);
        return rootView;
    }
}