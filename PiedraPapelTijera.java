import java.util.Scanner;

public class PiedraPapelTijera {
    public static void main(String[] args) {
        char jugador;
        int ordenador;
        boolean salida = true;

        Scanner scan=new Scanner(System.in);

        do{

            ordenador = (int) (Math.random() * 3 + 1 );

            System.out.print("Elija una opción\nA. Piedra\nB. Papel\nC. Tijera\n> ");
            jugador = scan.next().charAt(0);

            switch (jugador){
                case 'A':
                    if(jugador=='A' && ordenador == 3){
                        System.out.println("El ordenador a jugado tijeras");
                        System.out.println("Gana el jugador");
                        salida = true;
                    }
                    break;
                case 'B':
                    if(jugador == 'B' && ordenador == 1){
                        System.out.println("El ordenador a jugado piedra");
                        System.out.println("Gana el jugador");
                        salida = true;
                    }
                    break;
                case 'C':
                    if(jugador == 'C' && ordenador == 2) {
                        System.out.println("El ordenador a jugado papel");
                        System.out.println("Gana el jugador");
                        salida = true;
                    }
                    break;

                default:
                    if(jugador != 'A' || jugador != 'B' || jugador != 'C' ) {
                        salida = false;
                    }
                    break;
            }

            switch (ordenador){
                case 1:
                    if(ordenador == 1 && jugador == 'C'){
                        System.out.println("El ordenador a jugado piedra");
                        System.out.println("Gana el ordenador");
                        salida = true;
                    }
                    break;
                case 2:
                    if(ordenador == 2 && jugador == 'A'){
                        System.out.println("El ordenador a jugado papel");
                        System.out.println("Gana el ordenador");
                        salida = true;
                    }
                    break;
                case 3:
                    if(ordenador == 3 && jugador == 'B'){
                        System.out.println("El ordenador a jugado tijera");
                        System.out.println("Gana el ordenador");
                        salida = true;
                    }
                    break;
            }

            if(jugador == 'A' && ordenador == 1 || jugador == 'B' && ordenador == 2 || jugador == 'C' && ordenador == 3 ){
                System.out.println("Empate");
                salida = false;
            }

        }while(salida==false);

    }
}
