/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *A classe PCManualBuilder também implementa a interface Builder, mas ao 
 * invés de construir um PC funcional, ela monta um objeto PCManual, que
 * representa uma documentação ou descrição do computador configurado. 
 * Essa classe mostra a vantagem central do padrão Builder: a possibilidade
 * de usar os mesmos passos de construção (setCPU, setRAM, etc.) para gerar
 * produtos com propósitos diferentes, mantendo a coerência na montagem e
 * sem duplicar lógica. Isso reforça o princípio da separação entre construção
 * e representação do Builder.
 * @author Ana Beatriz
 */

import components.CPU;
import components.GPU;
import components.OS;
import components.Storage;
import product.*;

public class PCManualBuilder implements Builder {
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

    public PCManual getResult() {
        return new PCManual(cpu, ram, storage, gpu, os);
    }
}
