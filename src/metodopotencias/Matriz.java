/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodopotencias;

/**
 *
 * @author adail
 */
public class Matriz {

    public static void metodoPotencia(double matriz[][], double vet[], int iterecao) throws Exception {

        // verificação 
        verificacao(matriz, vet);

        double vetProdEscalar[];

        System.out.println("------------------- AutoVetor ------------------ | -------- AutoValor -----------");
        for (int i = 0; i < iterecao; i++) {

            vetProdEscalar = Matriz.prodEscalar(matriz, vet);
            vet = Matriz.vetNormalizada(vetProdEscalar);

            if (i == iterecao - 1) {
                System.out.println("\n--------------- AutoVetor Final ---------------- | ------ AutoValor Final -------");
            }
            Matriz.imprimirVet(vet);
            System.out.print(autoValor(vetProdEscalar) + "\n");

        }

    }

    public static double[] prodEscalar(double matriz[][], double vet[]) { // faz o produto escalar da matriz e do vetor passados

        double vetor[] = new double[vet.length];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz.length; j++) {
                vetor[i] += matriz[i][j] * vet[j];
            }
        }
        return vetor; // (10,8,1) --> explicacao video 

    }

    public static double[] vetNormalizada(double vet[]) {
        double autoValor = autoValor(vet); // 10 --> explicacao video

        double autoVetor[] = new double[vet.length];

        for (int i = 0; i < vet.length; i++) {
            autoVetor[i] = vet[i] / autoValor; 
        }

        return autoVetor;

    }

    public static double autoValor(double vet[]) { // retorna o maior valor do vetor 
        double valor = 0;

        for (int i = 0; i < vet.length; i++) {
            if (i == 0) {
                valor = vet[i];
            } else {
                if (vet[i] > valor) {
                    valor = vet[i];
                }
            }
        }
        return valor;
    }

    public static void imprimirVet(double vet[]) {
        for (int i = 0; i < vet.length; i++) {
            if (i == 0) {
                System.out.print("( " + vet[i] + ", ");
            } else if (i == vet.length - 1) {
                System.out.print(vet[i] + " ) = ");
            } else {
                System.out.print(vet[i] + ", ");
            }
        }
    }

    public static void verificacao(double matriz[][], double vet[]) throws Exception {

        if (matrizIsNull(matriz) || vetorIsNull(vet)) {
            throw new Exception("Matriz ou vetor nulos");
        } else if (matriz.length != vet.length) {
            throw new Exception("Vetor não é do mesmo tamanho da matriz");
        }
        if (!matrizIsSquare(matriz)) {
            throw new Exception("Matriz não Quadrada");
        }

    }

    public static boolean matrizIsNull(double matriz[][]) { // verifica se a matriz é nula 

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }

        }

        return true;

    }

    public static boolean matrizIsSquare(double matriz[][]) { // verifica se a matriz é quadrada 

        int i = 0;
        int j = 0;

        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
            }
        }

        if (i != j) {
            return false;

        }
        return true;
    }

    public static boolean vetorIsNull(double vet[]) { // verifica se o vetor é nulo 

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] != 0) {
                return false;
            }
        }

        return true;
    }

}
