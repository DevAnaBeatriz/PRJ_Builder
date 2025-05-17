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
 *PCManual é uma representação alternativa do mesmo conjunto de dados usado para 
 * construir um PC, porém com o propósito de gerar um documento explicativo. Ao
 * mostrar que o mesmo processo de construção pode gerar diferentes produtos
 * finais, essa classe evidencia a principal vantagem do Builder: separar a 
 * lógica de montagem da forma do objeto resultante. O método printManual
 * formata e apresenta as informações de forma amigável ao usuário, reforçando
 * a ideia de múltiplas representações de um objeto complexo
 * @author Ana Beatriz
 */


public class PCManual {
    private final CPU cpu;
    private final int ram;
    private final Storage storage;
    private final GPU gpu;
    private final OS os;

    public PCManual(CPU cpu, int ram, Storage storage, GPU gpu, OS os) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }

    public String printManual() {
        return String.format("""
        === Manual do Computador ===
        Processador: %s
        Memória RAM: %d GB
        Armazenamento: %s
        Placa de Vídeo: %s
        Sistema Operacional: %s
        """, cpu, ram, storage, gpu, os);
    }
}
