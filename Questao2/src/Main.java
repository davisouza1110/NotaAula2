import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        UberCorrida corrida = new UberCorrida();

        System.out.println("Digite a distância pecorrida: ");
        corrida.setDistancia(sc.nextDouble());

        System.out.println("Digite o tempo de espera (minutos): ");
        corrida.setTempoEspera(sc.nextInt());

        System.out.println("Digite a tarifa base: ");
        corrida.setTarifaBase(sc.nextDouble());

        System.out.println("Digite o fator demanda: ");
        corrida.setFatorDemanda(sc.nextDouble());

        corrida.calcularValorCorrida();

        corrida.exibirDetalherCorrida();


    }
    }
