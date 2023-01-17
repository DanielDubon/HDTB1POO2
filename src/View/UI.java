package View;

import Model.Radio;

import java.util.Scanner;

public class UI {
    public static boolean menu = true;
    public static void main(String[] args) throws Exception {
        menu();

    }

    public static void menu() throws Exception {
        Radio radio = new Radio("",0,true);
        Scanner in = new Scanner(System.in);
        while (menu){
            System.out.println("---RADIO---");
            System.out.print("Estado del radio: ");
            if (radio.isOn()){
                System.out.println("Encendido");
            }else{
                System.out.println("Apagado");
            }
            System.out.println("Frecuencia actual: "+radio.getFrequence());
            System.out.print("Estacion actual: ");
            if (radio.getFrequence().equals("FM")){
                System.out.println(radio.getFMActualStation());
            }else{
                System.out.println(radio.getAMActualStation());
            }
            System.out.println("1)Encender");
            System.out.println("2)Apagar");
            if (radio.isOn()){
                System.out.println("3)Cambiar frecuencia");
                System.out.println("4)Avanzar");
                System.out.println("5)Retroceder");
                System.out.println("6)Guardar favoritos");
                System.out.println("7)Elegir favoritos");
            }
            System.out.println("¿Que desea realizar?");

            String opcion = in.nextLine();

            switch (opcion){
                case "1": radio.on(); break;
                case "2": radio.off(); break;
            }
            if (radio.isOn()) {
                switch (opcion){
                    case "3":
                        System.out.println("1)AM");
                        System.out.println("1)FM");
                        opcion = in.nextLine();
                        if (opcion.equals("1")){
                            radio.setFrequence("AM");
                        }else if(opcion.equals("2")){
                            radio.setFrequence("FM");

                        }
                        break;
                    case "4":
                        radio.Forward();
                        break;

                    case "5":
                        radio.Backward();
                        break;


                    // falta case 6 y case 7

                }

            }


        }

    }

}
