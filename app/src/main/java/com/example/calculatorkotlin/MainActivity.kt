package com.example.calculatorkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var a1=0
    var a2=0
    var operationClicked=false
    var isPlus= false
    var isMinus=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1=findViewById<Button>(R.id.v1)
        b1.setOnClickListener(this)

        var b2=findViewById<Button>(R.id.v2)
        b2.setOnClickListener(this)

        var b3=findViewById<Button>(R.id.v3)
        b3.setOnClickListener(this)

        var b4=findViewById<Button>(R.id.v4)
        b4.setOnClickListener(this)

        var b5=findViewById<Button>(R.id.v5)
        b5.setOnClickListener(this)

        var b6=findViewById<Button>(R.id.v6)
        b6.setOnClickListener(this)

        val b7 = findViewById<Button>(R.id.v7)
        b7.setOnClickListener(this)

        val b8 = findViewById<Button>(R.id.v8)
        b8.setOnClickListener(this)

        val b9 = findViewById<Button>(R.id.v9)
        b9.setOnClickListener(this)

        val bPlus = findViewById<Button>(R.id.vPlus)
        bPlus.setOnClickListener(this)

        val bMinus = findViewById<Button>(R.id.vMinus)
        bMinus.setOnClickListener(this)

        val bEq = findViewById<Button>(R.id.vRes)
        bEq.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var input1=findViewById<EditText>(R.id.input1View)
        if(operationClicked){input1=findViewById<EditText>(R.id.input2View)}

        when(v?.id){
            R.id.v1-> {var ancient=input1.text.toString(); ancient=ancient+"1";input1.setText(ancient)}
            R.id.v2->{var ancient=input1.text.toString(); ancient=ancient+"2";input1.setText(ancient)}
            R.id.v3->{var ancient=input1.text.toString(); ancient=ancient+"3";input1.setText(ancient)}
            R.id.v4->{var ancient=input1.text.toString(); ancient=ancient+"4";input1.setText(ancient)}
            R.id.v5->{var ancient=input1.text.toString(); ancient=ancient+"5";input1.setText(ancient)}
            R.id.v6->{var ancient=input1.text.toString(); ancient=ancient+"6";input1.setText(ancient)}
            R.id.v7->{var ancient=input1.text.toString(); ancient=ancient+"7";input1.setText(ancient)}
            R.id.v8->{var ancient=input1.text.toString(); ancient=ancient+"8";input1.setText(ancient)}
            R.id.v9->{var ancient=input1.text.toString(); ancient=ancient+"9";input1.setText(ancient)}
            R.id.vPlus->{operationClicked=true;isPlus=true}
            R.id.vMinus->{operationClicked=true;isMinus=true}
            R.id.vRes->{if(isPlus){

                var result1=findViewById<EditText>(R.id.input1View);
                var result2=findViewById<EditText>(R.id.input2View);

                var result11=result1.getText().toString()
                var result22=result2.getText().toString();
                var result=result11.toInt()+result22.toInt()

                val finalResult = findViewById<TextView>(R.id.resultView);

                finalResult.text=result.toString();Log.i("result1",result1.toString())
                ;Log.i("result2",result2.toString())
                ;Log.i("result",result.toString())
            }
                        }


        }
    }


}