package dieula.MaSat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import dieula.MaSat.R;


public class InscriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
    }

    public void OnLogButton(View v) {
        Intent i = new Intent(InscriptionActivity.this, MaSatActivity.class);
        startActivity(i);
    }
}