
package com.hnam.androiddagger.detail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.hnam.androiddagger.R;
import com.hnam.androiddagger.di.UserComponent.UserHelpers;
import com.hnam.androiddagger.di.UserComponent.UserScope;
import com.hnam.androiddagger.main.MainScreenActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;


public class DetailScreenActivity extends AppCompatActivity {
    private static final String TAG = DetailScreenActivity.class.getSimpleName();
    @Inject
    UserHelpers userHelpers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);
        AndroidInjection.inject(this);
        Log.e(TAG, "helpers:" + userHelpers.toString());
    }
}
