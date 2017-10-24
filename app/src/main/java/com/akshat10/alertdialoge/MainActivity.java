package com.akshat10.alertdialoge;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    AlertDialog.Builder ab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button);
     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             ab=new AlertDialog.Builder(MainActivity.this);
             ab.setTitle("akshat");
             ab.setMessage("submit");
             ab.setCancelable(false);
             ab.setPositiveButton("yes", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     MainActivity.this.finish();
                 }
             });
             ab.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.dismiss();
                 }
             });
         }
     });
        ab.show();
    }
}
