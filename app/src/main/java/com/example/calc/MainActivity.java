package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    Button one,two,three,four,five,six,seven,eight,nine,zero,addbtn,eqbtn,AC,minusbtn,mulbtn,divbtn;
    int v1,v2,sum=0;
    boolean add,minus,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=(TextView)findViewById(R.id.textView);
        one=(Button)findViewById(R.id.button);
        two=(Button)findViewById(R.id.button2);
        three=(Button)findViewById(R.id.button3);
        four=(Button)findViewById(R.id.button4);
        five=(Button)findViewById(R.id.button5);
        six=(Button)findViewById(R.id.button6);
        seven=(Button)findViewById(R.id.button7);
        eight=(Button)findViewById(R.id.button8);
        nine=(Button)findViewById(R.id.button9);
        zero=(Button)findViewById(R.id.button10);
        addbtn=(Button)findViewById(R.id.button11);
        eqbtn=(Button)findViewById(R.id.button12);
        AC=(Button)findViewById(R.id.button13);
        minusbtn=(Button)findViewById(R.id.button14);
        mulbtn=(Button)findViewById(R.id.button15);
        divbtn=(Button)findViewById(R.id.button16);

        AC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Integer.parseInt(result.getText().toString());
                sum=sum+v1;
                add=true;
                result.setText("");
            }
        });
        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Integer.parseInt(result.getText().toString());
                sum=v1-sum;
                minus=true;
                result.setText("");
            }
        });
        mulbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Integer.parseInt(result.getText().toString());
                if(sum==0){
                    sum=v1;
                    mul=true;
                    result.setText("");
                }else {
                    sum=sum*v1;
                    mul=true;
                    result.setText("");
                }
            }
        });
        divbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v1=Integer.parseInt(result.getText().toString());
                if(sum==0){
                    sum=v1;
                    div=true;
                    result.setText("");
                }else {
                    sum=v1/sum;
                    div=true;
                    result.setText("");
                }
            }
        });
        eqbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(add){
                    v2=Integer.parseInt(result.getText().toString());
                    sum=sum+v2;
                    result.setText(String.valueOf(sum));
                    sum=0;
                    add=false;
                }
                if(minus){
                    v2=Integer.parseInt(result.getText().toString());
                    sum=sum-v2;
                    result.setText(String.valueOf(sum));
                    sum=0;
                    minus=false;
                }
                if(mul){
                    v2=Integer.parseInt(result.getText().toString());
                    sum=sum*v2;
                    result.setText(String.valueOf(sum));
                    sum=0;
                    mul=false;
                }
                if(div){
                    v2=Integer.parseInt(result.getText().toString());
                    sum=sum/v2;
                    result.setText(String.valueOf(sum));
                    sum=0;
                    div=false;
                }
            }
        });
    }
}