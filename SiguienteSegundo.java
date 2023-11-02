import java.util.Scanner;

public class SiguienteSegundo {
    public static void main(String[] args) {

        int horas;
        int minutos;
        int segundos;
        int relleno=0;

        Scanner scan=new Scanner(System.in);

        System.out.print("> ");
        horas=scan.nextInt();
        System.out.print("> ");
        minutos=scan.nextInt();
        System.out.print("> ");
        segundos=scan.nextInt();

        segundos+=1;

        if(segundos>59){
            segundos=0;
            minutos+=1;
        }
        if(minutos>59){
            minutos=0;
            horas+=1;
        }
        if(horas==24) {
            horas = 0;
        }

        System.out.println(horas+":"+minutos+":"+segundos);
    }
}
