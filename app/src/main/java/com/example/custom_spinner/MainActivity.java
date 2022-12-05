package com.example.custom_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spin;
    TextView tV1,tV2,tV3;
    int [] imges = {R.drawable.argentina,R.drawable.brazil,R.drawable.us,R.drawable.frans,
            R.drawable.morocco,R.drawable.portugal,R.drawable.spain};
    String [] Contre = {"choose country","argentina","brazil","United States","frans","morocco","portugal","spain"};
    String [] Capital ={"Buenos Aires","Brasília","Washington D.C","paris","Rabat","Lisboa","Madrid"};
    String [] populion = {"20 Million","60 million","180 million","45 million","74 million","55 million","65 million",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV1 = findViewById(R.id.tV1);
        tV2 = findViewById(R.id.tV2);
        tV3 = findViewById(R.id.tV3);
        spin = findViewById(R.id.spin);

        CustomAdapter1 customAdapter1 = new CustomAdapter1(getApplicationContext(),Contre,imges,Capital);
        spin.setAdapter((SpinnerAdapter) customAdapter1);
        spin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (i != 0) {
            tV1.setText(Contre[i]);
            tV2.setText(Capital[i]);
            tV3.setText(populion[i]);
        }
        else {
            Toast.makeText(this,"choose country",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

}