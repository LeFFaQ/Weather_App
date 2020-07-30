package com.lffq.wapper.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lffq.wapper.R;

public class DashboardFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Инфлейтер для ui
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        //final TextView textView = root.findViewById(R.id.text_dashboard);

        return root;
    }
}