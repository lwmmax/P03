package com.example.llx_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        BottomNavigationView bottomNavigationView  = findViewById(R.id.bottomNavigationView);
//        NavController navcontroller = Navigation.findNavController(this,R.id.fragment);
//        AppBarConfiguration configuration =
//                new AppBarConfiguration.Builder(bottomNavigationView.getMenu()).build();
//        NavigationUI.setupActionBarWithNavController(this,navcontroller,configuration);
//        NavigationUI.setupWithNavController(bottomNavigationView,navcontroller);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this,R.id.fragment);
        AppBarConfiguration configuration =
                new AppBarConfiguration.Builder(bottomNavigationView.getMenu()).build();
        NavigationUI.setupActionBarWithNavController(this,navController,configuration);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);


    }
}