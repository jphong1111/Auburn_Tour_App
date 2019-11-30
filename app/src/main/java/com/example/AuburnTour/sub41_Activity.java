package com.example.AuburnTour;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sub41_Activity extends AppCompatActivity {

    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;





    //Require codes
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub41_activity);

        sub4_Activity sub4 = new sub4_Activity();

        mEditTextTo = findViewById(R.id.to_input);
        mEditTextTo.setText(sub4.getE_mail_Address());

        mEditTextSubject = findViewById(R.id.subject_info_input);
        mEditTextMessage = findViewById(R.id.message_info_input);

        Button send_Button = findViewById(R.id.send_Button);
        send_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });

    }

    private void sendMail() {

        sub4_Activity sub4 = new sub4_Activity();
        String reciptionlist = mEditTextTo.getText().toString();

        String[] recepitents = reciptionlist.split(",");
        //recepitents = new String[]{sub4.getE_mail_Address()};

        String subjects = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();

        Intent send_mail =new Intent(Intent.ACTION_SEND);
        send_mail.putExtra(send_mail.EXTRA_EMAIL, recepitents);
        send_mail.putExtra(send_mail.EXTRA_SUBJECT, subjects);
        send_mail.putExtra(send_mail.EXTRA_TEXT,message);

        send_mail.setType("message/rfc822");
        startActivity(Intent.createChooser(send_mail, "Choose an email clinet"));



    }


}