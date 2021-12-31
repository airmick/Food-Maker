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

public class ListAllFoodFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<Food> foodList = Arrays.asList(
            new Food("Tartiflette", "Composée de pommes de terre, " +
                    "de lardons, de reblochon et d’oignon et généralement accompagnée d’une bonne " +
                    "salade verte, la tartiflette est une spécialité culinaire française originaire " +
                    "de Savoie. Un repas simple, mais délicieux qui s’apprécie à tout moment " +
                    "de l’année, en hiver – le soir après une bonne journée de ski – comme en été.",
                    R.drawable.lunch_five),
            new Food("Le coq au vin", "Le coq au vin est un plat " +
                    "traditionnel de la cuisine française. Pour préparer ce plat, vous avez besoin " +
                    "d’un coq découpé en morceaux cuisiné dans du bon vin (généralement rouge, mais " +
                    "le riesling peut également faire l’affaire) et accompagné d’oignons, " +
                    "de carottes, d’un bouquet garni et de champignons.",
                    R.drawable.breakfast_two),
            new Food("Pot au feu", "Pour réaliser ce plat, vous avez juste " +
                    "besoin de légumes et d’un peu de viande. Mettez tous ces ingrédients dans une " +
                    "grande casserole, remplissez-la d’eau et cuisinez le tout à petit feu. " +
                    "Bon appétit à tous les amateurs de cuisine traditionnelle française.",
                    R.drawable.breakfast_one),
            new Food("Quiche lorraine", "La quiche est – avec les bergamotes, les madeleines et la mirabelle – l’une des plus délicieuses spécialités culinaires lorraines. Recouverte de lardons et de migaine, cette tarte salée se consomme idéalement en entrée. Cette spécialité française traditionnelle se déguste avec une bonne salade verte ou des endives.",
                    R.drawable.breakfast_two),
            new Food("Crêpe", "Les crêpes sont la spécialité bretonne par excellence. Accompagnées d’un bon bol de cidre, elles se consomment salées (crêpe de sarrasin) ou sucrées au moment du dessert. La crêpe est un symbole de la cuisine française plébiscité par les touristes étrangers.",
                    R.drawable.breakfast_one),
            new Food("Steak tartare", "Le steak tartare est une des spécialités françaises très prisée par les amateurs de viande. Il faut dire que ce plat offre deux énormes avantages. D’une part, c’est délicieux. D’autre part, ce plat est facile à cuisiner : tout ce dont vous avez besoin, c’est d’un steak haché frais de bonne qualité (demandez-en un à votre boucher), de câpres, d’un œuf cru et de condiments.",
                    R.drawable.breakfast_two),
            new Food("Cassoulet", "Bien que cette spécialité française soit originaire du Languedoc, on associe bien volontiers ce plat de cuisine traditionnelle française à la ville de Toulouse. Le cassoulet est un plat délicieux, mais calorique – il est notamment composé de haricots blancs, de confit de canard et de saucisse. C’est le plat idéal à manger en hiver.",
                    R.drawable.lunch_five),
            new Food("Huîtres", "Principalement cultivées dans le bassin de Marennes-Oléron, les huîtres sont l’un des mets les plus consommés lors des fêtes de fin d’année. Que serait la gastronomie française sans nos célèbres fruits de mer ?",
                    R.drawable.dinner_two),
            new Food("Gratin dauphinois", "Pour préparer cette spécialité du Dauphiné, vous n’aurez besoin que de pommes de terres, de la crème fraîche et éventuellement un peu de ciboulette fraîche. Ce plat s’intègre parfaitement dans la cuisine traditionnelle française et peut se manger en tant que plat principal ou en accompagnement.",
                    R.drawable.dinner),
            new Food("Bœuf bourguignon", "Le bœuf bourguignon est l’un des plats les plus traditionnels (et les plus délicieux) de la gastronomie française. Pour préparer ce plat, il vous suffit de cuisiner du bœuf à petit feu dans du vin de Bourgogne. Accompagnez la viande avec des garnitures fraîches (champignons, pomme de terre vapeur, carotte…) et vous aurez la certitude de faire un bon repas.",
                    R.drawable.breakfast_two),
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
                    R.drawable.dinner_two),
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

    public ListAllFoodFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.food_recyclerview, container, false);
        Collections.sort(foodList);

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