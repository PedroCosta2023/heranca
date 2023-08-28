package projeto;

public class Caminhao extends Veiculo{
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(int anoFabricacao, String placa, int eixos) {
        super(anoFabricacao, placa);
        this.eixos = eixos;
    }

    public void exibirDados(){
        System.out.printf("Sua placa é: %s%n",getPlaca());
        System.out.printf("Seu ano de fabricação é: %d%n",getAnoFabricacao());
        System.out.printf("Seu caminhão tem eixos: %d%n",getEixos());

    }

    private int eixos;



}
