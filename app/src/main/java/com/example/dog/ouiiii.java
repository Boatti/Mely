package com.example.dog;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ouiiii extends AppCompatActivity {

    TextView guest;
    Button register2,login2,buttonult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ouiiii);

        register2 = findViewById(R.id.register2);
        login2 = findViewById(R.id.login2);





        register2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ouiiii.this, oui2.class));
            }
        });

        login2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ouiiii.this,oui2.class));
            }
        });

        /*buttonult = (Button)findViewById(R.id.buttonult);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.travis);
        buttonult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp.start();

            }
        });*/

    }
}