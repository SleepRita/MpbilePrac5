package com.example.task5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i = getIntent();

        RecyclerView recyclerView = findViewById(R.id.list);
        //Устанавливает макет отображения - гориозонтально
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Пример списка строк
        List <String> items = Arrays.asList("Мейн-кун - крупная и общительная кошка, что может быть причиной того, что ее называют нежным гигантом",
                        "Помимо умилительной внешности у шотландской вислоухой кошки еще и замечательный характер.",
                        "Экзотическая кошка — довольно молодая порода, которая появилась совершенно случайно в 1960-х годах.");

        List <Integer> items2 = Arrays.asList(R.drawable.meinkun, R.drawable.vislouhaya, R.drawable.eksot);
        //Создаем адаптер
        ActivityRecycler adapter = new ActivityRecycler(items, items2);
        //Устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
}
