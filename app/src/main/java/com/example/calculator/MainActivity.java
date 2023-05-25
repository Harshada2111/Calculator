package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button one,two,three,four,five,six,seven,eight,nine,zero,dot,add,sub,div,mul,equal;
    Button clear;
    EditText control;
    float res1,res2;
    boolean Add,Sub,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        zero = (Button) findViewById(R.id.zero);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        dot = (Button) findViewById(R.id.dot);
        equal = (Button)findViewById(R.id.equal);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        clear = (Button) findViewById(R.id.clear);
        control = (EditText) findViewById(R.id.control);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+"0");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                control.setText(control.getText()+".");
            }
        });
      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              if(control == null){
                  control.setText("");
              }
              else {
                  res1= Float.parseFloat(control.getText()+"");
                  Add=true;
                  control.setText(null);
              }
          }
      });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(control == null){
                    control.setText("");
                }
                else {
                    res1= Float.parseFloat(control.getText()+"");
                    Sub=true;
                    control.setText(null);
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(control == null){
                    control.setText("");
                }
                else {
                    res1= Float.parseFloat(control.getText()+"");
                    Mul=true;
                    control.setText(null);
                }
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(control == null){
                    control.setText("");
                }
                else {
                    res1= Float.parseFloat(control.getText()+"");
                    Div=true;
                    control.setText(null);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                res2 = Float.parseFloat(control.getText()+"");
                if(Add==true){
                    control.setText(res1+res2+"");
                    Add=false;
                }

                if(Sub==true){
                    control.setText(res1-res2+"");
                    Sub=false;
                }

                if(Mul==true){
                    control.setText(res1*res2+"");
                    Mul=false;
                }

                if(Div==true){
                    control.setText(res1/res2+"");
                    Div=false;
                }
            }
        });
           clear.setOnClickListener(new View.OnClickListener() {
             @Override
              public void onClick(View v) {
                 control.setText("");
    }
});
    }
}