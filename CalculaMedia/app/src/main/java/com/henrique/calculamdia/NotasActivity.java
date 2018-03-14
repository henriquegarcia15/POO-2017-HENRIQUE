package com.henrique.calculamdia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

// inserir nota 01
// inserir nota 02
// botão calcular média
// chamar tela 3 enviando as notas recebidas

public class NotasActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "com.henrique.calculamdia.MESSAGE";
    private EditText editNota01;
    private EditText editNota02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);

        setupViews();
    }

    private void setupViews() {
        editNota01 = findViewById(R.id.edit_nota01);
        editNota02 = findViewById(R.id.edit_nota02);
    }

    public void calcularMedia(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("nota01", editNota01.getText().toString());
        bundle.putString("nota02", editNota02.getText().toString());
        Intent intent = new Intent(this, PesosActivity.class);
//        String nota01 = editNota01.getText().toString();
//        String nota02 = editNota01.getText().toString();
        startActivity(intent);
    }
}
