package com.lffq.wapper.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.lffq.wapper.R;

public class NotificationsFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Инфлейтер для ui
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);

        //final TextView textView = root.findViewById(R.id.text_notifications);

        return root;
    }
}