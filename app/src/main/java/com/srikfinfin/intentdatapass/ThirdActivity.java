package com.srikfinfin.intentdatapass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    Intent intent = null;
    TextView textView1;
    TextView textView2;

    String textvalue1 = "";
    String textvalue2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        if (getIntent() != null) {
            Intent rcintent = getIntent();

            textView1 = (TextView) findViewById(R.id.textView1);
            textView2 = (TextView) findViewById(R.id.textView2);

            textvalue1 = rcintent.getStringExtra("Value 1");
            textvalue2 = rcintent.getStringExtra("Value 2");

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

    }

    public void navigateToNext(boolean toFront) {
        if (toFront) {
//            intent = new Intent(ThirdActivity.this, ThirdActivity.class);
//            intent.putExtra("Value 1", textvalue1);
//            intent.putExtra("Value 2", textvalue2);

        } else {
            intent = new Intent(ThirdActivity.this, SecondActivity.class);
            intent.putExtra("Value 1", textvalue1);
            intent.putExtra("Value 2", textvalue2);

            startActivity(intent);

        }
    }


}
