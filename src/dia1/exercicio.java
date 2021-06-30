package dia1;

import java.util.Scanner;

class Exercicio {
    //   public static void main(String[] args) {
//
//
//    }
    public static void exercicio1(){
        short y = 99;
        short z = 11;
        short coringa = 0;

        System.out.println("Valor de y antes da troca:" +y);
        System.out.println("Valor de z antes da troca:" +z);

        coringa = y;
        y = z;
        z = coringa;

        System.out.println("Valor de y depois da troca:" +y);
        System.out.println("Valor de z depois da troca:" +z);

    }
    public static void exercicio2(){
//        escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor para mostrar seu antecessor");
        int valor = in.nextInt();

        int antecessor = valor -1;

        System.out.println("O antecessor de " + valor + " é " + antecessor);
        System.out.println(antecessor);
        in.close();
    }
    public static void exercicio3 (){
//  A área do retângulo corresponde ao produto (multiplicação) da medida da base pela altura,
//  sendo expressa pela fórmula:
//   A = b x h
//   A: área b: base h: altura
//    Lembre-se que o retângulo é uma figura geométrica plana formada por quatro lados (quadrilátero).

        Scanner in = new Scanner(System.in);
        System.out.println("Qual a base do retângulo?");
        double base = in.nextDouble();
        System.out.println("Qual a altura do retângulo?");
        double altura = in.nextDouble();

        double area = base * altura;

        System.out.println("A área do retângulo é: " +area);
        in.close();

    }
    public static void exercicio4 (){
// número total de eleitores de um município,
// o número de votos brancos, nulos e válidos.
// Calcular e escrever o percentual que
// cada um representa em relação ao total de eleitores
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o total de eleitores?");
        int totalEleitores = in.nextInt();

        System.out.println("Quantos são os votos brancos?");
        int votosBrancos = in.nextInt();

        System.out.println("Quantos são os votos nulos?");
        int votosNulos = in.nextInt();

        System.out.println("Quantos são os votos válidos?");
        int votosValidos = in.nextInt();

        System.out.println("A quantidade total de votos é: " +totalEleitores);
        System.out.println("A quantidade de votos brancos é: " +votosBrancos);
        System.out.println("A quantidade de votos nulos é: "+votosNulos);
        System.out.println("A quantidade de votos válidos é: "+votosValidos);

        double percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        percentualVotosBrancos = votosBrancos * 100 / totalEleitores;
        percentualVotosNulos = votosNulos *100 / totalEleitores;
        percentualVotosValidos = votosValidos *100 / totalEleitores;

        System.out.println("A porcentagem de votos brancos é: " +percentualVotosBrancos+ "%");
        System.out.println("A porcentagem de votos nulos é: " +percentualVotosNulos+ "%");
        System.out.println("A porcentagem de votos válidos é: " +percentualVotosValidos+ "%");

        in.close();

    }
    public static void main (String[] args) {
        exercicio4();
    }

}



