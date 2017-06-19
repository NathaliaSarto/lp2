package com.example.alunos.aula19jun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bundle é uma classe
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirTela1(View i){
        Intent it = new Intent(this, Tela1Activity.class);
        startActivity(it); //iniciar a intenção e falar qual a intenção

    }
    public void abrirTela2(View i){
        EditText input=(EditText) findViewById(R.id.inputNome); // Convertendo o que foi informado no inputNome
        String nome = input.getText().toString(); // Capturando o que foi informado no inputNome
        Intent it = new Intent(this, Tela2Activity.class);
        Bundle b = new Bundle();
        b.putString("p_nome", nome);  //criar chaves(nome) e valores(variável); acessando a posição que se chama p_nome
        it.putExtras(b); //asscociar o b no it
        startActivity(it);
    }

}
