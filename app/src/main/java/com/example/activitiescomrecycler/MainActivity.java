package com.example.activitiescomrecycler;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.activitiescomrecycler.DAO.DBHelper;

public class MainActivity extends AppCompatActivity
{
    EditText loginUser, passwordUser;
    Button signin;
    DBHelper DB;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginUser = (EditText) findViewById(R.id.loginUser);
        passwordUser = (EditText) findViewById(R.id.passwordUser);

        signin = (Button) findViewById(R.id.btnsignin);
        DB = new DBHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String user = loginUser.getText().toString();
                String pass = passwordUser.getText().toString();
                if(user.equals("")||pass.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Please enter all the fields",
                            Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Boolean checkuser = DB.checkuserlogin(user);
                    if(checkuser == false)
                    {
                        Boolean insert =    DB.insertData(user, pass);
                        if(insert == true)
                        {
                            Toast.makeText(MainActivity.this, "Aproved!", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                            startActivity(intent);
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Failed!", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });


    }

}