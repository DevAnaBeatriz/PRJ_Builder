/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package product;

import components.CPU;
import components.GPU;
import components.OS;
import components.Storage;

/**
 *A classe PC representa o produto final criado pelo PCBuilder. Ela contém os
 * atributos configuráveis definidos durante o processo de construção, como CPU,
 * memória RAM e sistema operacional. O construtor recebe todos os dados já
 * configurados, o que garante que o objeto seja criado em um estado consistente.
 * Isso evita o uso de múltiplos construtores sobrecarregados ou objetos 
 * incompletos, algo que o padrão Builder resolve elegantemente ao delegar a
 * montagem para uma classe especializada.
 * @author Ana Beatriz
 */


public class PC {
    private final CPU cpu;
    private final int ram;
    private final Storage storage;
    private final GPU gpu;
    private final OS os;

    public PC(CPU cpu, int ram, Storage storage, GPU gpu, OS os) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }

    public void showSpecs() {
        System.out.println("=== Especificações do PC ===");
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Armazenamento: " + storage);
        System.out.println("GPU: " + gpu);
        System.out.println("Sistema Operacional: " + os);
    }
}

