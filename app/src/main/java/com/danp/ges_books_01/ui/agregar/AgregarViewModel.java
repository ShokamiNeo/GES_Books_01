package com.danp.ges_books_01.ui.agregar;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AgregarViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AgregarViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Interfaz para agregar reseñas.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}