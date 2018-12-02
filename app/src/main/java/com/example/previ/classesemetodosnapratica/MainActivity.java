package com.example.previ.classesemetodosnapratica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Alexandre Previatti";
        funcionario.salario = 4900;

        System.out.println( "Salário é: " + funcionario.recuperaSalario(1010, 0.2));


        /*
        Casa casa = new Casa();
        casa.cor = "Branca";

        System.out.println(casa.cor);
        casa.abrirPorta();
        */

    }
}
