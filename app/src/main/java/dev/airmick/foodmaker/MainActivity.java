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

import dev.airmick.foodmaker.categoryFragments.BreakfastFragment;
import dev.airmick.foodmaker.categoryFragments.ListAllFoodFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
//        setExitSharedElementCallback(new MaterialContainerTransformSharedElementCallback());
//        getWindow().setSharedElementsUseOverlay(false);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_breakfast);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ListAllFoodFragment())
                .commit();

    }
}