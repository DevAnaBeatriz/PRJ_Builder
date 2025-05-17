/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *A interface Builder define o contrato que todas as classes concretas de construção
 * devem seguir. Ela representa os passos genéricos de montagem de um objeto complexo
 * , no caso, um computador personalizado. Os métodos setCPU, setRAM, setStorage, 
 * setGPU e setOS estabelecem etapas que permitem configurar individualmente cada 
 * parte do PC. Esta separação dos passos facilita a criação de diferentes 
 * representações do mesmo produto (por exemplo, um PC real ou um manual) 
 * sem alterar o processo de construção em si, seguindo fielmente o padrão Builder.
 * @author Ana Beatriz
 */

import components.CPU;
import components.GPU;
import components.OS;
import components.Storage;
import product.*;

public interface Builder {
    void setCPU(CPU cpu);
    void setRAM(int gb);
    void setStorage(Storage storage);
    void setGPU(GPU gpu);
    void setOS(OS os);
}
