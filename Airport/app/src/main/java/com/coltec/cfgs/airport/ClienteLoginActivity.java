package com.coltec.cfgs.airport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by ChrystianMelo on 13/09/18.
 */

public class ClienteLoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_cliente);

        // recupera dado do bundle
        Bundle activityBundle = this.getIntent().getExtras();
        String name = activityBundle.getString("Nome");

        // imprime dado na tela
        TextView lblMessage;
        lblMessage = findViewById(R.id.text_Welcome);
        lblMessage.setText( "Welcome, ");
        lblMessage = findViewById(R.id.text_Name);
        lblMessage.setText(name + " !!");


    }
}
