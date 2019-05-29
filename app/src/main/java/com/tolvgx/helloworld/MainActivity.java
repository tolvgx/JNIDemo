package com.tolvgx.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View v){
        //8.调用本地方法
        Toast.makeText(this, JNIUtils.helloFromC(), Toast.LENGTH_SHORT).show();
    }

}
