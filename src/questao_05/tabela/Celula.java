package questao_05.tabela;

import questao_05.model.Composite;

    public class Celula extends Composite {
    private String conteudo;

    public Celula(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void imprimi() {
        String conteudo = this.conteudo.substring(0, Math.min(this.conteudo.length(), 15));
        System.out.print("| " + conteudo);
    }
}
