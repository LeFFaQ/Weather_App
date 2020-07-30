package com.lffq.wapper.ui.home;


import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lffq.wapper.R;
import com.lffq.wapper.network.models.current.Current;

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
                homeViewModel.getCurrent(btn123.getText().toString()).observe(getViewLifecycleOwner(), new Observer<Current>() {
                    @Override
                    public void onChanged(Current current) {
                        //Log.d(TAG, "onChanged: " + current.getMain().getTemp().toString());
                        temp.setText(Math.round(current.getMain().getTemp()) + "˚");
                        temp_fl.setText(Math.round(current.getMain().getFeelsLike()) + "˚");
                    }

                });
                return true;
            }

            return false;
        });
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