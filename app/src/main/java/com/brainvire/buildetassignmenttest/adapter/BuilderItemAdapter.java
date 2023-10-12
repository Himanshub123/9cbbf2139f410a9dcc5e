package com.brainvire.buildetassignmenttest.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.brainvire.buildetassignmenttest.R;

public class BuilderItemAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 0) {
            view = layoutInflater.inflate(R.layout.item_even, parent, false);
            return new BuildEvenItemViewHolder(view);

        } else {
            view = layoutInflater.inflate(R.layout.item_odd, parent, false);
            return new BuildOddItemViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        // BuilderItemModel builderItemModel = builderItemModels.get(position);
        if (holder instanceof BuildOddItemViewHolder) {
            BuildOddItemViewHolder buildOddItemViewHolder = (BuildOddItemViewHolder) holder;
            buildOddItemViewHolder.bind();
        } else {
            BuildEvenItemViewHolder buildEvenItemViewHolder = (BuildEvenItemViewHolder) holder;
            buildEvenItemViewHolder.bind();
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position % 2;
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class BuildOddItemViewHolder extends RecyclerView.ViewHolder {

        public BuildOddItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView imageView = itemView.findViewById(R.id.imageView);
            ImageView imageView2 = itemView.findViewById(R.id.imageView2);
            ImageView imageView3 = itemView.findViewById(R.id.imageView3);
            imageView.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.blue));
            imageView2.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.blue));
            imageView3.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.blue));
        }

        public void bind() {
        }
    }

    public class BuildEvenItemViewHolder extends RecyclerView.ViewHolder {
        public BuildEvenItemViewHolder(@NonNull View itemView) {
            super(itemView);
            ImageView imageView2 = itemView.findViewById(R.id.imageView2);
            ImageView imageView3 = itemView.findViewById(R.id.imageView3);
            ImageView imageView4 = itemView.findViewById(R.id.imageView4);
            ImageView imageView5 = itemView.findViewById(R.id.imageView5);
            imageView2.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.red));
            imageView3.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.red));
            imageView4.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.red));
            imageView5.setBackgroundColor(ContextCompat.getColor(itemView.getContext(), R.color.red));
        }

        public void bind() {
        }
    }
}
