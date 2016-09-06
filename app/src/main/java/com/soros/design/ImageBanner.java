package com.soros.design;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.flyco.banner.widget.Banner.BaseIndicatorBanner;

/**
 * Created by Dev-04 on 2016/9/5 0005.
 */

public class ImageBanner extends BaseIndicatorBanner<String, ImageBanner> {

    private ColorDrawable colorDrawable;
    public ImageBanner(Context context) {
        this(context, null, 0);
    }

    public ImageBanner(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ImageBanner(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        colorDrawable = new ColorDrawable(Color.parseColor("#555555"));
    }

    @Override
    public void onTitleSlect(TextView tv, int position) {
        tv.setText("position:" + position);
    }

    @Override
    public View onCreateItemView(int position) {
        View view = View.inflate(getContext(), R.layout.image_layout, null);

        ImageView iv = (ImageView) view.findViewById(R.id.pagerImage);

        final String url = mDatas.get(position);
        Glide.with(getContext())
                .load(url)
                .placeholder(colorDrawable)
                .into(iv);
        return view;
    }
}
