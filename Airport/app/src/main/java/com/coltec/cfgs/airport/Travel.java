package com.coltec.cfgs.airport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Date;

/**
 * Created by ChrystianMelo on 13/09/18.
 */

public class Travel extends AppCompatActivity{
    private String numeroVoo;
    LandingStrip origem;
    LandingStrip destino;
    Airplane aviao;
    Users[] usuarios;
    Date marcado;

    public Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        btn_add = findViewById(R.id.add);


        final Intent intent = new Intent(Travel.this, Add.class);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);//ADD TELA
            }
        });

    }
}
