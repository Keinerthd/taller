import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int usuarios[] = new int[5];
        int op, N = 5;
        int ID;

        for (int i=1; i<=N; i++){

        System.out.println("ingrese su ID: ");
        ID = leer.nextInt();
        ID = usuarios[i];

        System.out.println("Bienvenido");
        System.out.println("Seleccione la opcion que desea usar:");
        System.out.println("1. Crear nueva venta");
        System.out.println("2. Listar ventas");
        System.out.println("3. Buscar por ID");
        System.out.println("4. Modificar");
        System.out.println("5. Eliminar");
        System.out.println("6. Calcular totales (ingreso total)");
        System.out.println("7. Salir");
        op = leer.nextInt();

        switch (op) {
            case 1:
            int compra[] = new int[7];
            int papas = 1000, tomate = 1000, cebolla = 600, pollo = 2000, ajo = 500, arroz = 2000, leche = 2500;
            int op2, cantidadPapas, cantidadTomate, cantidadCebolla, cantidadPollo, cantidadAjo, cantidadArroz, cantidadLeche, k = 1;
            int totalparcial = 0, total = 0;
            boolean termino = false;
            System.out.println("Crear una nueva venta");
            System.out.println("Seleccione los productos que desea comprar:");
            while (termino == false) {
                System.out.println("1. papas");
                System.out.println("2. tomate");
                System.out.println("3. cebolla");
                System.out.println("4. pollo");
                System.out.println("5. ajo");
                System.out.println("6. arroz");
                System.out.println("7. leche");
                op2 = leer.nextInt();

                switch(op2){
                    case 1: System.out.println("ingrese la cantidad de papas que desea comprar");
                    cantidadPapas = leer.nextInt();
                    totalparcial = cantidadPapas*papas;
                    break;

                    case 2: System.out.println("ingrese la cantidad de tomate que desea comprar");
                    cantidadTomate = leer.nextInt();
                    totalparcial = cantidadTomate*tomate;
                    break;

                    case 3: System.out.println("ingrese la cantidad de cebolla que desea comprar");
                    cantidadCebolla = leer.nextInt();
                    totalparcial = cantidadCebolla*cebolla;
                    break;

                    case 4: System.out.println("ingrese la cantidad de pollo que desea comprar");
                    cantidadPollo = leer.nextInt();
                    totalparcial = cantidadPollo*pollo;
                    break;

                    case 5: System.out.println("ingrese la cantidad de ajo que desea comprar");
                    cantidadAjo = leer.nextInt();
                    totalparcial = cantidadAjo*ajo;
                    break;

                    case 6: System.out.println("ingrese la cantidad de arroz que desea comprar");
                    cantidadArroz = leer.nextInt();
                    totalparcial = cantidadArroz*arroz;
                    break;

                    case 7: System.out.println("ingrese la cantidad de leche que desea comprar");
                    cantidadLeche = leer.nextInt();
                    totalparcial = cantidadLeche*leche;
                    break;

                    default: System.out.println("Opcion invalida. porfavor vuelva a intentarlo.");
                }

                String quedijo, si, SI, Si, sI, no, No, NO, nO;
                System.out.println("¿Termino su compra? (SI/NO)");
                quedijo = leer.nextLine();
                if(quedijo == "si" || quedijo == "Si" || quedijo == "sI"){
                termino = true;
                } else {
                    if (quedijo =="no" || quedijo =="No" || quedijo =="nO");{
                        termino = false;
                        total = total+totalparcial;
                    }
                }
                
            }




            break;

            case 2:
            break;

            case 3:
            break;

            case 4:
            break;

            case 5:
            break;

            case 6:
            break;

            case 7:
            break;

            default: System.out.println("Opcion invalida. porfavor vuelva a intentarlo.");

        }

    

    }
    }
}
