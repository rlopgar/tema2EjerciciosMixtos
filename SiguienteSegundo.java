import java.util.Scanner;

public class SiguienteSegundo {
    public static void main(String[] args) {

        int horas = 0;
        int minutos = 0;
        int segundos = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("> ");
        horas = scan.nextInt();

        System.out.print("> ");
        minutos= scan.nextInt();

        System.out.print("> ");
        segundos=scan.nextInt();

        segundos++;

        if(segundos >= 60){
            segundos = 0;
            minutos++;

            if(minutos >= 60){
                minutos = 0;
                horas++;

                if(horas >= 24){
                    horas = 0;
                }
            }
        }

        System.out.println(((horas > 10) ? horas : "0" + horas) + ":" + ((minutos > 10) ? minutos : "0" + minutos) + ":" + ((segundos > 10) ? segundos : "0" + segundos));
    }

}
