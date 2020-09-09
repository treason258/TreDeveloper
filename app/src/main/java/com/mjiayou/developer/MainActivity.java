package com.mjiayou.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mjiayou.trecorelib.util.HelloUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // tv_hello
        ((TextView) findViewById(R.id.tv_hello)).setText(HelloUtils.getHI());
    }
}
