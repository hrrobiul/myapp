package com.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;
//import org.mozilla.javascript.context;
//import org.mozilla.javascript.javascriptable;





public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    TextView result, solution;
    MaterialButton buttonc, openbraket, crossbraket;
    MaterialButton divide, multiplay, minus, plus, equal;
    MaterialButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    MaterialButton buttonac, buttondot;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result= findViewById(R.id.result_Tv);
        solution= findViewById(R.id.solution_Tv);

        //======AllBaton ==============
        assignId(buttonc,R.id.button_c);
        assignId(openbraket,R.id.button_openbraket);
        assignId(crossbraket,R.id.button_crossbraket);
        assignId(divide,R.id.button_divide);
        assignId(multiplay,R.id.button_multiplay);
        assignId(minus,R.id.button_minus);
        assignId(plus,R.id.button_plus);
        assignId(equal,R.id.button_equal);
        assignId(button0,R.id.button0);
        assignId(button1,R.id.button1);
        assignId(button2,R.id.button2);
        assignId(button3,R.id.button3);
        assignId(button4,R.id.button4);
        assignId(button5,R.id.button5);
        assignId(button6,R.id.button6);
        assignId(button7,R.id.button7);
        assignId(button8,R.id.button8);
        assignId(button9,R.id.button9);
        assignId(buttonac,R.id.button_ac);
        assignId(buttondot,R.id.button_dot);





    }

    void assignId(MaterialButton btn, int id){

           btn = findViewById(id);
           btn.setOnClickListener(this);


    };


    @Override
    public void onClick(View view) {

        MaterialButton button=(MaterialButton) view;
        String botonText = button.getText().toString();
        solution.setText(botonText);
        String dataToCalculate = solution.getText().toString();



        if(botonText.equals("AC")){

            solution.setText("");
            result.setText("0");
            return;

        }

        if (botonText.equals("=")){
            solution.setText(result.getText());
            return;
        }

        if (botonText.equals("C")){
            dataToCalculate = dataToCalculate.substring(0,dataToCalculate.length()-1);

        }else {
            dataToCalculate = dataToCalculate+botonText;
        }
        solution.setText(dataToCalculate);


    }


    String getResuld(String data){
        return "Calculated";
    }

}