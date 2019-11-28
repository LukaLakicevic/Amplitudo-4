package com.bignerdranch.android.amplitudo4.ui.Notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> Text;

    public NotificationsViewModel() {
        Text = new MutableLiveData<>();
        Text.setValue("This is notifications screen");
    }

    public LiveData<String> getText() {
        return Text;
    }
}
