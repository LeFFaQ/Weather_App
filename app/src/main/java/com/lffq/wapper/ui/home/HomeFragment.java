package com.lffq.wapper.ui.home;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.lffq.wapper.MainActivity;
import com.lffq.wapper.R;
import com.lffq.wapper.SplashActivity;
import com.lffq.wapper.network.NetworkService;
import com.lffq.wapper.network.models.current.Current;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private String key = "e54d7937d6b33fe4b72b8ecbaf29c10b";

    SharedPreferences sPrefs;

    TextView temp;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        temp = v.findViewById(R.id.temp);

        Button btn = v.findViewById(R.id.b123);
        btn.setOnClickListener(this::onClick);

        new Handler().postDelayed(() -> homeViewModel.getCurrent().observe(getViewLifecycleOwner(), current -> {

            temp.setText(current.getMain().getTemp().toString());

        }),2000);

        return v;
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b123:

                break;
        }
    }


}