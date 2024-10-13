package com.example.homework3_thrdmnth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {
    private final LayoutInflater inflater;
    private final ArrayList<Food>  dishes;


    public MenuAdapter(LayoutInflater inflater, ArrayList<Food> dishes) {
        this.inflater = inflater;
        this.dishes = dishes;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
     Food dish = dishes.get(position);
     holder.onBind(dish);
    }

    @Override
    public int getItemCount() {
        return dishes.size();
    }
}
