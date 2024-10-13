package com.example.homework3_thrdmnth;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;


public class MenuViewHolder extends RecyclerView.ViewHolder {
    private ImageView foodImage;
    private TextView  tvName, tvDescription,tvPrice;



    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
      foodImage = itemView.findViewById(R.id.iv_roll);
      tvName= itemView.findViewById(R.id.tv_name);
      tvDescription = itemView.findViewById(R.id.tv_desc);
      tvPrice= itemView.findViewById(R.id.tv_price);
    }

    void onBind (Food food){
        Glide.with(foodImage.getContext()).load(food.getImage()).into(foodImage);
        tvName.setText(food.getName());
         tvDescription.setText(food.getDesc());
         tvPrice.setText(food.getPrice());
    }
}
