public class Moto extends Veiculos{
    private int cilindradas;
    private boolean mostraExtra;

    public Moto(String placa, String marca, double preco, int cilindradas, boolean mostraExtra){
        super(placa, marca, preco);
        this.cilindradas = cilindradas;
        this.mostraExtra = mostraExtra;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public void setCilindradas(int cilindradas){
        this.cilindradas = cilindradas;
    }

    public boolean getMostraExtra(){
        return mostraExtra;
    }

    public void setMostraExtra(boolean mostraExtra){
        this.mostraExtra = mostraExtra;
    }

    public void InformaDescontoMoto(){
        super.InformaDescontoMoto();
        if (mostraExtra){
            System.out.println("A quantidade de cilindradas foi de = " + getCilindradas());
        }
    }
}
