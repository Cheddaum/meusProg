import java.util.Scanner;




public class JavaExe2 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);    
        int a, b, c;
        System.out.println("Digite um número:");
        a = leitor.nextInt();
        System.out.println("Digite outro número:");
        b = leitor.nextInt();
        System.out.println("Digite um último número:");
        c = leitor.nextInt();
        if(a<b){
            if(b<c){
                System.out.println(a+"-"+b+"-"+c);
            }
            else if (a<c){
                System.out.println(a+"-"+c+"-"+b);
            }  else{
                System.out.println(c+"-"+a+"-"+b);
            }
        }
        else if (b<c){
             if (a<c){
                System.out.println(b+"-"+a+"-"+c);
            }  else{
                System.out.println(b+"-"+c+"-"+a);
            }   
        } else {
            System.out.println(c+"-"+b+"-"+a);
        }   
    
    }
}