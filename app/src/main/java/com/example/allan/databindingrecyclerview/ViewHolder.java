package com.example.allan.databindingrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.allan.databindingrecyclerview.databinding.SportDataBinding;
import com.example.allan.databindingrecyclerview.databinding.SportDataBinding;

/**
 * Created by Allan on 22/11/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    private SportDataBinding mSportdataBinding;

    public ViewHolder(SportDataBinding sportdataBinding) {
        super(sportdataBinding.getRoot());
        mSportdataBinding = sportdataBinding;
    }

    public  void bind(SportViewModel viewModel){
        mSportdataBinding.setViewModel(viewModel);
    }

    public SportDataBinding getSportdataBinding(){
        return mSportdataBinding;
    }
}
