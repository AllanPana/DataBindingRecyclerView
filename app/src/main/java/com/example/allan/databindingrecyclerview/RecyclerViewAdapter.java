package com.example.allan.databindingrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.allan.databindingrecyclerview.databinding.SportDataBinding;

import java.util.List;

/**
 * Created by Allan on 22/11/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private Context context;
    private List<SportViewModel> sportViewList;
    private LayoutInflater  layoutInflater;

    public RecyclerViewAdapter(Context context, List<SportViewModel> sportViewList) {
        this.context = context;
        this.sportViewList = sportViewList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (layoutInflater == null){
            layoutInflater = LayoutInflater.from(parent.getContext());
        }
        SportDataBinding binding = SportDataBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final SportViewModel model = sportViewList.get(position);
        holder.bind(model);

        final SportDataBinding binding = holder.getSportdataBinding();
        binding.setHandler(new ImageButtonClickHandler() {
            @Override
            public void onImageButtonClick() {

               if (model.imgSrcId.get() == android.R.drawable.ic_menu_add){
                   model.imgSrcId.set(android.R.drawable.ic_menu_delete);
                   Toast.makeText(context, "sport deleted to favorites", Toast.LENGTH_LONG).show();
               }else {
                   model.imgSrcId.set(android.R.drawable.ic_menu_add);
                   Toast.makeText(context, "sport added to favorites", Toast.LENGTH_LONG).show();
               }
            }
        });

        binding.setItemClick(new RecyclerViewItemClick() {
            @Override
            public void onItemClick() {
                Toast.makeText(context, "item lick " + position, Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public int getItemCount() {
//        return sportViewList == null ? 0 : sportViewList.size();
        return sportViewList.size();
    }
}
