package dev.airmick.foodmaker;

import java.util.Comparator;

public class Food implements Comparable<Food>{
    private String mFoodName;
    private String mFoodDescription;
    private int mFoodImage;

    public Food(String mFoodName, String mFoodDescription, int mFoodImage){
        this.mFoodImage = mFoodImage;
        this.mFoodName = mFoodName;
        this.mFoodDescription = mFoodDescription;
    }

    public String getFoodName() {
        return mFoodName;
    }

    public String getFoodDescription() {
        return mFoodDescription;
    }

    public int getFoodImage(){
        return mFoodImage;
    }

    @Override
    public String toString() {
        return "Food{" +
                "mFoodName='" + mFoodName + '\'' +
                ", mFoodDescription='" + mFoodDescription + '\'' +
                '}';
    }

    @Override
    public int compareTo(Food food) {
        if (getFoodName() == null || food.getFoodName() == null) {
            return 0;
        }
        return getFoodName().compareToIgnoreCase(food.getFoodName());
    }
}
