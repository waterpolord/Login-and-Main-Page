package com.proyectoclase.e_comerce.ui.listOS;

import android.media.Image;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.proyectoclase.e_comerce.R;

public class listOSView extends ViewModel {

    int imageView;
    String name;
    String version;

    public listOSView(){

    }
    public listOSView(int avatar,String name, String version) {
        this.imageView = avatar;
        this.name = name;
        this.version = version;

    }

    public int getImageView() {
        return imageView;
    }

    public String getName() {
        return name;
    }


    public String getVersion() {
        return version;
    }


}