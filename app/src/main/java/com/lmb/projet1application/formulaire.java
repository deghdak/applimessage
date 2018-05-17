package com.lmb.projet1application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class formulaire extends AppCompatActivity {
    public TextView Titre;
    public Button bvalider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulaire);

        bvalider=(Button) findViewById(R.id.bvalider);
        bvalider.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(new Intent(formulaire.this,thirdpage.class));
                    }

                }
        );


    }
}
