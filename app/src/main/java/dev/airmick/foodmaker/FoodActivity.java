package dev.airmick.foodmaker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.transition.MaterialContainerTransform;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;

import java.util.Objects;

import dev.airmick.foodmaker.FoodActivityFragments.FoodActivityFragmentAdapter;

public class FoodActivity extends AppCompatActivity {
    private TextView nameTextView;
    private TextView descriptionTextView;
    private ImageView imageView;

    // Fragment properties
    private TabLayout tabLayout;
    private ViewPager2 viewPager2;
    private FoodActivityFragmentAdapter adapter;

    // Fragment TextViews links
    private TextView detailTextView, directionTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        String name = getIntent().getStringExtra("name");
        String description = getIntent().getStringExtra("description");
        int image = getIntent().getExtras().getInt("image");

        nameTextView = findViewById(R.id.food_name);
        descriptionTextView = findViewById(R.id.food_description);
        imageView = findViewById(R.id.image_display);
        detailTextView = findViewById(R.id.fragment_detail_textview);

        nameTextView.setText(name);
        descriptionTextView.setText(description);
        imageView.setImageResource(image);

        // Setup toolbar configuration
        MaterialToolbar toolbar = findViewById(R.id.activity_food_appbar);

        if (toolbar != null) {
            toolbar.setTitle(name);
        }
        setSupportActionBar(toolbar);

        // Adding back button
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set Fragment for Description food
        tabLayout = findViewById(R.id.food_activity_tabs_layout);
        viewPager2 = findViewById(R.id.food_activity_view_pager);

        FragmentManager fragmentManager = getSupportFragmentManager();
        adapter = new FoodActivityFragmentAdapter(fragmentManager, getLifecycle());
        viewPager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Details"));
        tabLayout.addTab(tabLayout.newTab().setText("Direction"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

    }
}