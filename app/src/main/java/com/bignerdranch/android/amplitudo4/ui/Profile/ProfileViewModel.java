package com.bignerdranch.android.amplitudo4.ui.Profile;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> Text;

    public ProfileViewModel(MutableLiveData<String> text) {
        Text = new MutableLiveData<>();
        Text.setValue("Profile page");
    }

    public MutableLiveData<String> getText() {
        return Text;
    }
}
