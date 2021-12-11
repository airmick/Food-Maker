package dev.airmick.foodmaker;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    protected static class FoodViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout containerView;
        private TextView textView;

        FoodViewHolder(View view) {
            super(view);
            containerView = view.findViewById(R.id.food_row);
            textView = view.findViewById(R.id.food_row_text_view);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Food current = (Food) containerView.getTag();
                    Intent intent = new Intent(view.getContext(), FoodActivity.class);
                    intent.putExtra("name", current.getFoodName());
                    intent.putExtra("description", current.getFoodDescription());

                    view.getContext().startActivity(intent);
                }
            });
        }
    }

    private List<Food> foodList = Arrays.asList(
            new Food("Apple", "fruits"),
            new Food("Orange", "my favorite one"),
            new Food("Pineapple", "once eaten never get tired of it.")
    );

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_row, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food current = foodList.get(position);
        holder.textView.setText(current.getFoodName());
        holder.containerView.setTag(current);
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }
}
