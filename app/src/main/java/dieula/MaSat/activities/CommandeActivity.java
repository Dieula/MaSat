package dieula.MaSat.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import dieula.MaSat.R;


public class CommandeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commande);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    Button btnCarte = (Button) findViewById(R.id.btnCarte);
        btnCarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CommandeActivity.this, ReussiActivity.class);
                startActivity(i);
              //  Toast.makeText(getBaseContext(), "Votre commande a été fait avec succès", Toast.LENGTH_SHORT).show();

            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                // Respond to the action bar's Up/Home button
                Intent i = new Intent(CommandeActivity.this, MaSatActivity.class);
                startActivity(i);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
