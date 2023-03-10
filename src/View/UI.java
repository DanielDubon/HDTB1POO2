package View;

import Model.Radio;

import java.util.ArrayList;
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
                switch (opcion) {
                    case "3":
                        System.out.println("1)AM");
                        System.out.println("1)FM");
                        opcion = in.nextLine();
                        if (opcion.equals("1")) {
                            radio.setFrequence("AM");
                        } else if (opcion.equals("2")) {
                            radio.setFrequence("FM");

                        }
                        break;
                    case "4":
                        radio.Forward();
                        break;

                    case "5":
                        radio.Backward();
                        break;

                    case "6":
                        System.out.println("1)Guardar estación AM");
                        System.out.println("2)Guardar estación FM");
                        opcion = in.nextLine();
                        if (opcion.equals("1")) {
                            System.out.println("Que estación desea guardar: ");
                            radio.saveAMStation(0, 0);
                            int estacionAM = in.nextInt();
                        } else if (opcion.equals("2")) {
                            System.out.println("Que estación desea guardar: ");
                            radio.saveFMStation(0, 0);

                        }
                        break;

                    case "7":
                        System.out.println("Qué frecuencía desea: ");
                        System.out.println("1) AM");
                        System.out.println("2) FM");
                        opcion = in.nextLine();
                        if (opcion.equals(("1"))){
                            System.out.println("Qué estación quiere escuchar: ");
                            System.out.println("1.");
                            System.out.println("2.");
                            System.out.println("3.");
                            System.out.println("4.");
                            System.out.println("5.");
                            System.out.println("6.");
                            opcion = in.nextLine();
                            System.out.println("Estas esuchando la estación: "+ radio.getRadioAMFAVS().get(Integer.parseInt(opcion)));
                        } else if (opcion.equals("2")){
                            System.out.println("Qué estación quiere escuchar: ");
                            System.out.println("1.");
                            System.out.println("2.");
                            System.out.println("3.");
                            System.out.println("4.");
                            System.out.println("5.");
                            System.out.println("6.");
                            opcion = in.nextLine();
                            System.out.println("Estas esuchando la estación: "+ radio.getRadioFMFAVS().get(Integer.parseInt(opcion)));
                        }
                        break;

                }

            }


        }

    }

}
