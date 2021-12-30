package dev.airmick.foodmaker.FoodActivityFragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FoodActivityFragmentAdapter extends FragmentStateAdapter {
    public FoodActivityFragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 1) {
            return new StepsFragment();
        }
        return new DetailFragment();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
