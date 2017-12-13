package com.example.milde.rechenmeister00;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStart = (Button)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //showAufgaben10();
                //showAuswahlAddition();
                //showAuswahlSubtraktion();
                //showAuswahlMultiplikation();
                //showAuswahlDivision();
                showAuswahlMainMaterial();

            }
        });
    }

    private void showAuswahlMainMaterial() {
        Intent intent = new Intent(getApplicationContext(), MainMaterialActivity.class);
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

    private void showAufgaben10() {
        Intent intent = new Intent(getApplicationContext(), Aufgaben10Activity.class);
        startActivity(intent);
    }

    private void showMainMenu() {
        Intent intent = new Intent(getApplicationContext(), MainMenuActivity.class);
        startActivity(intent);
    }
}
