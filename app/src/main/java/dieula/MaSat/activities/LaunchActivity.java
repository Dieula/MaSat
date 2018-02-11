package dieula.MaSat.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import dieula.MaSat.R;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

        //create the splash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent i = new Intent(LaunchActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        },3000);
    }
}
