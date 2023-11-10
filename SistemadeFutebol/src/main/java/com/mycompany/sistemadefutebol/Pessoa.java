/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefutebol;

public abstract class Pessoa {

    protected String nome;
    protected int idade;
    protected double altura;
    protected double peso;
    protected String cpf;

    public Pessoa(String nome, int idade, double altura, double peso, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.cpf = cpf;
    }
}
