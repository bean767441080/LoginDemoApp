package com.example.auus.login;

//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.InputStreamReader;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText et_username;
    private EditText et_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.button);
        final EditText account = (EditText) findViewById(R.id.et_username);
        final EditText code = (EditText) findViewById(R.id.et_password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String username =((EditText)findViewById(R.id.et_username)).getText().toString();
                String pwd =((EditText)findViewById(R.id.et_password)).getText().toString();
                if (username.equals("17023136")&&pwd.equals("password17023136")){
                    ResultActivity.start(MainActivity.this);
                    Toast.makeText(MainActivity.this, "登录成功：17023136+吴世冕", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "用户名密码错误", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}
