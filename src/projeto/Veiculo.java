package projeto;

public class Veiculo {
    private int anoFabricacao;
    private String placa;

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void exibirDados(){
        System.out.printf("Sua placa é: %s%n",getPlaca());
        System.out.printf("Seu ano de fabricação é: %d%n",getAnoFabricacao());

    }

    public Veiculo() {
    }

    public Veiculo(int anoFabricacao, String placa) {
        this.anoFabricacao = anoFabricacao;
        this.placa = placa;
    }


}
