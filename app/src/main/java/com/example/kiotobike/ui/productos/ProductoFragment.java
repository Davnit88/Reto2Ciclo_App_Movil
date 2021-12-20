package com.example.kiotobike.ui.productos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.kiotobike.R;
import com.example.kiotobike.databinding.ActivityProductoFragmentBinding;
import com.example.kiotobike.databinding.FragmentGalleryBinding;
import com.example.kiotobike.ui.gallery.GalleryViewModel;

public class ProductoFragment extends Fragment {

    private ProductoViewModel productoViewModel;
    private ActivityProductoFragmentBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        productoViewModel =
                new ViewModelProvider(this).get(ProductoViewModel.class);

        binding = ActivityProductoFragmentBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textoproducto;
        productoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}