package com.vinayvishnumurthy.happyvalentinesdays;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText et = (EditText) findViewById(R.id.editText);
        Button bt = (Button) findViewById(R.id.button1);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= et.getText().toString();

                if(s.toString().equals("putts"))
                {
                    Toast.makeText(MainActivity.this,"Correct Password",Toast.LENGTH_SHORT ).show();
                    final Intent i1 = new Intent(MainActivity.this, Screen1.class);
                    i1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    MainActivity.this.startActivity(i1);
                }
            }
        });

    }
}
