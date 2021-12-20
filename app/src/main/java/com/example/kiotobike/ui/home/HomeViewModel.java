package com.example.kiotobike.ui.home;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Esta es la pagina de inicio");


    }

    public LiveData<String> getText() {
        return mText;
    }
}