package com.hnam.androiddagger.database;

import android.content.Context;

/**
 * Created by nampham on 12/23/18.
 */
public class DBService {
    private Context context;
    public DBService(Context context){
        this.context = context;
    }

    @Override
    public String toString() {
        return "DBService{" +
                "context=" + context +
                '}';
    }
}
