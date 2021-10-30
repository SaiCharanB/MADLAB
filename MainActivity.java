package com.example.keyboardnumberic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
   }
   public void onButtonClick(View v){
       String txt = ((Button)v).getText().toString();

       EditText display = (EditText)findViewById(R.id.editText);
       String curText = display.getText().toString();
       int len = curText.length();
       display.setText(curText+txt);
       display.setSelection(len+1);
//        Toast.makeText(this, "Clicked!", Toast.LENGTH_LONG).show();
   }
   public void onDelButtonClick(View v) {
       EditText display = (EditText) findViewById(R.id.editText);
       String txt = display.getText().toString();
       int len = txt.length();
       if (len >= 1) {
           display.setText(txt.substring(0, len - 1));
           display.setSelection(len-1);
       }
   }

   public void onSubButtonClick(View v){
       EditText display = (EditText) findViewById(R.id.editText);
       String txt = display.getText().toString();
       Toast toast = Toast.makeText(this, txt, Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.CENTER, 0, 0);
       toast.show();
   }

}
