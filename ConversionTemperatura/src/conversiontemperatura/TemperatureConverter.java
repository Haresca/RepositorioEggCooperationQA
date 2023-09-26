/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversiontemperatura;

/**
 *
 * @author hesca
 */
public class TemperatureConverter {

    public double celsiusaFahrenheit(double gradosC) {
        return 32 + (9 * gradosC / 5);
    }

    public double fahrenheitaCelsius(double gradosF) {
        return (5 * (gradosF - 32)) / 9;
    }

    public double celsiusaKelvin(double gradosC) {
        return 273 + gradosC;
    }

    public double kelvinaCelsius(double gradosK) {
        return gradosK - 273;
    }

    public double fahrenheitaKelvin(double gradosF) {
        return (5*(gradosF - 32)/9) + 273;
    }

    public double kelvinaFahrenheit(double gradosK) {
        return (9*(gradosK - 273)/5) + 32;
    }

}
