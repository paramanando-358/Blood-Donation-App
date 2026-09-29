package com.example.cse345_2026_lab;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
   private EditText etName, etPhone, etEmail,etLocation;
   private Spinner etBG;
    private CheckBox cbEmergency, cbRegular;
    private Button btnCancel,btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etEmail = findViewById(R.id.etEmail);
        etLocation = findViewById(R.id.etLocation);
        etBG = findViewById(R.id.etBG);
        cbEmergency = findViewById(R.id.cbEmergency);
        cbRegular = findViewById(R.id.cbRegular);
        btnCancel = findViewById(R.id.btnCancel);
        btnSave = findViewById(R.id.btnSave);


        btnCancel.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                save();
            }
        });
    }
    private void save(){
        String name = etName.getText().toString().trim();
        String phone = etPhone.getText().toString().trim();
        String email = etEmail.getText().toString().trim();
        String location =etLocation.getText().toString().trim();

//        System.out.println("Name:"+name);
//        System.out.println("Phone:"+phone);
//        System.out.println("Email:"+email);
//        System.out.println("Location:"+location);
        // System.out এর বদলে এই ৪টি লাইন লিখুন
        android.util.Log.d("MY_APP", "Name: " + name);
        android.util.Log.d("MY_APP", "Phone: " + phone);
        android.util.Log.d("MY_APP", "Email: " + email);
        android.util.Log.d("MY_APP", "Location: " + location);

    }
}

