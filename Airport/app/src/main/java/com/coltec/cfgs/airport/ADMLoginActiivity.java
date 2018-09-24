package com.coltec.cfgs.airport;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.coltec.cfgs.airport.classes.Airplane;
import com.coltec.cfgs.airport.classes.LandingStrip;
import com.coltec.cfgs.airport.classes.Users;

import java.util.Date;

/**
 * Created by ChrystianMelo on 13/09/18.
 */

public class ADMLoginActiivity extends AppCompatActivity{
    private String numeroVoo;
    LandingStrip origem;
    LandingStrip destino;
    Airplane aviao;
    Users[] usuarios;
    Date marcado;

    public Button btn_add;
    public Button btn_rm;
    public Button btn_upd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_adm);

        btn_add = findViewById(R.id.add);
        btn_rm = findViewById(R.id.rm);
        btn_upd = findViewById(R.id.att);

        final Intent intent = new Intent(ADMLoginActiivity.this, Add.class);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);//ADD TELA
            }
        });

        final Intent intent2 = new Intent(ADMLoginActiivity.this, Rm.class);
        btn_rm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent2);//Rm TELA
            }
        });

        final Intent intent3 = new Intent(ADMLoginActiivity.this, Remarcar.class);
        btn_upd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent3);//ADD TELA
            }
        });

    }

}
