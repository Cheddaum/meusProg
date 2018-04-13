
package exercício3;

import java.util.Scanner;
        
public class Exercício3 {

    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int a, b;
        System.out.println("Digite um número");
        a = leitor.nextInt();
        System.out.println("Digite outro número");
        b = leitor.nextInt();
        if (a<b){
            System.out.println("Este é o maior número"+b);
            }
        if (b<a){
            System.out.println("Este é o maior número" +a);
    }
}
}