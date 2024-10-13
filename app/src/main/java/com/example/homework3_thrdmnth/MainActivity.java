package com.example.homework3_thrdmnth;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Food>dishes = new ArrayList<Food>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        loadData();
        initRV();
    }

    private void loadData() {
        dishes.add(new Food("Большая компания","Сет 48шт,пицца","https://wasabi.kg/wp-content/uploads/2023/02/6ea4a2d8-a659-4c39-b41b-d7a564defa33.jpg","3300 сом"));
        dishes.add(new Food("Сытный вечер","Роллы 16шт, пицца","https://wasabi.kg/wp-content/uploads/2023/02/f69064fe-34a7-4f41-a380-9084225d9508-280x280.png", "2300 сом"));
        dishes.add(new Food("Хот чикен","Куриные крылышки,фри","https://wasabi.kg/wp-content/uploads/2021/07/krylyshki-buffalo-400x400.jpg","1500 сом"));
        dishes.add(new Food("Сет роллы","Роллы 32шт","https://wasabi.kg/wp-content/uploads/2021/09/set-8.png","1999 сом"));
        dishes.add(new Food("Удон говядина","Лапша удон с говядиной","https://wasabi.kg/wp-content/uploads/2021/07/udon-govjadina.jpg","570 сом"));
    }

    private void initRV() {
        RecyclerView recyclerView = findViewById(R.id.rv_menu);
        MenuAdapter adapter = new MenuAdapter(this.getLayoutInflater(),dishes);
        recyclerView.setAdapter(adapter);
    }
}