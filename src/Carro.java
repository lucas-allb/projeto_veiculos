public class Carro extends Veiculos{
    private int numPortas;
    private boolean mostraExtra;

    public Carro(String placa, String marca, double preco, int numPortas, boolean mostraExtra){
        super(placa,marca,preco);
        this.numPortas = numPortas;
        this.mostraExtra = mostraExtra;
    }
    public int getNumPortas(){
        return numPortas;
    }

    public void setNumPortas(int numPortas){
        this.numPortas = numPortas;
    }

    public boolean getMostraExtra(){
        return mostraExtra;
    }

    public void setMostraExtra(boolean mostraExtra){
        this.mostraExtra = mostraExtra;
    }

    public void InformaDescontoCarro(){
        super.InformaDescontoCarro();
        if (mostraExtra){
            System.out.println("O número de portas do carro é = " + getNumPortas());
        }
    }
}
