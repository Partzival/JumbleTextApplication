package com.example.jumbletextapplication;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private EditText originalText;
    private TextView jumbleText;
    private Button button;

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        originalText  = findViewById(R.id.originalText  );
        originalText.setTypeface(Typeface.SANS_SERIF);
        originalText.setTypeface(Typeface.MONOSPACE);
        jumbleText  = findViewById(R.id.jumbleText  );
        jumbleText.setTypeface(Typeface.SANS_SERIF);
        jumbleText.setTypeface(Typeface.MONOSPACE);
        button = findViewById(R.id.button   );
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        // Check for exit button. Pop up dialogue if found
        if (v == button)
        {
            //JumpleText();
        }
    }

    public void jumble(String aString) {
        String jumbleString;

        //return jumbledString;
    }
}

