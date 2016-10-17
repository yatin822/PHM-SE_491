package phm.capstone.com.phm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import phm.capstone.com.phm.activities.LoginActivity;

// commit by Advait

public class MainActivity extends AppCompatActivity {

    Button link_doctor,link_patient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);

        link_doctor = (Button) findViewById(R.id.btn_doctor);
        link_patient = (Button) findViewById(R.id.btn_patient);

        link_doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i1);

            }
        });

        link_patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i1);

            }
        });
    }




}
