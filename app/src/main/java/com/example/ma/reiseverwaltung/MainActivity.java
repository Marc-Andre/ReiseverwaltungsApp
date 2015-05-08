package com.example.ma.reiseverwaltung;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class    MainActivity extends ActionBarActivity {
    private Reiseverwaltung m_Reiseverwaltung;
    private EditText m_TxtReisenummer;

    public void BtnReiseBewertenClick(View view) {
        m_Reiseverwaltung.Kontaktdaten.nachname = m_TxtReisenummer.getText().toString();

        Intent intent = new Intent(MainActivity.this,BewertungActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m_TxtReisenummer = (EditText) findViewById(R.id.txtReisenummer);
        m_Reiseverwaltung = ((Reiseverwaltung) getApplicationContext());
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
