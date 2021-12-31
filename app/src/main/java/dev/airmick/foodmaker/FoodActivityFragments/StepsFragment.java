package dev.airmick.foodmaker.FoodActivityFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dev.airmick.foodmaker.R;

public class StepsFragment extends Fragment {

    public StepsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_steps, container, false);
        TextView stepsTextView = rootView.findViewById(R.id.frag_steps_textview);
        String steps = "Le cru s’est parfaitement intégré dans la cuisine française, même s’il ne " +
                "séduit pas tout le monde. Aujourd’hui, le steak tartare peut se décliner de " +
                "milles façons pour devenir un must de la gastronomie française.";
        stepsTextView.setText(steps);
        return rootView;
    }
}