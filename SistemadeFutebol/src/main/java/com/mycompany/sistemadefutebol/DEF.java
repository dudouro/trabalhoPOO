/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefutebol;

/**
 *
 * @author eduar
 */
public class DEF extends Jogador {
    public DEF(String nome, int idade, double altura, double peso, String cpf, int numeroCamisa, float vigor, float entrosamento, float chute) {
        super(nome, idade, altura, peso, cpf, numeroCamisa, vigor, entrosamento, chute);
    }

    @Override
    public float habilidade() {
        // Cálculo da habilidade para atacantes
        float habilidadeAtacante = (float) ((passe*1.5f + chute*0 + defesa*2 + entrosamento*0.5f) / 4);
        return habilidadeAtacante;
    }
}