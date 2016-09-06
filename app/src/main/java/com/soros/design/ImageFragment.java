package com.soros.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Dev-04 on 2016/9/5 0005.
 */

public class ImageFragment extends Fragment {

    public static ImageFragment getInstance(String url) {
        ImageFragment instance = new ImageFragment();
        Bundle bundle = new Bundle();
        bundle.putString("image_url", url);
        instance.setArguments(bundle);
        return instance;
    }


    private String url;
    private ImageView imageView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(getArguments() != null) {
            this.url = getArguments().getString("image_url");
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.image_layout, null, false);
        imageView = (ImageView) view.findViewById(R.id.pagerImage);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Glide.with(this).load(url).into(imageView);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
