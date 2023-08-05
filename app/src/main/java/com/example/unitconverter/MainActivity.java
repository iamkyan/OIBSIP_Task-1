package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.unitconverter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Widgets
        EditText editText= findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        //2-convert kilo to pounds
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){

                //1- Get the kilogram value from the editText
                String kilograms = editText.getText().toString();

                //3- convert string to float
                float kilos= Float.parseFloat(kilograms);

                float pounds = (float) (kilos * 2.20462);

                //4- Set the Textview with the result - Display result
                textView.setText(""+pounds);
            }
   });
}
}