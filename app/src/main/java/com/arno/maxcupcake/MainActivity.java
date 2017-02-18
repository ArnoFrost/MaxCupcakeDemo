package com.arno.maxcupcake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static Toast mToast = null;

    public void showToast(int resId) {
        if (mToast == null) {
            mToast = Toast.makeText(getApplicationContext(), resId, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(resId);
        }
        mToast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_movie).setOnClickListener(this);
        findViewById(R.id.button_share).setOnClickListener(this);
        findViewById(R.id.button_reader).setOnClickListener(this);
        findViewById(R.id.button_news).setOnClickListener(this);
        findViewById(R.id.button_graduation).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_movie:
                showToast(R.string.str_movieClick);
                break;
            case R.id.button_share:
                showToast(R.string.str_shareClick);
                break;
            case R.id.button_reader:
                showToast(R.string.str_readerClick);
                break;
            case R.id.button_news:
                showToast(R.string.str_newsClick);
                break;
            case R.id.button_graduation:
                showToast(R.string.str_graduationClick);
                break;

            default:
                break;
        }
    }
}
