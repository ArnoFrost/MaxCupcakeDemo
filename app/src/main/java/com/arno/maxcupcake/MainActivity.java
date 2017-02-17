package com.arno.maxcupcake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_movie;
    private Button btn_share;
    private Button btn_reader;
    private Button btn_news;
    private Button btn_graduation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_movie = (Button) findViewById(R.id.button_movie);
        btn_share = (Button) findViewById(R.id.button_share);
        btn_reader = (Button) findViewById(R.id.button_reader);
        btn_news = (Button) findViewById(R.id.button_news);
        btn_graduation = (Button) findViewById(R.id.button_graduation);

        btn_movie.setOnClickListener(this);
        btn_share.setOnClickListener(this);
        btn_reader.setOnClickListener(this);
        btn_news.setOnClickListener(this);
        btn_graduation.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_movie:
                Show_Toast("You have touch the Button Movie", false);
                break;
            case R.id.button_share:
                Show_Toast("You have touch the Button Share", false);
                break;
            case R.id.button_reader:
                Show_Toast("You have touch the Button Reader", false);
                break;
            case R.id.button_news:
                Show_Toast("You have touch the Button News", false);
                break;
            case R.id.button_graduation:
                Show_Toast("You have touch the Button Graduation", false);
                break;

            default:
                break;
        }
    }

    private void Show_Toast(String str, Boolean time) {
        if (time) {
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, str, Toast.LENGTH_SHORT).show();

        }
    }
}
