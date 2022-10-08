package menu;

import java.util.Scanner;

public class menu {
	static Scanner sc = new Scanner(System.in);

	public static void menuopcao() {
		System.out.println("escolha uma das opcao");
		System.out.println("01  IMC");
		System.out.println("02  despesas");
		System.out.println("03  tabuada");
		System.out.println("04  calcular formas geometrica");
		System.out.println("05  frete");
		System.out.println("06  pedra papel tesoura");
		System.out.println("07  impar ou par ");
		System.out.println("0  sair");
	}

	public static void IMC() {
		double massa;
		double altura;
		double resultado;

		System.out.println("informe sua altura");
		altura = sc.nextDouble();
		System.out.println("informe seu peso");
		massa = sc.nextDouble();
		resultado = massa / (altura * altura);

		System.out.println("o seu imc é" + resultado);
	}

	public static void despesas() {

		System.out.println("Qual é a sua renda mensal ?");
		double renda = sc.nextDouble();

		System.out.println("Qual valor da conta de Agua?");
		double Agua = sc.nextDouble();

		System.out.println("Qual o valor da sua conta de Luz?");
		double Luz = sc.nextDouble();

		System.out.println("qual o valor da sua internet ?");
		double internet = sc.nextDouble();

		System.out.println("qual o valor da gasto no  Mercado?");
		double mercado = sc.nextDouble();

		double despesas = Agua + Luz + internet + mercado;
		System.out.println("O gasto mensal Informado é " + despesas);

		double divide = despesas - renda;

		if (despesas > renda) {
			System.out.println("Suas despesas essedeu o valor da renda");
		} else {
			System.out.println("Temos um pouco de dinheiro para guarda esse mes ");

		}
	}

	public static void tabuada() {

		System.out.println("qual tabuada voce deseja saber");
		int tabuada = sc.nextInt();
		int i = 0;

		do {
			System.out.println(tabuada + "x" + i + " =" + (tabuada * i));
			i++;
		} while (i < 11);

	}

	public static void main(String[] args) {

		byte opcaoEscolhida = -1;
		menuopcao();

		while (opcaoEscolhida != 0) {

			opcaoEscolhida = sc.nextByte();

			switch (opcaoEscolhida) {
			case 1:
				IMC();
				break;
			case 2:
				despesas();
				break;
			case 3:
				tabuada();
				break;
			case 4:
				System.out.println("fazendo caculo de forma geomentricas");
				break;

			default:
				System.out.println("duifite um numero valido" + opcaoEscolhida);
				break;
			}
			sc.close();
		}
	}
}
