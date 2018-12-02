package com.example.previ.classesemetodosnapratica;

class Funcionario {
    String nome;
    double salario;

    double  recuperaSalario(double bonus, double desconto){
        this.salario = this.salario - (this.salario * desconto);
        return  this.salario + bonus;
        //System.out.println(this.salario);
    }
}
