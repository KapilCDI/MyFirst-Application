
package com.example.trial2;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;;

public class MainActivity extends AppCompatActivity {
    Button btn1;
            Button btn2;
            TextView txt;
     @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

         btn1=findViewById(R.id.btn1);

         btn2=findViewById(R.id.btn2);
         txt=findViewById(R.id.txt1);
                 btn1.setOnClickListener(view ->  {
             CharSequence text = "Hello toast from Kapil!";
             int duration = Toast.LENGTH_LONG;
             Toast toast = Toast.makeText(this, text, duration);
                     toast. show() ;

        });
    }
}