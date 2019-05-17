/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package congruencialmixto;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class CongruencialMixto {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double c, a, m, sem, res = 0, lim = 0, cont = 0, i = 0,compara;
        int j = 0, cont1 = 0, cont2=0;
        System.out.println("Ingrese Costante Aditiva");
        c = num.nextDouble();
        System.out.println("Ingrese Multiplicador");
        a = num.nextDouble();
        System.out.println("Ingrese Modulo");
        m = num.nextDouble();
        System.out.println("Ingrese Semilla");
        sem = num.nextDouble();
        int[] vector1 = new int[(int)m];
        double[] vector2 = new double[(int)m];
        double[] vector3 = new double[(int)m];
        double[] vector4 = new double[(int)m];
        double[] v = new double[4];
        double[] ve = new double[5];
        compara=sem;
        int[] resultado = new int[(int)m];
        do{
            vector1[j] = j;
            lim = sem;
            vector2[j] =lim;
            res = ((sem * a) + c) % m;
            vector3[j] =res;
            sem = res;
            cont++;
            vector4[j] = res / m;
            j++;
        }while(res !=compara);
        System.out.println("n\t"+"Xn\t"+"Xn+1\t"+"N. Uniformes");
        for (int k = 0; k < vector4.length; k++) {
            System.out.println("" + vector1[k]+"\t"+ vector2[k]+"\t"+vector3[k]+"\t"+vector4[k]);
        }
    }
    
    
}
