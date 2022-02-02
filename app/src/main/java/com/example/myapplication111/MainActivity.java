package com.example.myapplication111;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.common.util.NumberUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText uname,pwd;
        uname=findViewById(R.id.uname);
        pwd=findViewById(R.id.pwd);
        Button login=findViewById(R.id.button);





        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String un=uname.getText().toString();
                try{
                Integer un1=Integer.parseInt(un);}
                catch (Exception e){

                }
                Boolean b1;
                b1=isNumeric(un);
                if(uname.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter a username or phone number", Toast.LENGTH_SHORT).show();
                }
                else if(pwd.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Please Enter a  passowrd", Toast.LENGTH_SHORT).show();
                }
                else if(b1==Boolean.FALSE){
                    if((un.endsWith(".com")==false)){
                        Toast.makeText(getApplicationContext(), "Please Enter a valid email", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if((un.equals("anushka.mca20@gmail.com"))&&(pwd.getText().toString().equals("anushka@123"))){
                            Toast.makeText(getApplicationContext(), "Login successfull", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
                        }
                    }
                    Intent intent=new Intent(MainActivity.this,home.class);

                    startActivity(intent);


                }
                else if(b1==Boolean.TRUE){
                    if(un.length()!=10){
                        Toast.makeText(getApplicationContext(),"Please enter a valid number",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        if((un.toString().equals("8550882997"))&&(pwd.getText().toString().equals("anushka@123"))){
                            Toast.makeText(getApplicationContext(), "Login successfull", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Login Unsuccessfull", Toast.LENGTH_SHORT).show();
                        }
                    }Intent intent=new Intent(MainActivity.this,home.class);

                    startActivity(intent);


                }

            }
        });
    }
    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}