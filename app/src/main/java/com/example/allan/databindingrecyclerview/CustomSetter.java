package com.example.allan.databindingrecyclerview;

import android.databinding.BindingAdapter;
import android.widget.ImageButton;

/**
 * Created by Allan on 22/11/2017.
 */

public class CustomSetter {

    @BindingAdapter("imageSrc")
    public static void setImgSrc(ImageButton imageButton, int resId){
        imageButton.setImageDrawable(imageButton.getContext().getDrawable(resId));

        //here you can load the drawable with glide  or any library
    }
}
