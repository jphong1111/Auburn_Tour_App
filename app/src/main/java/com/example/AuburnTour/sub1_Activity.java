package com.example.AuburnTour;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class sub1_Activity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {


    public static String output;



    public void setOutput(String a) {

        sub1_Activity.output = a;
    }

    public String getOutput() {

        return sub1_Activity.output;

    }



  //Require codes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub1_activity);

        //Spinner methods
        Spinner spinner = findViewById(R.id.major_Spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource
                (this,R.array.major, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



        //How Button works
        Button next_Button = (Button) findViewById(R.id.next_Button);
        next_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String outputValue = getOutput();
                //Move to next Sub12Activity (Screen Transition)
                Intent mov_sub1_sub12 = new Intent(sub1_Activity.this,sub12_Activity.class);
               mov_sub1_sub12.putExtra("MAJOR ", outputValue);
                startActivity(mov_sub1_sub12);
            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        setOutput(text);
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        //Display output
        TextView test1 = findViewById(R.id.test1);
        test1.setText(output);


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }




}

