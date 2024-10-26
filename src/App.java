// classe de conversão de unidades
class ConversorDeUnidades {
    // metodo que vai estar convertendo celsius para Fahrenheit
    public static double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        return (temperaturaCelsius * 9 / 5) + 32;
    }

    // metoso que vai estar convertendo quilometros para milhas
    public static double converterQuilometrosParaMilhas(double distanciaQuilometros) {
        return distanciaQuilometros * 0.621371;
    }

    // metodo que vai estar convertendo gramas para libras
    public static double converterGramasParaLibras(double pesoGramas) {
        return pesoGramas * 0.00220462;
    }
}

// classe principal
public class Main {
    public static void main(String[] args) {
        // faz conversão de Celsius para Fahrenheit
        double temperaturaCelsius = 30.0;
        double temperaturaFahrenheit = ConversorDeUnidades.converterCelsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + "°C é igual a " + temperaturaFahrenheit + "°F");

        // faz conversão de quilômetros para milhas
        double distanciaQuilometros = 16.0;
        double distanciaMilhas = ConversorDeUnidades.converterQuilometrosParaMilhas(distanciaQuilometros);
        System.out.println(distanciaQuilometros + " km é igual a " + distanciaMilhas + " milhas");

        // faz conversão de gramas para libras
        double pesoGramas = 250.0;
        double pesoLibras = ConversorDeUnidades.converterGramasParaLibras(pesoGramas);
        System.out.println(pesoGramas + " g é igual a " + pesoLibras + " lbs");
    }
}
