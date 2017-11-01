package com.example.taruc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static com.example.taruc.lab21loancalculator.R.id.editTextCarPrice;
import static com.example.taruc.lab21loancalculator.R.id.editTextDownPayment;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";

    private EditText editTextVP,editTextDownpayment,editTextInterestRate,Repayment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextVP = (EditText)findViewById(R.id.editTextCarPrice);
        editTextDownpayment = (EditText)findViewById(R.id.editTextDownPayment);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);
    }

    public void calculateLoan(View view){
        //Create an Explicit Intent
        Intent intent = new Intent(this,ResultActivity.class);

        //Todo : calculate monthly payment and determine loan application status(approve || reject)
        double monthlyPayment =450.0;
        String status = "Approve";

        //Passing data using putExtra method
        //putExtra(TAG,value)
        intent.putExtra(MONTHLY_PAYMENT,monthlyPayment);
        intent.putExtra(LOAN_STATUS,status);

        startActivity(intent);

    }
}
