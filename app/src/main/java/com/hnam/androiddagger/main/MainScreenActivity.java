package com.hnam.androiddagger.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.hnam.androiddagger.R;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainScreenActivity extends AppCompatActivity implements MainContract.View{
    private static final String TAG = MainScreenActivity.class.getSimpleName();

    @Inject
    MainContract.Presenter presenter;

    @Inject
    CustomViewModelFactory factory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);

        MyViewModel model = ViewModelProviders.of(this, factory).get(MyViewModel.class);
        Log.e(TAG,"factory==" + factory.toString());
        Log.e(TAG,"model==" + model.toString());
        presenter.mainTest();

        setContentView(R.layout.activity_main_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public void showUI() {
        Log.e(TAG, "show UI ---> ");
    }
}
