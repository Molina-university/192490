import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1 = 0f, nota2 = 0f, nota3 = 0f;
        int Estudiantes = 0;
        int estudiantesAprobados = 0;
        float promedio = 0f;

        while (Estudiantes < 4){
            
            System.out.println("ingrese sus notas");
            System.out.println("primera nota");
            nota1 = scanner.nextFloat();
            System.out.println("segunda nota");
            nota2 = scanner.nextFloat();
            System.out.println("tercera nota");
            nota3 = scanner.nextFloat();

            promedio = (nota1 + nota2 + nota3) / 3;

            if (promedio >= 2.96) {
                System.out.println(" Haz aprobado: ( " + promedio + " )");
            } else {
                System.out.println(" Haz reprobado: ( " + promedio + " )");
            }
        Estudiantes += 1;
        estudiantesAprobados += 1;  
        }

        System.out.println("Total de estudiantes evaluados: " + Estudiantes);
        System.out.println("Total de estudiantes aprobados: " + estudiantesAprobados);

    scanner.close();

    }
}
