/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefutebol;


public class ATA extends Jogador {
    public ATA(String nome, int idade, double altura, double peso, String cpf, int numeroCamisa, float vigor, float entrosamento, float chute) {
        super(nome, idade, altura, peso, cpf, numeroCamisa, vigor, entrosamento, chute);
    }

    @Override
    public float habilidade() {
        // Cálculo da habilidade para atacantes
        float habilidadeAtacante = (float) ((passe*0.75f + chute*2f + defesa*0 + entrosamento*1.25f) / 4);
        return habilidadeAtacante;
    }
}