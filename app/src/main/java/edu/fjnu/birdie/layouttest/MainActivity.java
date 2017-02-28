package edu.fjnu.birdie.layouttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button relativeButton = (Button)findViewById(R.id.RelativeLayout);
        relativeButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button linearButton = (Button)findViewById(R.id.LinearLayout);
        linearButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                startActivity(intent);
            }
        });
        Button tableButton = (Button)findViewById(R.id.TableLayout);
        tableButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TableLayoutActivity.class);
                startActivity(intent);
            }
        });
    }



}
