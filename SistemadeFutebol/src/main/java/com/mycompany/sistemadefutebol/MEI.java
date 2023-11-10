/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefutebol;

/**
 *
 * @author eduar
 */
public class MEI extends Jogador {
    public MEI(String nome, int idade, double altura, double peso, String cpf, int numeroCamisa, float vigor, float entrosamento, float chute) {
        super(nome, idade, altura, peso, cpf, numeroCamisa, vigor, entrosamento, chute);
    }

    @Override
    public float habilidade() {
        // Cálculo da habilidade para atacantes
        float habilidadeAtacante = (float) ((passe + chute + defesa + entrosamento) / 4);
        return habilidadeAtacante;
    }
}