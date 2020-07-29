package com.lffq.wapper.ui.home;


import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.lffq.wapper.R;
import com.lffq.wapper.network.models.current.Current;


import java.util.concurrent.atomic.AtomicMarkableReference;

import static android.content.ContentValues.TAG;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    TextView temp;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if (savedInstanceState != null) {
            //Restore the fragment's state here
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        //Save the fragment's state here
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        temp = v.findViewById(R.id.temp);

        Button btn = v.findViewById(R.id.b123);
        btn.setOnClickListener(this::onClick);

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



    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.b123:

                break;
        }
    }


}