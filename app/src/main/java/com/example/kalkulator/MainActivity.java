package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String str ="";
    Character operator = '.';
    float num,temp;
    TextView showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = findViewById(R.id.txtScreen);
    }

    public void btnnol(View view) {
        insert(0);
    }

    public void btnsatu(View view) {
        insert(1);
    }

    public void btndua(View view) {
        insert(2);
    }

    public void btntiga(View view) {
        insert(3);
    }

    public void btnempat(View view) {
        insert(4);
    }

    public void btnlima(View view) {
        insert(5);
    }

    public void btnenam(View view) {
        insert(6);
    }

    public void btntujuh(View view) {
        insert(7);
    }

    public void btndelapan(View view) {
        insert(8);
    }

    public void btnsembilan(View view) {
        insert(9);
    }

    public void btnbagi(View view) {
        perform();
        operator = '/';
    }

    public void btnkali(View view) {
        perform();
        operator = '*';
    }

    public void btnkurang(View view) {
        perform();
        operator = '-';
    }

    public void btntambah(View view) {
        perform();
        operator = '+';
    }

    public void btnhasil(View view) {
        calculate();
    }

    public void btnhapus(View v){
        reset();
    }

    private void reset() {
        str ="";
        operator ='.';
        num = 0;
        temp = 0;
        showResult.setText("");
    }

    private void insert(int a) {
        str = str+Integer.toString(a);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);

    }
    private void perform() {
        str = "";
        calculateNoShow();
        temp = num;

    }
    private void calculate() {

        if(operator == '+')
            num = temp+num;
        else if(operator == '-')
            num = temp-num;
        else if(operator == '/')
            num = temp/num;
        else if(operator == '*')
            num = temp*num;
        showResult.setText(""+num);
    }

    private void calculateNoShow() {

        if(operator == '+')
            num = temp+num;
        else if(operator == '-')
            num = temp-num;
        else if(operator == '/')
            num = temp/num;
        else if(operator == '*')
            num = temp*num;
    }
}