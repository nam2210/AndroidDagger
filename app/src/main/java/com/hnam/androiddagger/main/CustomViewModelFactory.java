package com.hnam.androiddagger.main;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;

public class CustomViewModelFactory implements ViewModelProvider.Factory {

    int status;

    public CustomViewModelFactory(int status){
        this.status = status;
    }

    @Override
    public <T extends ViewModel> T create(Class<T> modelClass) {
        if (!modelClass.getSimpleName().equalsIgnoreCase("MyViewModel")){
            try {
                return  modelClass.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;

            }
        } else {
            return (T) new MyViewModel(status);
        }

    }
}
