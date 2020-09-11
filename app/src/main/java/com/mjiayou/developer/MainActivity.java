package com.mjiayou.developer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.mjiayou.trecorelib.util.HelloUtils;
import com.mjiayou.trecorelib.util.ToastUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv_hello)
    TextView tv_hello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        // tv_hello
        if (tv_hello != null) {
            tv_hello.setText(HelloUtils.getHI());
        } else {
            ToastUtils.show("tv_hello == null");
        }
    }
}
