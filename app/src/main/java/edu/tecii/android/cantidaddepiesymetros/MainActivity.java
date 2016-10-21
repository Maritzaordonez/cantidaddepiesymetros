package edu.tecii.android.cantidaddepiesymetros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Pies, Metros;
    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pies = (EditText)findViewById(R.id.edtxt1);
        Metros = (EditText)findViewById(R.id.edtxt2);
        Resultado = (TextView)findViewById(R.id.txt1);
    }

    public void calculos(View view){

        double Pie,Metro ,pulgadas, yardas, metros, millas;
        Pie = Double.parseDouble(Pies.getText().toString());
        Metro = Double.parseDouble(Metros.getText().toString());

        pulgadas = (Metro/0.0254)+(Pie*12);
        yardas = (((Metro/0.0254)/12)/3) + (Pie/3);
        metros = Metro + ((Pie*12)*0.0254);
        millas = (Metro/1609)+(((Pie*12)*0.0254)/1609);

        Resultado.setText("Pulgadas = " + String.format("%8.2f",pulgadas) + "\nYardas = " + String.format("%8.2f",yardas)
                + "\nMetros = " + String.format("%8.2f",metros) + "\nMillas = " + String.format("%8.2f",millas));

    }
}

