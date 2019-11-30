package com.example.AuburnTour;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sub12_Activity extends AppCompatActivity {

    sub1_Activity sub1 =  new sub1_Activity();
    String major = sub1.getOutput();
    String building_Info = "";
    String major_Info = "";



    TextView major_box;
    TextView info_box;


    //Require codes
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub12_activity);

        //How Button works
        Button get_info_Button = (Button) findViewById(R.id.get_info);
        get_info_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url_address = "";

                switch (major) {

                    case "Computer Science" :
                        url_address = "http://bulletin.auburn.edu/undergraduate/samuelginncollegeofengineering/departmentofcomputerscienceandsoftwareengineering/computerscience_major/";
                        break;

                        case "Chemical Engineering"  :
                            url_address = "http://bulletin.auburn.edu/undergraduate/samuelginncollegeofengineering/departmentofchemicalengineering/chemicalengineering_major/";
                            break;
                    case "Chemistry" :
                        url_address = "http://bulletin.auburn.edu/undergraduate/collegeofsciencesandmathematics/chemistryandbiochemistry/bscurriculuminchemistry_major/";
                        break;

                        default:
                            url_address = "http://bulletin.auburn.edu/undergraduate/majors/";
                            break;

                }


            clicked_btn(url_address);

            }
        });


        switch (major) {


            case "Computer Science" :
                building_Info =  "Building name : . Samuel Ginn College " +
                        "of Engineering Sector\n";
                major_Info = "The Bachelor of Science trains students for careers in software-related " +
                        "computing fields through hands-on exposure to a variety of computer systems, " +
                        "tools and techniques. " +
                        "The department developed the first Bachelor of Software Engineering available " +
                        "at a public institution in the nation, a program that equips students with " +
                        "theory and practical application for the field of software systems development. " +
                        "It also boasts the first Bachelor of Wireless Engineering, which teaches students " +
                        "application development for embedded software on wireless platforms, as well as the " +
                        "associated server-side and client-side aspects of wireless networks."
                ;
                break;

            case "Chemical Engineering" :
                building_Info = "Building name : Leach Science Center";
                major_Info = "The Department of Chemical Engineering offers a challenging curriculum that encourages students " +
                        "to solve real-world problems relating to energy, medicine, nanotechnology or sustainability with " +
                        "engineering practices and scientific foundations. Chemical engineers take what we can't see and transform " +
                        "them into usable, safe and sustainable products for home and industrial use. Graduates become pioneers" +
                        " for better, more efficient solutions to both everyday challenges and global issues.";
                break;
            case "Chemistry" :
                building_Info = "Building name : Leach Science Center";
                major_Info = "This curriculum provides a strong background in chemistry while allowing students to specialize in areas of interest. It is especially well suited for students leaning towards medical sciences while allowing more " +
                        "flexibility than that allowed in the American Chemical Society approved biochemistry curriculum. The program allows " +
                        "for great versatility in the junior and senior years, allowing the curriculum to be tailored to individual goals. " +
                        "The curriculum prepares students for professional careers in chemistry or biochemistry and advanced degree programs " +
                        "in chemistry, biochemistry and medically related fields.";
                break;
            default: building_Info = "Sorry Infomation is not updated yet";
                major_Info = "Sorry Infomation is not updated yet";
        }


        //Display data
        major_box = (TextView) findViewById(R.id.major_Text);
        major_box.setText("Your major is "+ major);
        info_box = (TextView) findViewById(R.id.info_Text);
        info_box.setText(building_Info + "\n" +major_Info);





    }





    public void clicked_btn(String url) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }



}
