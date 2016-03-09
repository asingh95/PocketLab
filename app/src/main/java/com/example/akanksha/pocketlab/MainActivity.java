package com.example.akanksha.pocketlab;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

   //private static final String POSTGRESS_DRIVER = "org.postgresql.Driver";

    //public static String currentUser = "";

    Activity mSelf = this;
    TextView resultArea;
    Button loginButton;
    Button makeUserButton;
    EditText loginline;
    EditText passline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultArea = (TextView) findViewById(R.id.text_view);
        loginButton = (Button) findViewById(R.id.next_activity_button);
        makeUserButton = (Button) findViewById(R.id.make_new_user_button);
        loginline = (EditText) findViewById(R.id.enter_username);
        passline = (EditText) findViewById(R.id.enter_password);
        resultArea.setText("");

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mSelf, HomeScreen.class);
                startActivity(intent);
            }
        });
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
