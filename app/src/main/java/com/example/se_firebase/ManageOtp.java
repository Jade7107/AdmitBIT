package com.example.se_firebase;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;


    public class ManageOtp extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_manage_otp);

            // You can retrieve the mobile number passed from OTP_login here
            String mobileNumber = getIntent().getStringExtra("mobile");
            // Use the mobile number as needed
            }
    }

