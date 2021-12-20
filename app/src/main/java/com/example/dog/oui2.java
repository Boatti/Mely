package com.example.dog;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class oui2 extends AppCompatActivity {

    BottomNavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oui2);

        music_fragment nearbyFragment = (music_fragment) getSupportFragmentManager().findFragmentById(R.id.navigation_music);



        navigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.body_container, new music_fragment()).commit();
        navigationView.setSelectedItemId(R.id.navigation_music);

        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                Fragment fragment = null;

                switch(item.getItemId()){
                    case R.id.navigation_music:
                        fragment = new music_fragment();
                        break;
                    case R.id.navigation_news:
                        fragment = new news_fragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.body_container, fragment).commit();
                return true;
            }
            private static final String TAG = "Myact";

            private void openFragment(Fragment fragment) {


                Log.d(TAG, "openFragment: ");
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //this is a helper class that replaces the container with the fragment. You can replace or add fragments.
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null); //if you add fragments it will be added to the backStack. If you replace the fragment it will add only the last fragment
                transaction.commit(); // commit() performs the action
            }


        });




    }
}