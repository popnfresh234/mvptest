package com.dmtaiwan.alexander.mvptest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;


public class MainActivity extends Activity implements MainView,View.OnClickListener {

    private ProgressBar mProgressbar;
    private TextView mTextView;
    private Button mButton;
    private Presenter mPresenter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressbar = (ProgressBar) findViewById(R.id.progressBar);
        mTextView = (TextView) findViewById(R.id.textView);
        mButton = (Button) findViewById(R.id.press_me);
        mButton.setOnClickListener(this);
        mPresenter = new PresenterImplementation(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onResume();
    }

    @Override
    public void hideSpinner() {
        mProgressbar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void showProgress() {
        mProgressbar.setVisibility(View.VISIBLE);
        mTextView.setVisibility(View.INVISIBLE);
    }

    @Override
    public void hideProgress() {
        mProgressbar.setVisibility(View.INVISIBLE);
        mTextView.setVisibility(View.VISIBLE);
    }

    @Override
    public void setText(String text) {
        mTextView.setText(text);
    }

    @Override
    public void onClick(View v) {
        mPresenter.getText();
    }
}
