/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj_pcs;
import builder.*;
import director.Director;
import product.*;
/**
 * Na classe Main, vemos a aplicação prática do padrão Builder. Um Director coordena 
 * o processo de construção, enquanto o cliente escolhe se deseja montar um produto
 * (PCBuilder) ou apenas obter uma documentação (PCManualBuilder). O cliente não
 * precisa se preocupar com os detalhes de como o objeto é montado; ele apenas
 * solicita ao Director que siga um processo predefinido. Isso demonstra a
 * capacidade do padrão Builder de tornar a criação de objetos complexos mais 
 * compreensível, modular e flexível* sem alterar o processo de construção
 * em si, seguindo fielmente o padrão Builder.
 * @author Ana Beatriz
 */
public class PRJ_PCs {

    public static void main(String[] args) {
        Director director = new Director();

        PCBuilder pcBuilder = new PCBuilder();
        director.constructGamingPC(pcBuilder);
        PC gamingPC = pcBuilder.getResult();
        gamingPC.showSpecs();

        System.out.println();

        PCManualBuilder manualBuilder = new PCManualBuilder();
        director.constructGamingPC(manualBuilder);
        PCManual manual = manualBuilder.getResult();
        System.out.println(manual.printManual());
    }
}
