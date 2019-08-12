package com.developer.lab7;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Bai4 extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {
private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        bottomNavigationView=findViewById(R.id.btnavigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.a:
                toas("Android");
                break;
            case R.id.b:
                toas("Home");
                break;
            case R.id.c:
                toas("Setting");
                break;

        }
        return true;
    }

    private void toas(String mes){
        Toast.makeText(this, mes, Toast.LENGTH_SHORT).show();
    }
}
