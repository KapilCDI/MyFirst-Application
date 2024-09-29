package com.example.trial2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.CheckBox;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import com.example.trial2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate the layout using View Binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initialize UI components using View Binding
        TextView mytext = binding.textview; // Corresponds to the output TextView
        EditText myedit = binding.myedittext; // Corresponds to the input EditText
        Button mybutton = binding.mybutton; // Corresponds to the Submit Button
        Button btn1 = binding.btn1; // Corresponds to the Toast Button
        Switch swtCoffee = binding.swtCoffee; // Corresponds to the Coffee Switch
        CheckBox checkBox = binding.checkBox; // Corresponds to the Tea CheckBox

        // Set click listener for mybutton
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editString = myedit.getText().toString();
                mytext.setText("Your edit text has: " + editString);
            }
        });

        // Set click listener for btn1
        btn1.setOnClickListener(view -> {
            CharSequence text = "Hello toast from Kapil!";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(this, text, duration);
            toast.show();
        });

        // Set checked change listener for the Switch
        swtCoffee.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String message = isChecked ? "You like coffee!" : "You do not like coffee.";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });

        // Set checked change listener for the CheckBox
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            String message = isChecked ? "You want tea!" : "You do not want tea.";
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        });
    }
}