package com.dmtaiwan.alexander.mvptest;

/**
 * Created by Alexander on 3/17/2015.
 */
public interface MainView {

    public void hideSpinner();

    public void showProgress();

    public void hideProgress();

    public void setText(String text);

}
