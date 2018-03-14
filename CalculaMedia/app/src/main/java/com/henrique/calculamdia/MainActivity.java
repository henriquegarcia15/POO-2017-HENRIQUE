package com.henrique.calculamdia;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// boas vindas
// inserir nome
// armazenar nas preferências

public class MainActivity extends AppCompatActivity {

    private EditText editNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupViews();

//        SharedPreferences sharedPreferences = getSharedPreferences(String.valueOf(R.id.edit_nome), MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString(getString(R.id.edit_nome), fieldText.getText().toString());

    }

    private void setupViews() {
        editNome = findViewById(R.id.edit_nome);
    }

    public void proximo(View view) {

        if (editNome.toString() == null)
            Snackbar.make(view, "Campo vazio!", Snackbar.LENGTH_LONG).show();
        else
            startActivity(new Intent(this, NotasActivity.class));
    }
}
