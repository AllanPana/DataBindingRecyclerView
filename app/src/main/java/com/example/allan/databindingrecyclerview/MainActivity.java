package com.example.allan.databindingrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(new RecyclerViewAdapter(this, getData()));
    }

    private List<SportViewModel> getData(){
        List <SportViewModel> data = new ArrayList<>();
        SportViewModel model = new SportViewModel();
        model.sportName = "Football";
        model.imgSrcId.set(android.R.drawable.ic_menu_delete);

        SportViewModel model1 = new SportViewModel();
        model1.sportName = "Hockey";
        model1.imgSrcId.set(android.R.drawable.ic_menu_add);

        SportViewModel model2 = new SportViewModel();
        model2.sportName = "Bowling";
        model2.imgSrcId.set(android.R.drawable.ic_menu_delete);

        SportViewModel model3 = new SportViewModel();
        model3.sportName = "Basketball";
        model3.imgSrcId.set(android.R.drawable.ic_menu_add);

        SportViewModel model4 = new SportViewModel();
        model4.sportName = "Swimming";
        model4.imgSrcId.set(android.R.drawable.ic_menu_add);

        SportViewModel model5 = new SportViewModel();
        model5.sportName = "Tennis";
        model5.imgSrcId.set(android.R.drawable.ic_menu_delete);

        SportViewModel model6 = new SportViewModel();
        model6.sportName = "Boxing";
        model6.imgSrcId.set(android.R.drawable.ic_menu_add);

        SportViewModel model7 = new SportViewModel();
        model7.sportName = "Hurling";
        model7.imgSrcId.set(android.R.drawable.ic_menu_delete);

        data.add(model);
        data.add(model1);
        data.add(model2);
        data.add(model3);
        data.add(model4);
        data.add(model5);
        data.add(model6);
        data.add(model7);
        return data;
    }
}
