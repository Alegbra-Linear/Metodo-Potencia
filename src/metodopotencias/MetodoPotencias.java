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
public class MetodoPotencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double matrizInicial[][] ={ // Matriz para o video 
            {-4,14,0,-4 ,14,0 },
            {-5,13,0,-5 ,13,0 }, 
            {-1,0 ,2,-1 ,0 ,2 }, 
            {-4,14,0,-4 ,14,0 }, 
            {-5,13,0,-5 ,13,0 }, 
            {-1,0 ,1,-1 ,0 ,1 }
        }; 
        double vet[] = {1,1,1,1,1,1};   // vetor para o video 
       
        double matrizTesteMat[][] = {
             {-4 ,14,0 }, 
             {-5 ,13,0 },
             {-1 ,0 ,2 }
         };
        double vetTestMat[] = {1,1,1}; // vetor 
        
        int iteracao = 12;

       // Matriz.metodoPotencia(matrizInicial, vet, iteracao);

        Matriz.metodoPotencia(matrizTesteMat, vetTestMat, iteracao);
    }
}
