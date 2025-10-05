public class Veiculos {
    protected String placa, marca;
    protected double preco;

    public Veiculos(String placa, String marca, double preco){
        this.placa = placa;
        this.marca = marca;
        this.preco = preco;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public void InformaDados(){
        System.out.println("Placa = " + getPlaca());
        System.out.println("Marca = " + getMarca());
        System.out.println("Preço = " + getPreco());
    }

    public void InformaDescontoCarro(){
        System.out.println("Placa = " + getPlaca());
        System.out.println("Marca = " + getMarca());
        if (getPreco() > 200.00){
            System.out.println("O valor do carro com desconto foi de = " + (getPreco() - (getPreco() * 0.10)));
        }
        else {
            System.out.println("O valor do carro sem desconto foi de =" + getPreco());
        }
    }

    public void InformaDescontoMoto(){
        System.out.println("Placa = " + getPlaca());
        System.out.println("Marca = " + getMarca());
        if (getPreco() > 15.00){
            System.out.println("O valor da moto com desconto foi de = " + (getPreco() - (getPreco() * 0.08)));
        }
        else {
            System.out.println("O valor da moto sem desconto foi de =" + getPreco());
        }
    }

    public void InformaDescontoCaminhao() {
        System.out.println("Placa = " + getPlaca());
        System.out.println("Marca = " + getMarca());
        if (getPreco() > 120.000) {
            System.out.println("O valor do caminhão com desconto foi de = " + (getPreco() - (getPreco() * 0.20)));
        } else {
            System.out.println("O valor do caminhão sem desconto foi de =" + getPreco());
        }
    }
}