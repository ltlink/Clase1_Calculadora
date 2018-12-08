package com.example.service_admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
// comentario
public class MainActivity extends AppCompatActivity {

    private boolean yaTienePunto = false;
    private double valor1 = 0.0;
    private double valor2 = 0.0;
    private int action = -1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddButtonActions();
    }

    public void AddButtonActions(){

        EditText resultado = findViewById(R.id.editText);

        AddButton1Action(resultado);
        AddButton2Action(resultado);
        AddButton3Action(resultado);
        AddButton4Action(resultado);
        AddButton5Action(resultado);
        AddButton6Action(resultado);
        AddButton7Action(resultado);
        AddButton8Action(resultado);
        AddButton9Action(resultado);
        AddButton0Action(resultado);
        AddPointAction(resultado);
        AddClearAction(resultado);
        AddSumaAction(resultado);
        AddRestaAction(resultado);
        AddMultiplicacionAccion(resultado);
        AddDivisionAccion(resultado);
        AddResiduoAccion(resultado);
        AddCalcular(resultado);
    }

    public void AddButton1Action(final EditText resultado){
        Button boton = findViewById(R.id.numero1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"1");

            }
        });
    }

    public void AddButton2Action(final EditText resultado){
        Button boton = findViewById(R.id.numero2);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"2");
            }
        });
    }

    public void AddButton3Action(final EditText resultado){
        Button boton = findViewById(R.id.numero3);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"3");
            }
        });
    }

    public void AddButton4Action(final EditText resultado){
        Button boton = findViewById(R.id.numero4);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"4");
            }
        });
    }

    public void AddButton5Action(final EditText resultado){
        Button boton = findViewById(R.id.numero5);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"5");
            }
        });
    }

    public void AddButton6Action(final EditText resultado){
        Button boton = findViewById(R.id.numero6);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"6");
            }
        });
    }

    public void AddButton7Action(final EditText resultado){
        Button boton = findViewById(R.id.numero7);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"7");
            }
        });
    }

    public void AddButton8Action(final EditText resultado){
        Button boton = findViewById(R.id.numero8);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"8");
            }
        });
    }

    public void AddButton9Action(final EditText resultado){
        Button boton = findViewById(R.id.numero9);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"9");
            }
        });
    }

    public void AddButton0Action(final EditText resultado){
        Button boton = findViewById(R.id.numero0);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                resultado.setText(resultado.getText()+"0");
            }
        });
    }


    public void AddPointAction(final EditText resultado){
        Button boton = findViewById(R.id.punto);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                if (yaTienePunto == false) {
                    if (resultado.getText().toString().equals("")) {
                        resultado.setText(resultado.getText() + "0.");
                    } else {
                        resultado.setText(resultado.getText() + ".");
                    }
                }
                yaTienePunto = true;
            }
        });
    }

    public void AddClearAction(final EditText resultado){
        Button boton = findViewById(R.id.clear);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
               resultado.setText("");
               yaTienePunto = false;
               valor1 = 0.0;
               valor2 = 0.0;
               action = -1;
            }
        });
    }

    public void AddSumaAction(final EditText resultado){
        Button boton = findViewById(R.id.suma);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                valor1 = Double.parseDouble(resultado.getText().toString());
                action = 0;
                resultado.setText("");
            }
        });
    }

    public void AddRestaAction(final EditText resultado){
        Button boton = findViewById(R.id.resta);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                valor1 = Double.parseDouble(resultado.getText().toString());
                action = 1;
                resultado.setText("");
            }
        });
    }

    public void AddMultiplicacionAccion(final EditText resultado){
        Button boton = findViewById(R.id.multi);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                valor1 = Double.parseDouble(resultado.getText().toString());
                action = 2;
                resultado.setText("");
            }
        });
    }

    public void AddDivisionAccion(final EditText resultado){
        Button boton = findViewById(R.id.div);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                valor1 = Double.parseDouble(resultado.getText().toString());
                action = 3;
                resultado.setText("");
            }
        });
    }

    public void AddResiduoAccion(final EditText resultado){
        Button boton = findViewById(R.id.residuo);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // aqui va estar la accion
                valor1 = Double.parseDouble(resultado.getText().toString());
                action = 4;
                resultado.setText("");
            }
        });
    }
    public void AddCalcular(final EditText resultado){
        Button boton = findViewById(R.id.calcular);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (action != -1) {
                    if (resultado.getText().toString().equals("")) {
                        valor2 = 0.0;
                    }
                    else {
                        valor2 = Double.parseDouble(resultado.getText().toString());
                    }
                    switch (action) {
                        case 0:
                            double resultadoOperacion = valor1 + valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 1:
                            resultadoOperacion = valor1 - valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 2:
                            resultadoOperacion = valor1 * valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 3:
                            if (valor2 == 0){
                                break;
                            }
                            resultadoOperacion = valor1 / valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                        case 4:
                            resultadoOperacion = valor1 % valor2;
                            resultado.setText(String.valueOf(resultadoOperacion));
                            break;
                    }
                }
            }
        });
    }
}
