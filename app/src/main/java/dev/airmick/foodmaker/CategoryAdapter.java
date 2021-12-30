package dev.airmick.foodmaker;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import dev.airmick.foodmaker.categoryFragments.BreakfastFragment;
import dev.airmick.foodmaker.categoryFragments.CocktailFragment;
import dev.airmick.foodmaker.categoryFragments.DessertFragment;
import dev.airmick.foodmaker.categoryFragments.DinnerFragment;
import dev.airmick.foodmaker.categoryFragments.ListAllFoodFragment;
import dev.airmick.foodmaker.categoryFragments.LunchFragment;

public class CategoryAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public CategoryAdapter(Context mContext, @NonNull FragmentManager fm) {
        super(fm);
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new ListAllFoodFragment();
        }
        else if (position == 1) {
            return new BreakfastFragment();
        }
        else if (position == 2) {
            return new CocktailFragment();
        }
        else if (position == 3) {
            return new DessertFragment();
        }
        else if (position == 4) {
            return new DinnerFragment();
        }
        else {
            return new LunchFragment();
        }
    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.list_all);
        }
        else if (position == 1) {
            return mContext.getString(R.string.category_breakfast);
        }
        else if (position == 2) {
            return mContext.getString(R.string.category_cocktail);
        }
        else if (position == 3) {
            return mContext.getString(R.string.category_dessert);
        }
        else if (position == 4) {
            return mContext.getString(R.string.category_dinner);
        }
        else {
            return mContext.getString(R.string.category_lunch);
        }
    }
}
