package com.example.arifin_alertdialog;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final CharSequence[] colors = { "Pink", "Red", "Yellow", "Blue" };
    ArrayList<Integer> slist = new ArrayList<>();
    boolean icount[] = new boolean[colors.length];
    String msg ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Login Alert")
                        .setMessage("Are you sure, you want to continue ?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Selected Option: YES",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"Selected Option: No",Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog dialog  = builder.create();
                dialog.show();
            }
        });
    }
}