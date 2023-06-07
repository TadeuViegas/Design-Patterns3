package questao_02;

import questao_02.adapter.AdaptadorFarenheitParaCelsiusClassAdapter;
import questao_02.adapter.AdaptadorFarenheitParaCelsiusObjectAdapter;
import questao_02.model.MedidorCelsiusIF;
import questao_02.model.MedidorFarenheit;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n-------------------- Teste Conversão de Temperaturas --------------------\n ");

        // Abordagem Object Adapter
        MedidorFarenheit medidorFarenheit = new MedidorFarenheit();
        MedidorCelsiusIF adaptadorObject = new AdaptadorFarenheitParaCelsiusObjectAdapter(medidorFarenheit);
        double temperaturaCelsiusObject = adaptadorObject.medirTemperatura();

        System.out.println("Temperatura em Celsius usando abordagem Ojbect Adpater: "
                + temperaturaCelsiusObject +
                "°C");

        // Abordagem Class Adapter
        MedidorCelsiusIF adaptadorClass = new AdaptadorFarenheitParaCelsiusClassAdapter();
        double temperaturaCelsiusClass = adaptadorClass.medirTemperatura();

        System.out.println("Temperatura em Celsius usando abordagem Class Adpater: "
                + temperaturaCelsiusClass +
                "°C");
    }
}
/*
PERGUNTA TEÓRICA
    c) Explique a razão de ambos os adaptadores implementados respeitar o princípio “aberto/fechado”.

        Ambos estão abertas para extensão e fechada para modificação, visto que,
        temos a interface em comum MedidorCelsiusIF,
        assim pode-se usar qualquer implementação especifica implementando-a.
        Exemplo, poderiamos adicionar a temperatura Kelvin que vai depender de uma abstração/interface,
        assim novas implementaçoes podem ser introduzidas sem afetar o codigo existente.
*/


