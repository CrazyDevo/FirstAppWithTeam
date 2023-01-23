package com.mobdevops.firstappwithteam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void registerForm(View view){
        String firstName = ((EditText) findViewById(R.id.editTextFirstName)).getText().toString();
        String lastName = ((EditText) findViewById(R.id.editTextLastName)).getText().toString();
        String email = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();

        ((TextView) findViewById(R.id.textViewFirstName)).setText("First Name : " +firstName);
        ((TextView) findViewById(R.id.textViewLastName)).setText("Lat Name : " +lastName);
        ((TextView) findViewById(R.id.textViewEmail)).setText("Email : " +email);
    }
}