import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculos> listaveiculos = new ArrayList<>();

        while (true) {
            System.out.println("--------------------");
            System.out.println("Cadastro de veículos");
            System.out.println("--------------------");
            System.out.println("[1] - Cadastro de Carro");
            System.out.println("[2] - Cadastro de Moto");
            System.out.println("[3] - Cadastro de Caminhão");
            System.out.println("[4] - Exibir veículos cadastrados");
            System.out.println("[5} - Finalizar cadastrados");

            System.out.print("Digite a opção que deseja escolher: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.println("Cadastramento de carro");
                Carro caro1 = new Carro(null, null, 0, 0, false);

                System.out.print("Informe a placa: ");
                caro1.setPlaca(sc.nextLine());
                System.out.print("Informe a marca: ");
                caro1.setMarca(sc.nextLine());
                System.out.print("Informe o preço: ");
                caro1.setPreco(sc.nextDouble());
                System.out.print("Informe o número de portas do carro: ");
                caro1.setNumPortas(sc.nextInt());
                sc.nextLine();

                System.out.print("Deseja ver o número de portas do carro? (s/n): ");
                String resposta = sc.nextLine();
                caro1.setMostraExtra(resposta.equalsIgnoreCase("s"));

                listaveiculos.add(new Carro(
                        caro1.getPlaca(), caro1.getMarca(), caro1.getPreco(),
                        caro1.getNumPortas(), caro1.getMostraExtra()
                ));
                System.out.println("Cadastro do carro realizado com sucesso!");
            }

            else if (opcao == 2) {
                System.out.println("Cadastramento de moto");
                Moto moto1 = new Moto(null, null, 0, 0, false);

                System.out.print("Informe a placa: ");
                moto1.setPlaca(sc.nextLine());
                System.out.print("Informe a marca: ");
                moto1.setMarca(sc.nextLine());
                System.out.print("Informe o preço: ");
                moto1.setPreco(sc.nextDouble());
                System.out.print("Informe a quantidade de cilindradas: ");
                moto1.setCilindradas(sc.nextInt());
                sc.nextLine();

                System.out.print("Deseja ver o número de cilindradas da moto? (s/n): ");
                String resposta = sc.nextLine();
                moto1.setMostraExtra(resposta.equalsIgnoreCase("s"));

                listaveiculos.add(new Moto(
                        moto1.getPlaca(), moto1.getMarca(), moto1.getPreco(),
                        moto1.getCilindradas(), moto1.getMostraExtra()
                ));
                System.out.println("Cadastro da moto realizado com sucesso!");
            }

            else if (opcao == 3) {
                System.out.println("Cadastramento de caminhão");
                Caminhao caminhao1 = new Caminhao(null, null, 0, 0, false);

                System.out.print("Informe a placa: ");
                caminhao1.setPlaca(sc.nextLine());
                System.out.print("Informe a marca: ");
                caminhao1.setMarca(sc.nextLine());
                System.out.print("Informe o preço: ");
                caminhao1.setPreco(sc.nextDouble());
                System.out.print("Informe a capacidade de carga: ");
                caminhao1.setCapacidadeCarga(sc.nextInt());
                sc.nextLine();

                System.out.print("Deseja ver a capacidade de carga do caminhão? (s/n): ");
                String resposta = sc.nextLine();
                caminhao1.setMostraExtra(resposta.equalsIgnoreCase("s"));

                listaveiculos.add(new Caminhao(
                        caminhao1.getPlaca(), caminhao1.getMarca(), caminhao1.getPreco(),
                        caminhao1.getCapacidadeCarga(), caminhao1.getmostraExtra()
                ));
                System.out.println("Cadastro do caminhão realizado com sucesso!");
            }

            else if (opcao == 4) {
                if (listaveiculos.isEmpty()) {
                    System.out.println("Sem veículos cadastrados.");
                } else {
                    for (Veiculos v : listaveiculos) {
                        if (v instanceof Carro) ((Carro) v).InformaDescontoCarro();
                        else if (v instanceof Moto) ((Moto) v).InformaDescontoMoto();
                        else if (v instanceof Caminhao) ((Caminhao) v).InformaDescontoCaminhao();
                    }
                }
            } else if (opcao == 5) {
                System.out.println("Finalizado");
                break;
            }

            else {
                System.out.println("A opção não existe !");
            }
        }
    }
}
