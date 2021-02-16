package mcm.edu.ph.montero_datatypes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstname ="Kevin Keir";
        char middleInitial = 'P';
        String lastname = "Montero";
        int myAge = 18;
        float myDreamTVLGrade = 99.0f;
        double myMoney = 99999.99;



        //String valueOf(moMoney);
        display.setText("My name is"+firstname+ " "
                +String.valueOf(middleInitial)+ " "
                +lastname+  "\nand my age is"
                +myAge+ ".\nI want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));




    }
}