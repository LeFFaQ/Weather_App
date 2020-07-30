package com.lffq.wapper.ui.home;


import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lffq.wapper.R;
import com.lffq.wapper.network.models.current.Current;
import com.squareup.picasso.NetworkPolicy;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Target;


import static android.content.ContentValues.TAG;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    TextView temp;
    RelativeLayout relativeLayout;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        temp = v.findViewById(R.id.temp);
        relativeLayout = v.findViewById(R.id.fragment_1_background);

        /*Picasso.with(getActivity()).load(R.drawable.aftermoon).resize(get).into(new Target(){

            @Override
            public void onBitmapLoaded(Bitmap bitmap, Picasso.LoadedFrom from) {
                relativeLayout.setBackground(new BitmapDrawable(v.getResources(), bitmap));
            }

            @Override
            public void onBitmapFailed(final Drawable errorDrawable) {
                Log.d("TAG", "FAILED");
            }

            @Override
            public void onPrepareLoad(final Drawable placeHolderDrawable) {
                Log.d("TAG", "Prepare Load");
            }
        });*/
        homeViewModel.dating();

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                homeViewModel.getCurrent().observe(getViewLifecycleOwner(), new Observer<Current>() {
                    @Override
                    public void onChanged(Current current) {
                        Log.d(TAG, "onChanged: " + current.getMain().getTemp().toString());
                        temp.setText(current.getMain().getTemp().toString());
                    }

                });
            }
        }, 1000);

        return v;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}