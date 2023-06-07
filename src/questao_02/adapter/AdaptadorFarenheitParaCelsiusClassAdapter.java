package questao_02.adapter;


import questao_02.model.MedidorCelsiusIF;
import questao_02.model.MedidorFarenheit;

public class AdaptadorFarenheitParaCelsiusClassAdapter extends MedidorFarenheit implements MedidorCelsiusIF {
    @Override
    public double medirTemperatura() {
        double temperaturaFarenheit = getTemperaturaFarenheit();
        // Obs: formula de conversao descrita na atividade
        double temperaturaCelsius = (temperaturaFarenheit - 32) * 1.8;
        return temperaturaCelsius;
    }
}
