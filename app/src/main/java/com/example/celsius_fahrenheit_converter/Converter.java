package com.example.celsius_fahrenheit_converter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.celsius_fahrenheit_converter);

        // Initialize views
        EditText temperatureInput = findViewById(R.id.editTextNumberDecimal);
        Button toFahrenheitButton = findViewById(R.id.button);
        Button toCelsiusButton = findViewById(R.id.button2);

        // Convert to Fahrenheit
        toFahrenheitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = temperatureInput.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double celsius = Double.parseDouble(input);
                        double fahrenheit = (celsius * 9 / 5) + 32;
                        Toast.makeText(Converter.this, "Temperature in Fahrenheit: " + fahrenheit, Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(Converter.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Converter.this, "Please enter a temperature", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Convert to Celsius
        toCelsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = temperatureInput.getText().toString();
                if (!input.isEmpty()) {
                    try {
                        double fahrenheit = Double.parseDouble(input);
                        double celsius = (fahrenheit - 32) * 5 / 9;
                        Toast.makeText(Converter.this, "Temperature in Celsius: " + celsius, Toast.LENGTH_SHORT).show();
                    } catch (NumberFormatException e) {
                        Toast.makeText(Converter.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(Converter.this, "Please enter a temperature", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
