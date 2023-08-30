public class Main {
    public static void main(String[] args) {

        //Classe Obejeto        Construtor
        Turista mochileiro = new Turista();

        //Definir formato dos objeto
        mochileiro.setNome("Lindssay Lohan");
        mochileiro.setCpf(Validacao.cpf("123"));
        Turista mochileira = new Turista("Maria");

        String retorno = mochileira.viajar();
        System.out.println(retorno);
    }
}