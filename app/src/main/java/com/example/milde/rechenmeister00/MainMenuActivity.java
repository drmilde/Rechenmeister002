package com.example.milde.rechenmeister00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Button btnMenu_Addition = (Button)findViewById(R.id.btnMenu_Addition);
        btnMenu_Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAuswahlAddition();
            }
        });

        Button btnMenu_Subtraktion = (Button)findViewById(R.id.btnMenu_Subtraktion);
        btnMenu_Subtraktion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAuswahlSubtraktion();
            }
        });

        Button btnMenu_Multiplikation = (Button)findViewById(R.id.btnMenu_Multipliktion);
        btnMenu_Multiplikation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAuswahlMultiplikation();
            }
        });

        Button btnMenu_Division = (Button)findViewById(R.id.btnMenu_Division);
        btnMenu_Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAuswahlDivision();
            }
        });

        Button btnMenu_Los = (Button)findViewById(R.id.btnMenu_Los);
        btnMenu_Los.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showAufgabe10();
            }
        });
    }

    private void showAufgabe10() {
        Intent intent = new Intent(getApplicationContext(), Aufgaben10Activity.class);
        startActivity(intent);
    }

    private void showAuswahlDivision() {
        Intent intent = new Intent(getApplicationContext(), AuswahlDivisionActivity.class);
        startActivity(intent);
    }

    private void showAuswahlMultiplikation() {
        Intent intent = new Intent(getApplicationContext(), AuswahlMultiplikationActivity.class);
        startActivity(intent);
    }

    private void showAuswahlSubtraktion() {
        Intent intent = new Intent(getApplicationContext(), AuswahlSubtraktionActivity.class);
        startActivity(intent);
    }

    private void showAuswahlAddition() {
        Intent intent = new Intent(getApplicationContext(), AuswahlAdditionActivity.class);
        startActivity(intent);
    }

}
