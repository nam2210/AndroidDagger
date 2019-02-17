package com.hnam.androiddagger.main;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import com.hnam.androiddagger.MyApp;
import com.hnam.androiddagger.R;
import com.hnam.androiddagger.database.ApiService;
import com.hnam.androiddagger.database.DBService;
import com.hnam.androiddagger.detail.DetailScreenActivity;
import com.hnam.androiddagger.di.UserComponent.UserHelpers;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainScreenActivity extends AppCompatActivity implements MainContract.View{
    private static final String TAG = MainScreenActivity.class.getSimpleName();

    @Inject
    MainContract.Presenter presenter;

    @Inject
    MainContract.View mView;

    @Inject
    ApiService apiService;

    @Inject
    DBService dbService;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(MainScreenActivity.this);
        presenter.mainTest();
        Log.e(TAG,"mView=" + mView.toString());
        Log.e(TAG,"apiService=" + apiService.toString());
        Log.e(TAG,"dbService=" + dbService.toString());


        setContentView(R.layout.activity_main_screen);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                ((MyApp)getApplication()).getUserManager().createComponent();
                Intent i  = new Intent(MainScreenActivity.this, DetailScreenActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
//        if (userHelpers == null){
//            Log.e(TAG,"userHelper == null");
//        } else {
//            Log.e(TAG,"userHelper="+userHelpers.toString());
//        }
    }

    @Override
    public void showUI() {
        Log.e(TAG, "show UI ---> ");
    }
}
