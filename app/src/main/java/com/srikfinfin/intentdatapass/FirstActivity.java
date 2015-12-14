package com.srikfinfin.intentdatapass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        String textvalue1 = "This is value 1";
        String textvalue2 = "This is value 2";

        TextView textView1 = (TextView) findViewById(R.id.textView1);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        textView1.setText(textvalue1);
        textView2.setText(textvalue2);

        Button btNext = (Button) findViewById(R.id.btNext);
        Button btBack = (Button) findViewById(R.id.btBack);

        btNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNext(true);
            }
        });
        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNext(false);
            }
        });
    }

    public void navigateToNext(boolean toFront) {
        if (toFront) {
            intent = new Intent(FirstActivity.this, SecondActivity.class);
            intent.putExtra("Value 1", "This is value 1");
            intent.putExtra("Value 2", "This is value 2");
            startActivity(intent);
        } else {
            //intent = new Intent(FirstActivity.this, SecondActivity.class);

        }
    }
}
