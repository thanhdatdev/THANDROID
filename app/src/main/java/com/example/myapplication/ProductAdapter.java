package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ThingViewHolder> {
    private Context context;
    private LayoutInflater layoutInflater;
    private ArrayList<ProductEntity> productEntities;

    public ProductAdapter(Context context, ArrayList<ProductEntity> productEntities) {
        layoutInflater = LayoutInflater.from(context);
        this.productEntities = productEntities;
    }

    @NonNull
    @Override
    public ProductAdapter.ThingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_gridview,parent,false);
        return new ThingViewHolder(v,this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.ThingViewHolder holder, int position) {

        ProductEntity sp = productEntities.get(position);
        holder.txName.setText(sp.getName());
        holder.txNewPrice.setText(String.valueOf(sp.getNewPrice()));
        holder.txReducePercent.setText(String.valueOf(sp.getReducePercent()));
        holder.txPeopleRate.setText(String.valueOf(sp.getPeopleRate()));

        holder.img.setImageResource(sp.getImageThing());
        holder.ratingBar.setRating(sp.getRate());
    }

    @Override
    public int getItemCount() {
        return productEntities.size();
    }

    public class ThingViewHolder extends RecyclerView.ViewHolder {
        TextView txName, txNewPrice, txReducePercent, txPeopleRate;
        ImageView img;
        RatingBar ratingBar;

        ProductAdapter productAdapter;


        public ThingViewHolder(@NonNull View v, ProductAdapter productAdapter) {
            super(v);
            txName = v.findViewById(R.id.txName);
            txNewPrice = v.findViewById(R.id.txPrice);
            txReducePercent = v.findViewById(R.id.txtReducePercent);
            txPeopleRate = v.findViewById(R.id.txPeopleRate);
            img = v.findViewById(R.id.img);
            ratingBar = v.findViewById(R.id.Ratebar);
        }
    }
}
