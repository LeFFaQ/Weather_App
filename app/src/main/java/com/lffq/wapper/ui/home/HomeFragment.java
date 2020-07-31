package com.lffq.wapper.ui.home;


import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.lffq.wapper.MyLocation;
import com.lffq.wapper.R;

import static android.content.ContentValues.TAG;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    TextView temp;
    TextView temp_fl;
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
            temp_fl = v.findViewById(R.id.temp_fl);
        relativeLayout = v.findViewById(R.id.fragment_1_background);

        EditText btn123 = v.findViewById(R.id.etexter);
        btn123.setOnKeyListener((v1, keyCode, event) -> {
            if (keyCode==KeyEvent.KEYCODE_ENTER) {
                homeViewModel.getCurrent(btn123.getText().toString()).observe(getViewLifecycleOwner(), current -> {
                    //Log.d(TAG, "onChanged: " + current.getMain().getTemp().toString());
                    temp.setText(Math.round(current.getMain().getTemp()) + "˚");
                    temp_fl.setText(Math.round(current.getMain().getFeelsLike()) + "˚");
                });
                return true;
            }

            return false;
        });

        MyLocation.LocationResult locationResult = new MyLocation.LocationResult(){
            @Override
            public void gotLocation(Location location){
                Log.d(TAG, "gotLocation: " + location.getLongitude());
            }
        };
        MyLocation myLocation = new MyLocation();
        myLocation.getLocation(HomeFragment.this, locationResult);
/*
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {

                homeViewModel.getCurrent().observe(getViewLifecycleOwner(), new Observer<Current>() {
                    @Override
                    public void onChanged(Current current) {
                        //Log.d(TAG, "onChanged: " + current.getMain().getTemp().toString());
                        temp.setText(Math.round(current.getMain().getTemp()) + "˚");
                        temp_fl.setText(Math.round(current.getMain().getFeelsLike()) + "˚");
                    }

                });
            }
        }, 1000);
*/
        return v;
    }



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

    }
}