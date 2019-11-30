package com.example.AuburnTour;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //https://imgbin.com/png/9c1CmQ4scopy Auburn Logo Resource


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //How Button1 works
        Button Sub1_Button = (Button) findViewById(R.id.SubButton1);
        Sub1_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub1Activity (Screen Transition)
            Intent move_main_sub1 = new Intent(MainActivity.this,sub1_Activity.class);
            startActivity(move_main_sub1);
            }
        });


        //How Maps Button works
        Button Sub2_Button = (Button) findViewById(R.id.SubButton2);
        Sub2_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub1Activity (Screen Transition)
                Intent move_main_sub2 = new Intent(MainActivity.this,sub2_Activity.class);
                startActivity(move_main_sub2);
            }
        });


        //How Button3 works
        Button Sub3_Button = (Button) findViewById(R.id.SubButton3);
        Sub3_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub3Activity (Screen Transition)
                Intent move_main_sub3 = new Intent(MainActivity.this,sub3_Activity.class);
                startActivity(move_main_sub3);
            }
        });


        //How Button works
        Button Sub4_Button = (Button) findViewById(R.id.SubButton4);
        Sub4_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Move to next Sub43Activity (Screen Transition)
                Intent move_main_sub4 = new Intent(MainActivity.this,sub4_Activity.class);
                startActivity(move_main_sub4);
            }
        });


    }
}
