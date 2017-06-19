package com.example.alunos.aula19jun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        Intent it2 = getIntent();  //recuperar Intent; recebe exatamente o objeto it
        Bundle b = it2.getExtras(); //recupera os parametros
        String a = b.getString("p_nome");
        TextView txt1 = (TextView) findViewById(R.id.textView2);
        txt1.setText(a);
    }
}
