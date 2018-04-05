import java.util.Scanner;
public class JavaExe1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        int n, o, sub;
        System.out.println("Digite um número");
        n = leitor.nextInt();
        System.out.println("Digite outro número");
        o = leitor.nextInt();
        sub=n-o;
        System.out.println("A diferença restante é:"+sub);
        
    }
    
}
