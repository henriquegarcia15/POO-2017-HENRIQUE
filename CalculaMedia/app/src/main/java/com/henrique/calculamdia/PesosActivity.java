package com.henrique.calculamdia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

// receber notas 01 e 02
// solicitar pesos
// botão calcular (média ponderada)
// retornar o valor para a tela 02
// botão cancelar (sem calcular a média)

public class PesosActivity extends AppCompatActivity {

    private TextView tvNota01;
    private TextView tvNota02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesos);

        setupViews();

        Intent intent = getIntent();
        String nota01 = intent.getStringExtra("nota01");
        String nota02 = intent.getStringExtra("nota02");

        tvNota01.setText(nota01);
        tvNota02.setText(nota02);

    }

    private void setupViews() {
        tvNota01 = findViewById(R.id.tv_nota01);
        tvNota02 = findViewById(R.id.tv_nota02);
    }

    public void calcular(View view) {
    }
}
