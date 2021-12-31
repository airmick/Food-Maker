package dev.airmick.foodmaker.FoodActivityFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dev.airmick.foodmaker.R;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_detail, container, false);

        TextView detailTextView = rootView.findViewById(R.id.fragment_detail_textview);
        String details = "vous aurez la certitude de faire un bon repas. " +
                "Évoquer les spécialités françaises et la cuisine traditionnelle " +
                "sans parler du bœuf bourguignon était tout simplement impossible. " +
                "Petite astuce pour encore plus de goût, ajoutez à ce plat un peu de lard fumé.\n" +
                "\n";
        detailTextView.setText(details);

        return rootView;
    }
}