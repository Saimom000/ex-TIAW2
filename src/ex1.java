import java.util.*;
class ex1 {
     public static Scanner sc = new Scanner(System.in);
  
     public static int somar(int[] array){
        int soma = 0;
         
        for(int i = 0; i < array.length; i++){
            soma += array[i];          
        }
        return soma;
     }
     
     public static void main (String[] args){
        System.out.println("    Soma de numero inteiros\nDigite quantos numeros vao ser somados:");
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n;i++){
            System.out.println("Digite o numero "+(i+1));
            array[i] = sc.nextInt();
        }
        System.out.println("Soma:"+somar(array));
     }
  }