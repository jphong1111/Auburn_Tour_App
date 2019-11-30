package com.example.AuburnTour;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class sub4_Activity extends AppCompatActivity {



    public static String e_mail_Address = "test1";



    public void setE_mail_Address(String a) {

        switch (a) {

            case "Admission" :
                a = "admissions@auburn.edu";
                break;
            case "Financial" :
                a = "finaid7@auburn.edu";
                break;
            case "Test" :
                a = "blue1357a@gmail.com";
                break;
            default :
                a = "Null";
        }


        this.e_mail_Address = a;

    }


    public String getE_mail_Address() {


        return e_mail_Address;
    }


    //Require codes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub4_activity);

        String email_Address = "";


        //How Admisson Buttons
        Button mail_to_AddmissonButton = (Button) findViewById(R.id.mail_to_addmission);
        mail_to_AddmissonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setE_mail_Address("Admission");

                //Screen transition move from sub4 to sub41
                Intent move_sub4_sub41 = new Intent(sub4_Activity.this, sub41_Activity.class);
                startActivity(move_sub4_sub41);


            }
        });

        //How financial office Buttons
        Button mail_to_f = (Button) findViewById(R.id.mail_to_f_office);
        mail_to_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Move to next Sub3Activity (Screen Transition)
                setE_mail_Address("Financial");

                //Screen transition move from sub4 to sub1
                Intent move_sub4_sub41 = new Intent(sub4_Activity.this, sub41_Activity.class);
                startActivity(move_sub4_sub41);


            }
        });


        //How financial office Buttons
        Button mail_to_Test = (Button) findViewById(R.id.mail_to_in_office);
        mail_to_Test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Move to next Sub3Activity (Screen Transition)
                setE_mail_Address("Test");

                //Screen transition move from sub4 to sub1
                Intent move_sub4_sub41 = new Intent(sub4_Activity.this, sub41_Activity.class);
                startActivity(move_sub4_sub41);


            }
        });


    }


        }
