package questao_02.adapter;


import questao_02.model.MedidorCelsiusIF;
import questao_02.model.MedidorFarenheit;

public class AdaptadorFarenheitParaCelsiusObjectAdapter implements MedidorCelsiusIF {
    private MedidorFarenheit medidorFarenheit;

    public AdaptadorFarenheitParaCelsiusObjectAdapter(MedidorFarenheit medidorFarenheit) {
        this.medidorFarenheit = medidorFarenheit;
    }

    @Override
    public double medirTemperatura() {
        double temperaturaFarenheit = medidorFarenheit.getTemperaturaFarenheit();
        double temperaturaCelsius = (temperaturaFarenheit - 32) * 5 / 9;
        return temperaturaCelsius;
    }
}
