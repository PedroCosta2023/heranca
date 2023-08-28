package projeto;

public class Main {
    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo(2022,"ada12");
        Onibus onibus = new Onibus(2000, "pre123", 40);
        Caminhao caminhao = new Caminhao(2023, "pre3", 4);

        veiculo.exibirDados();
        onibus.exibirDados();
        caminhao.exibirDados();

    }
}