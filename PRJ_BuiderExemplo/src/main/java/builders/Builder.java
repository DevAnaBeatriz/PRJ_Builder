/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builders;

import cars.CarType;
import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;

/**
 *Esse código define a interface Builder, que é a base do padrão de projeto Builder.
 * Ela especifica os métodos que qualquer classe concreta de construção deve implementa
 * para criar e configurar as partes de um objeto complexo — neste caso, um carro. 
 * Cada método representa um passo no processo de construção, como definir o tipo
 * do carro, número de assentos, motor, transmissão e componentes adicionais como
 * o computador de bordo e o GPS. Essa abordagem permite que diferentes implementações
 * de Builder criem diferentes representações do objeto final, mantendo o processo 
 * de construção separado da lógica de representação.
 * @author Ana Beatriz
 */
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}