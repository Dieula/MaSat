package dieula.MaSat.activities;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import dieula.MaSat.R;
import dieula.MaSat.fragment.ManbaFragment;


public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageView btnbuy = (ImageView) findViewById(R.id.btnbuy);
        btnbuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailsActivity.this, CommandeActivity.class);
                startActivity(i);
            }
        });

      FloatingActionButton  btshare = (FloatingActionButton)findViewById(R.id.btnshare);
        btshare.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
                // Respond to the action bar's Up/Home button
            case android.R.id.home:
                // Respond to the action bar's Up/Home button
                Intent i = new Intent(DetailsActivity.this, MaSatActivity.class);
                startActivity(i);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
