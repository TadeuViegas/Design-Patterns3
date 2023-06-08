package questao_06;


import questao_06.bridge.ImplementacaoDePersistencia;
import questao_06.bridge.ImplementacaoDePersistenciaJSON;
import questao_06.bridge.ImplementacaoDePersistenciaXML;
import questao_06.model.Carro;
import questao_06.model.Pessoa;

public class Main {
    public static void main(String[] args) {
        //simples mensagem exibida
        //indicando o método empregado seguido do conteúdo do objeto a ser armazenado.
        System.out.println("--------- SAIDA PARA 2 METODOS: XML e JSON -------------\n");

        ImplementacaoDePersistencia persistenciaXML = new ImplementacaoDePersistenciaXML();
        Pessoa pessoaXML = new Pessoa(persistenciaXML);

        //Objeto pessoa
        pessoaXML.persiste();
        System.out.println();

        ImplementacaoDePersistencia persistenciaJSON = new ImplementacaoDePersistenciaJSON();
        Carro carroJSON = new Carro(persistenciaJSON);

        //Objeto carro
        carroJSON.persiste();
    }
}