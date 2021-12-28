package dev.airmick.foodmaker;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    private List localDataSet;
    private int mColorResourceId;


    protected static class FoodViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout containerView;
        private LinearLayout layout_container;
        private ImageView imageView;
        private TextView textView;
        private TextView textDescription;
        //final LinearLayoutCompat linearLayoutCompat;

        FoodViewHolder(View view) {
            super(view);
            containerView = view.findViewById(R.id.food_row);
            imageView = view.findViewById(R.id.image_id);
            textView = view.findViewById(R.id.food_row_text_view);
            textDescription = view.findViewById(R.id.food_row_description);
            //linearLayoutCompat = view.findViewById(R.id.linear_layout_compact);
            layout_container = view.findViewById(R.id.layout_container);

            containerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Food current = (Food) containerView.getTag();
                    Intent intent = new Intent(view.getContext(), FoodActivity.class);
                    intent.putExtra("name", current.getFoodName());
                    intent.putExtra("description", current.getFoodDescription());
                    intent.putExtra("image", current.getFoodImage());

                    view.getContext().startActivity(intent);
                }
            });
        }
    }

    /**
     * Initialize the dataset of the Adapter.
     *
     * @param dataSet List<Food> containing the data to populate views to be used
     * by RecyclerView.
     */
    public FoodAdapter(List dataSet, int color) {
        localDataSet = dataSet;
        mColorResourceId = color;
    }

    // Create new views (invoked by the layout manager)
    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.food_row, parent, false);
        return new FoodViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Food current = (Food) localDataSet.get(position);

        viewHolder.textView.setText(current.getFoodName());
        viewHolder.imageView.setImageResource(current.getFoodImage());
        viewHolder.textDescription.setText(current.getFoodDescription());
        viewHolder.layout_container.setBackgroundColor(ContextCompat.getColor(
                viewHolder.itemView.getContext(), mColorResourceId));
        viewHolder.containerView.setTag(current);
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.size();
    }
}
