package dev.airmick.foodmaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.transition.MaterialContainerTransform;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;

public class FoodActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().requestFeature(Window.FEATURE_ACTIVITY_TRANSITIONS);
        findViewById(android.R.id.content).setTransitionName("shared_container");
        setEnterSharedElementCallback(new MaterialContainerTransformSharedElementCallback());


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getExtras().getInt("image");

        nameTextView = findViewById(R.id.food_name);
        descriptionTextView = findViewById(R.id.food_description);
        imageView = findViewById(R.id.image_display);

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        imageView.setImageResource(image);

    }
}