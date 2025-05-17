/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *A classe PCBuilder é a implementação concreta da interface Builder, responsável 
 * por construir um objeto real do tipo PC. Ela mantém internamente os dados de
 * configuração definidos durante o processo de montagem e, ao final, fornece o
 * método getResult() para retornar o objeto totalmente montado. Essa abordagem 
 * desacopla o processo de construção do produto final, permitindo que o mesmo
 * processo de montagem seja usado para criar diferentes tipos de PCs com 
 * combinações variadas de componentes, promovendo reutilização e flexibilidade.
 * @author Ana Beatriz
 */


import components.CPU;
import components.GPU;
import components.OS;
import components.Storage;
import product.*;

public class PCBuilder implements Builder {
    private CPU cpu;
    private int ram;
    private Storage storage;
    private GPU gpu;
    private OS os;

    @Override
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }

    @Override
    public void setRAM(int gb) {
        this.ram = gb;
    }

    @Override
    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void setGPU(GPU gpu) {
        this.gpu = gpu;
    }

    @Override
    public void setOS(OS os) {
        this.os = os;
    }

    public PC getResult() {
        return new PC(cpu, ram, storage, gpu, os);
    }
}
