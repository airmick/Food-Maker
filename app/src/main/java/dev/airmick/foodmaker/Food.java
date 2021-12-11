package dev.airmick.foodmaker;

public class Food {
    private String mFoodName;
    private String mFoodDescription;

    public Food(String mFoodName, String mFoodDescription){
        this.mFoodName = mFoodName;
        this.mFoodDescription = mFoodDescription;
    }

    public String getFoodName() {
        return mFoodName;
    }

    public String getFoodDescription() {
        return mFoodDescription;
    }

    @Override
    public String toString() {
        return "Food{" +
                "mFoodName='" + mFoodName + '\'' +
                ", mFoodDescription='" + mFoodDescription + '\'' +
                '}';
    }
}
