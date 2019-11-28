package com.bignerdranch.android.amplitudo4.ui.Search;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SearchViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> text;

    public SearchViewModel(MutableLiveData<String> text) {
        this.text = new MutableLiveData<>();
        text.setValue("Edit to search here");
    }

    public LiveData<String> getText() {
        return text;
    }
}
