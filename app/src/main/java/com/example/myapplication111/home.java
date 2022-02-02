package com.example.myapplication111;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Locale;

public class home extends AppCompatActivity {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        b1=findViewById(R.id.hbutton);
        b2.findViewById(R.id.h2button);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double latitude=-37.3159;
                double longitude=81.1496;
                AlertDialog.Builder alert=new AlertDialog.Builder(getApplicationContext());
                alert.setMessage("Chose the application to view gps")
                        .setCancelable(true)
                        .setPositiveButton("Google Maps", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", latitude, longitude);
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Same app", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double latitude=-43.9509;
                double longitude=-34.4618;
                AlertDialog.Builder alert=new AlertDialog.Builder(getApplicationContext());
                alert.setMessage("Chose the application to view gps")
                        .setCancelable(true)
                        .setPositiveButton("Google Maps", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                String uri = String.format(Locale.ENGLISH, "geo:%f,%f", latitude, longitude);
                                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Same app", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
            }
        });
    }
}