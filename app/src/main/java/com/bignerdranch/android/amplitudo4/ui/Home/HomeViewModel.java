package com.bignerdranch.android.amplitudo4.ui.Home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> Text;

    public HomeViewModel() {
        Text = new MutableLiveData<>();
        Text.setValue("Welcome");
    }

    public LiveData<String> getText() {
        return Text;
    }
}
