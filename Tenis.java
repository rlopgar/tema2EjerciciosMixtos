import java.util.Scanner;

public class Tenis {
    public static void main(String[] args) {

        char jugador;
        int marcadorJugadorA = 0;
        int marcadorJugadorB = 0;
        int salida= 0 ;
        int ventajaA= 0 ;
        int ventajaB = 0 ;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.print("¿Quien anota? A o B\n> ");
            jugador = scan.next().charAt(0);

            if(jugador == 'A'){
                marcadorJugadorA += 15;

                if(marcadorJugadorA > 30){

                    marcadorJugadorA += 10 - 15;
                }

                    if(marcadorJugadorA > 40){

                        marcadorJugadorA = 40;

                        if (jugador=='A' && marcadorJugadorA == 40 && marcadorJugadorB == 40 || ventajaA > 2){

                            ventajaA++;
                            ventajaB--;

                            if (ventajaA == 1) {
                                System.out.println("A tiene la ventaja");
                            }

                        }

                        if(jugador == 'A' && marcadorJugadorA == 40 && marcadorJugadorB < 40 || ventajaA == 2 ){

                            System.out.println("Gana el juego A");
                            salida++;
                            break;

                        }

                    }

            }
            if(jugador == 'B'){

                marcadorJugadorB += 15;

                if(marcadorJugadorB > 30){

                    marcadorJugadorB += 10 - 15;
                }
                    if(marcadorJugadorB > 40){

                        marcadorJugadorB = 40;

                        if (jugador=='B' && marcadorJugadorA == 40 && marcadorJugadorB == 40 || ventajaB > 2){

                            ventajaB++;
                            ventajaA--;

                            if (ventajaB == 1) {

                                System.out.println("B tiene la ventaja");

                            }

                        }

                        if(jugador == 'B' && marcadorJugadorB == 40 && marcadorJugadorA < 40 || ventajaB == 2 ){

                            System.out.println("Gana el juego B");
                            salida++;
                            break;

                        }
                    }
            }

            System.out.println("Juego: "+marcadorJugadorA+"-"+marcadorJugadorB);

        }while(salida==0);
    }
}
