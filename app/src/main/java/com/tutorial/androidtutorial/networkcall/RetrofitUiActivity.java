package com.tutorial.androidtutorial.networkcall;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.tutorial.androidtutorial.R;


public class RetrofitUiActivity extends AppCompatActivity implements OtpValidation.OtopValidtionPresenterView{
    OtpValidation otpValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_ui);
        new OtpValidation((OtpValidation.OtopValidtionPresenterView) this);
        otpValidation.otpVarification("abc");
    }

    @Override
    public void getOtpValidationResponce(String flag) {

    }

    @Override
    public void getErrorOtpValidation(String error) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}