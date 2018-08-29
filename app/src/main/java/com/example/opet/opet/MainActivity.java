package com.example.opet.opet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText editComanda, editPessoas;
    private TextView textValor;
    private CheckBox checkBoxServiço;
    private double original;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editComanda = findViewById(R.id.editComanda);
        editPessoas = findViewById(R.id.editPessoas);
        textValor = findViewById(R.id.textValor);
        checkBoxServiço = findViewById(R.id.CheckServiço);
        checkBoxServiço.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    original= Double.parseDouble(editComanda.getText().toString());
                    double tmp = Double.parseDouble(editComanda.getText().toString());
                    tmp *= 1.1;
                    editComanda.setText(String.valueOf(tmp));
                }else {
                    editComanda.setText(String.valueOf(original));

                }
            }
        });
    }

    public void calcularRateio(View view) {
        double comanda = Double.parseDouble(editComanda.getText().toString());
        double pessoas = Double.parseDouble(editPessoas.getText().toString());
        double rateio = comanda / pessoas;
        textValor.setText(String.valueOf(rateio));

    }


    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected  void onResume(){
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected  void onStop() {
        super.onStop();
    }

    @Override
    protected  void onRestart() {
        super.onRestart();
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
    }
}
