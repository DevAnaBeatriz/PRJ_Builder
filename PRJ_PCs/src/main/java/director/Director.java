/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package director;

/**
 *A classe Director encapsula o conhecimento sobre como montar diferentes tipos de 
 * computadores de forma padronizada. Ela define métodos como constructGamingPC,
 * constructOfficePC e constructWorkstationPC, que executam uma sequência fixa de
 * chamadas no Builder, garantindo consistência no processo. Essa camada de direção
 * permite que o cliente construa produtos complexos sem conhecer os detalhes da
 * montagem, promovendo a reutilização do processo e a padronização entre diferentes
 * tipos de produtos. Essa separação é essencial na aplicação do padrão Builder.
 * @author Ana Beatriz
 */


import builder.Builder;
import components.CPU;
import components.GPU;
import components.OS;
import components.Storage;

public class Director {

    public void constructGamingPC(Builder builder) {
        builder.setCPU(new CPU("Intel Core i9"));
        builder.setRAM(32);
        builder.setStorage(new Storage("1TB SSD"));
        builder.setGPU(new GPU("NVIDIA RTX 4090"));
        builder.setOS(new OS("Windows 11"));
    }

    public void constructOfficePC(Builder builder) {
        builder.setCPU(new CPU("Intel Core i5"));
        builder.setRAM(8);
        builder.setStorage(new Storage("512GB SSD"));
        builder.setGPU(new GPU("Integrada"));
        builder.setOS(new OS("Windows 11"));
    }

    public void constructWorkstationPC(Builder builder) {
        builder.setCPU(new CPU("AMD Ryzen Threadripper"));
        builder.setRAM(64);
        builder.setStorage(new Storage("2TB NVMe SSD"));
        builder.setGPU(new GPU("NVIDIA Quadro RTX"));
        builder.setOS(new OS("Linux Ubuntu"));
    }
}
