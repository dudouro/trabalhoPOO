/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefutebol;

public class Clube {
    private DEF[] defensores = new DEF[5];
    private ATA[] atacantes = new ATA[4];
    private MEI[] meioCampistas = new MEI[4];

    public Clube(DEF[] defensores, ATA[] atacantes, MEI[] meioCampistas) {
        if (defensores.length != 5 || atacantes.length != 4 || meioCampistas.length != 4) {
            throw new IllegalArgumentException("O clube deve conter 5 defensores, 4 atacantes e 4 meio-campistas.");
        }
        
        this.defensores = defensores;
        this.atacantes = atacantes;
        this.meioCampistas = meioCampistas;
    }

    public void listarJogadores() {
        System.out.println("Defensores:");
        for (DEF defensor : defensores) {
            System.out.println(defensor.getNome() + " (Posição: Defensor, Número: " + defensor.getNumeroCamisa() + ")");
        }

        System.out.println("Atacantes:");
        for (ATA atacante : atacantes) {
            System.out.println(atacante.getNome() + " (Posição: Atacante, Número: " + atacante.getNumeroCamisa() + ")");
        }

        System.out.println("Meio-Campistas:");
        for (MEI meioCampista : meioCampistas) {
            System.out.println(meioCampista.getNome() + " (Posição: Meio-Campista, Número: " + meioCampista.getNumeroCamisa() + ")");
        }
    }
    public void habilidadeClube(){
    
    
    
    
    
    }
}
