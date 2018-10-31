 package kr.co.woobi.imyeon.tinydb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity implements View.OnClickListener {
     Button button1, button2;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
         button1 = (Button) findViewById(R.id.button1);
         button1.setOnClickListener(this);
         button2 = (Button) findViewById(R.id.button2);
         button2.setOnClickListener(this);
     }


     @Override
     public void onClick(View v) {
         switch (v.getId()) {
             case R.id.button1:
                 Intent intent1 = new Intent(this, ReferenceInputActivity.class);
                 startActivityForResult(intent1,100);
                 break;
             case R.id.button2:
                 Intent intent2 = new Intent(this, ReferenceGetActivity.class);
                 startActivityForResult(intent2,200);
         }
     }
 }
