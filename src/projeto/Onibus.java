package projeto;

public class Onibus extends Veiculo{
    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(int anoFabricacao, String placa, int assentos) {
        super(anoFabricacao, placa);
        this.assentos = assentos;
    }

    public void exibirDados(){
        System.out.printf("Sua placa é: %s%n",this.getPlaca());
        System.out.printf("Seu ano de fabricação é: %d%n",this.getAnoFabricacao());
        System.out.printf("Seu onibus tem assentos: %d%n",getAssentos());

    }

    private int assentos;
}
