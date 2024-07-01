package AULA01;

public class EstruturasDesvio {
    public static void main(String[] args) {
        
        for(int i = 0; i < 10; i++){
            /*if(i == 6){
                break;
            }*/
            if(i % 2  == 0){
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("O for terminou.");
    }
}

