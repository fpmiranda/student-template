package AULA01;
public class Selecao {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if(a != b){
            System.out.println("a != b");
        }

        if(a == b){
            System.out.println("a == b");
        }else if(a < b){
            System.out.println("a < b");
        }else{
            System.out.println("a != b");
        }

        String nomeDia;
        int dia = 3;

        switch (dia) {
            case 1: nomeDia = "Domingo"; break;
            case 2: nomeDia = "Segunda"; break;
            case 3: nomeDia = "Terça"; break;
            case 4: nomeDia = "Quarta"; break;
            case 5: nomeDia = "Quinta"; break;
            case 6: nomeDia = "Sexta"; break;
            case 7: nomeDia = "Sábado"; break;
            default: nomeDia = "Inválido"; break;
        }

        System.out.println(nomeDia);
    }
}
