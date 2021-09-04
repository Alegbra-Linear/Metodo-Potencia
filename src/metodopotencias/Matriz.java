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

    public static double[] prodEscalar(double matriz[][], double vet[]) {

        double vetor[] = new double[vet.length];

        for (int i = 0; i < matriz[0].length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                vetor[i] += matriz[i][j] * vet[j];
            }
        }
        return vetor;

    }

    public static double[] vetNormalizada(double vet[]) {
        double autoValorTemp = autoValor(vet);

        double vetNormal[] = new double[vet.length];

        for (int i = 0; i < vet.length; i++) {
            vetNormal[i] = vet[i] / autoValorTemp;
        }

        return vetNormal;

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

    public static void metodoPotencia(double matriz[][], double vet[], int iterecao) {

        double vetor1[];

        System.out.println("------------------- AutoVetor ------------------ | -------- AutoValor -----------");
        for (int i = 0; i < iterecao; i++) {

            vetor1 = Matriz.prodEscalar(matriz, vet);
            vet = Matriz.vetNormalizada(vetor1);
            if (i == iterecao - 1) {
                System.out.println("\n--------------- AutoVetor Final ---------------- | ------ AutoValor Final -------");
            }
            Matriz.imprimirVet(vet);
            System.out.print(+autoValor(vetor1) + "\n");

        }

    }

    public static double autoValor(double vet[]) {
        double valor = 0;

        for (int i = 0; i < vet.length; i++) {
            if (i == 0) {
                valor = vet[i];
            } else {
                if (vet[i] > valor) {
                    vet[i] = valor;
                }
            }
        }
        return valor;
    }

}
