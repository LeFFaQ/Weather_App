package com.lffq.wapper.network;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class PicassoDownload {
    private Context context;

    public PicassoDownload(Context context) {
        this.context = context;
    }

    public void CallPicasso(Uri u, ImageView i) {
        Picasso.with(context)
                .load(u)
                .into(i);
    }

}
