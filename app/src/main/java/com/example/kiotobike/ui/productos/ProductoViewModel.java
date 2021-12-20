package com.example.kiotobike.ui.productos;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProductoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProductoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Estos son nuestros productos");

    }


    public LiveData<String> getText() {
        return mText;
    }
}