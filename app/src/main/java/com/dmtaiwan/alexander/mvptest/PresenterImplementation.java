package com.dmtaiwan.alexander.mvptest;

/**
 * Created by Alexander on 3/17/2015.
 */
public class PresenterImplementation implements Presenter{

    private MainView mMainView;
    private Model mModel;

    public PresenterImplementation(MainView mainView) {
        mMainView = mainView;
        mModel = new ModelImplementation();
    }

    @Override
    public void onResume() {
        mMainView.hideSpinner();
    }

    @Override
    public void getText() {
        mMainView.setText(mModel.getText());
    }
}
