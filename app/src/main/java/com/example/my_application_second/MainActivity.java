package com.example.my_application_second;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Contacts;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //进入联系人页面:
        /*Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Contacts.People.CONTENT_URI);
        startActivity(intent);*/
        /*Button button1 = (Button) findViewById(R.id.button_1);

        button1.setOnClickListener(new View.OnClickListener() {
              public void onClick(View v){
                  Toast.makeText(MainActivity.this,"you clicked button 1", Toast.LENGTH_SHORT).show();
              }*/
        System.out.println("");

        }



    }


