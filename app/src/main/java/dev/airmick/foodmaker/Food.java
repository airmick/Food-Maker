package dev.airmick.foodmaker;

public class Food {
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
}
