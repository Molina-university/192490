import java.util.Scanner;

public class MuyMalHecho {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int contadorUsuarios = 0;

        System.out.println("Número de usuarios a ingresar:");
        int numUsuarios = scanner.nextInt();
        scanner.nextLine();

        int edadUsuario1 = 0, edadUsuario2 = 0, edadUsuario3 = 0;
        String usuario1 = "", usuario2 = "", usuario3 = "";

        while (contadorUsuarios < numUsuarios) {
            System.out.println("Nombre del usuario:");
            String nombreUsuario = scanner.nextLine();

            System.out.println("Edad del usuario:");
            int edadUsuario = scanner.nextInt();
            scanner.nextLine();

                if (contadorUsuarios == 0) {
                    usuario1 = nombreUsuario;
                    edadUsuario1 = edadUsuario;
                } else if (contadorUsuarios == 1) {
                    usuario2 = nombreUsuario;
                    edadUsuario2 = edadUsuario;
                } else if (contadorUsuarios == 2) {
                    usuario3 = nombreUsuario;
                    edadUsuario3 = edadUsuario;
                }

                if (edadUsuario >= 18) {
                    System.out.println(nombreUsuario + " es mayor de edad.");
                } else {
                    System.out.println(nombreUsuario + " es menor de edad.");
                }

                if (edadUsuario > 120 || edadUsuario < 1) {
                    System.out.println("Edad no válida.");
                }

            contadorUsuarios = contadorUsuarios + 1;
        }

        System.out.println("Resultados:");
        System.out.println("Usuario 1: " + usuario1 + " - Edad: " + edadUsuario1);
        System.out.println("Usuario 2: " + usuario2 + " - Edad: " + edadUsuario2);
        System.out.println("Usuario 3: " + usuario3 + " - Edad: " + edadUsuario3);

        scanner.close();
    }
}
