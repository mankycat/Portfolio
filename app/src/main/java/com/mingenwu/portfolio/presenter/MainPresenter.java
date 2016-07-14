package com.mingenwu.portfolio.presenter;

import android.view.View;

import com.mingenwu.portfolio.view.MainView;

/**
 * Created by Bruce on 16/7/13.
 */
public class MainPresenter {

    private MainView view;

    public MainPresenter(MainView view){
        this.view = view;
    }

    public void onButtonClick(View v){
        view.toastMessage(v);
    }

}
