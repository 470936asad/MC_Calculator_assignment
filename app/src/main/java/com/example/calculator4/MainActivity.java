package com.example.calculator4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Firstvalue,Secondvalue;
    TextView Answer;
    Button Subtract,Add,Multiply,Divide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Firstvalue=findViewById(R.id.Editview1);
        Secondvalue=findViewById(R.id.Editview2);
        Answer=findViewById(R.id.Textview);
        Subtract=findViewById(R.id.Btminus);
        Add=findViewById(R.id.Btplus);
         Multiply=findViewById(R.id.Btmultiply);
        Divide=findViewById(R.id.Btdivide);


        Subtract.setOnClickListener(new View.OnClickListener()
            {
            @Override
            public void onClick(View v) {
                int firstval,secondval,answer;
                firstval=Integer.parseInt(Firstvalue.getText().toString());
                secondval=Integer.parseInt(Secondvalue.getText().toString());
                answer= firstval-secondval;
                Answer.setText("Answer is "+answer);

            }





        });

        Add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                int firstval,secondval,answer;
                firstval=Integer.parseInt(Firstvalue.getText().toString());
                secondval=Integer.parseInt(Secondvalue.getText().toString());
                answer= firstval+secondval;
                Answer.setText("Answer is "+answer);

            }





        });


        Multiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                int firstval,secondval,answer;
                firstval=Integer.parseInt(Firstvalue.getText().toString());
                secondval=Integer.parseInt(Secondvalue.getText().toString());
                answer= firstval*secondval;
                Answer.setText("Answer is "+answer);

            }





        });

        Divide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                int firstval,secondval,answer;
                firstval=Integer.parseInt(Firstvalue.getText().toString());
                secondval=Integer.parseInt(Secondvalue.getText().toString());
                answer= firstval/secondval;
                Answer.setText("Answer is "+answer);

            }





        });








    }
}