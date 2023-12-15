package com.example.joruriicusheba;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toobar_menu,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {



        if(item.getItemId() == R.id.signInPage)
        {
            Intent intent = new Intent(getApplicationContext(), Login.class);
            startActivity(intent);
        }
        if(item.getItemId() == R.id.signupPage)
        {
            Intent intent = new Intent(getApplicationContext(), Register.class);
            startActivity(intent);
        }
        return true;
    }
}