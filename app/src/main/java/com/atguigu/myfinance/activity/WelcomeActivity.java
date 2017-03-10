package com.atguigu.myfinance.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;

import com.atguigu.myfinance.R;

public class WelcomeActivity extends AppCompatActivity {
 private Handler handler = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        startMainActivity();
    }

    private void startMainActivity() {

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);

            startActivity(intent);
                finish();
            }
        },2000);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if(event.getAction()==MotionEvent.ACTION_DOWN) {
            startMainActivity();
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacksAndMessages(null);
    }
}
