public class Caminhao extends Veiculos{
    private double capacidadeCarga;
    private boolean mostraExtra;

    public Caminhao(String placa, String marca, double preco, double capacidadeCarga, boolean mostraExtra){
        super(placa, marca, preco);
        this.capacidadeCarga = capacidadeCarga;
        this.mostraExtra = mostraExtra;
    }

    public double getCapacidadeCarga(){
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    }

    public boolean getmostraExtra(){
        return mostraExtra;
    }

    public void setMostraExtra(boolean mostraExtra){
        this.mostraExtra = mostraExtra;
    }

    public void InformaDescontoCaminhao(){
        super.InformaDescontoCaminhao();
        if (mostraExtra){
            System.out.println("A quantidade de carga do caminhão é de = " + getCapacidadeCarga());
        }
    }
}
