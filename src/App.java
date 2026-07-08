import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        Traductor miTraductor = new Traductor(50);
        
        // Datos de prueba iniciales
        miTraductor.agregarPalabra(new Traduccion("hola", "hello"));
        miTraductor.agregarPalabra(new Traduccion("mundo", "world"));
        miTraductor.agregarPalabra(new Traduccion("gracias", "thank you"));

        int opcion;

        do {
            System.out.println("\n--- SISTEMA TRADUCTOR ---");
            System.out.println("1. Agregar nueva palabra");
            System.out.println("2. Buscar significado");
            System.out.println("3. Ver total de palabras registradas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            while (!scanner.hasNextInt()) {
                System.out.print("Por favor, introduce un número válido: ");
                scanner.next();
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la palabra en español: ");
                    String esp = scanner.nextLine().trim();
                    System.out.print("Introduce la traducción en inglés: ");
                    String eng = scanner.nextLine().trim();
                    
                    if (esp.isEmpty() || eng.isEmpty()) {
                        System.out.println("❌ Los campos no pueden estar vacíos.");
                    } else {
                        Traduccion nuevaTraduccion = new Traduccion(esp, eng);
                        if (miTraductor.agregarPalabra(nuevaTraduccion)) {
                            System.out.println("✅ Palabra agregada con éxito.");
                        } else {
                            System.out.println("❌ Error: El diccionario está lleno.");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Introduce la palabra a buscar: ");
                    String buscar = scanner.nextLine().trim();
                    String resultado = miTraductor.verSignificado(buscar);
                    System.out.println("🔍 Significado: " + resultado);
                    break;

                case 3:
                    System.out.println("📊 Total de palabras: " + miTraductor.verTotalPalabras());
                    break;

                case 4:
                    System.out.println("👋 Saliendo de la aplicación. ¡chao pa!");
                    break;

                default:
                    System.out.println("⚠️ Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}
