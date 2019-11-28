package com.bignerdranch.android.amplitudo4.ui.Notifications;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bignerdranch.android.amplitudo4.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel mViewModel;

    public static NotificationsFragment newInstance() {
        return new NotificationsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.notifications_fragment, container, false);
        mViewModel = ViewModelProviders.of(this).get(NotificationsViewModel.class);

        final TextView textView = root.findViewById(R.id.notifications_text);
        mViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //mViewModel = ViewModelProviders.of(this).get(NotificationsViewModel.class);
        // TODO: Use the ViewModel
    }

}
