package com.abdulaziz.myaappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Portfolio extends ActionBarActivity {

    //Protfolio buttons
    private Button Spotify, Scores, Library, Bigger, Reader, Capstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        Spotify = (Button) findViewById(R.id.Spotify);
        Scores = (Button) findViewById(R.id.Scores);
        Library = (Button) findViewById(R.id.Library);
        Bigger = (Button) findViewById(R.id.Bigger);
        Reader = (Button) findViewById(R.id.Reader);
        Capstone = (Button) findViewById(R.id.Capstone);


        //Set listener for Spotify Streamer
        Spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch Spotify Streamer",
                        Toast.LENGTH_LONG).show();
            }
        });


        //Set listener for Scores App
        Scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will Scores App",
                        Toast.LENGTH_LONG).show();
            }
        });


        //Set listener for Library App
        Library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch Library App",
                        Toast.LENGTH_LONG).show();
            }
        });


        //Set listener for Build it Bigger App
        Bigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch Build it Bigger App",
                        Toast.LENGTH_LONG).show();
            }
        });


        //Set listener for XYZ Reader App
        Reader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch XYZ Reader App",
                        Toast.LENGTH_LONG).show();
            }
        });


        //Set listener for XYZ Reader App
        Capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "This button will launch My Own App",
                        Toast.LENGTH_LONG).show();
            }
        });



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
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
