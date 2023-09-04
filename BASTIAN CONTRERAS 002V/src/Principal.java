
import java.util.Scanner;

/**
 *
 * @author bastian
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Cliente juan = new Cliente("Juan", "Martinez", 27, 11111111-1, 569999999, false);
    Cliente bastian = new Cliente("Bastian", "Contreras", 22, 22222222-2, 569876543, true);
    Plan plan1 = new Plan(1, "Bolsa de minutos barata", "30 días", 15000, 500, juan);
    Plan plan2 = new Plan(2, "Bolsa de minutos cara", "30 días", 30000, 1000, bastian);
    System.out.println("Bienvenido, Que desea hacer?\n1. Comprar plan\n2. Aplicar descuento\n3. Agregar minutos");
        Scanner teclado = new Scanner("");
        
        int opc = teclado.nextInt();
        if (opc == 1) {
            System.out.println("Que plan desea comprar?");
            System.out.println("1. Bolsa de minutos barata\n2. Bolsa de minutos cara");
            int bolsa = teclado.nextInt();
            if (bolsa == 1) {
                System.out.println("La información del plan es: "+plan1.toString());
                System.out.println("Ingrese su número: ");
                Scanner number = new Scanner("");
                plan1.setNumero(number.nextInt()); 
            } else if (bolsa == 2) {
                System.out.println("La información del plan es: "+plan2.toString());
                System.out.println("Ingrese su número: ");
                Scanner number = new Scanner("");
                plan2.setNumero(number.nextInt()); 
            }
        }
        if (opc == 2) {
            System.out.println("Elija su nombre");
            System.out.println("1. Juan 2. Bastian");
            int name = teclado.nextInt();
            if (name == 1){
                System.out.println("El descuento solo aplica para gente nueva");}
                else if(name == 2){
                        System.out.println("Ingrese su plan");
                        System.out.println("1. Plan barato\n. 2. Plan caro");
                        int opcplan = teclado.nextInt();
                        if (opcplan == 1){
                            System.out.println("El precio del plan debe ser mayor a $20000");
                        }else if (opcplan == 2){
                            System.out.println("Ingrese el descuento que desea aplicar");
                            int desc = teclado.nextInt();
                            plan2.setPrecio(30000*(desc/100));
                            System.out.println("El precio actual es de $"+plan2.getPrecio());
                        }
                        }
            }
        if (opc == 3) {
            System.out.println("Ingrese su plan");
            System.out.println("1. Plan barato\n. 2. Plan caro");
            int opcplan = teclado.nextInt();
            if (opcplan == 1) {
                System.out.println("Cuantos minutos desea agregar?");
                int minutosAgregados = teclado.nextInt();
                plan1.setMinutos((plan1.getMinutos())+minutosAgregados);}
                System.out.println("Los minutos actuales son: "+plan1.getMinutos());
            if (opcplan == 2) {
                System.out.println("Cuantos minutos desea agregar?");
                int minutosAgregados = teclado.nextInt();
                plan2.setMinutos((plan2.getMinutos())+minutosAgregados);
                System.out.println("Los minutos actuales son: "+plan2.getMinutos());
            }
        }
        }
    }
    

