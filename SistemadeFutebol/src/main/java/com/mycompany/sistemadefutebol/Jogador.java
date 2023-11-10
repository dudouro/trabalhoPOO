/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefutebol;

/**
 *
 * @author eduar
 */
public abstract class Jogador extends Pessoa {
    protected int numeroCamisa;
    protected float vigor;
    protected float passe;
    protected float defesa;
    protected float entrosamento;
    protected float chute;
    
    public Jogador(String nome, int idade, double altura, double peso, String cpf, int numeroCamisa, float vigor, float entrosamento, float chute) {
        super(nome, idade, altura, peso, cpf);
        this.numeroCamisa = numeroCamisa;
        this.vigor = vigor;
        this.entrosamento = entrosamento;
        this.chute = chute;
    }

    public abstract float habilidade();
}