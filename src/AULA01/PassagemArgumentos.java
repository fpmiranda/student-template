package AULA01;

public class PassagemArgumentos {

    public static int f(int a, int b){
        a++;
        b++;
        return a + b;
    }

    public static void passagemValor(){
        int a = 20;
        int b = 30;
        
        System.out.printf("a = %d, b = %d\n", a, b);
        f(a, b);
        System.out.printf("a = %d, b = %d\n", a, b);
    }

    public static void printArray(int[] v){
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }

    public static void incrementa(int[] v){
        for(int i = 0; i < v.length; i++){
            v[i]++;
        }
    }

    public static void passagemReferencia(){
        int[] v = {1, 2, 3, 4};

        printArray(v);
        incrementa(v);
        printArray(v);
    }

    public static void main(String[] args) {
        //passagemValor();
        passagemReferencia();
    }

}
