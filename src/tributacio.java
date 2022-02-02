import java.util.Scanner;

public class tributacio {

        /*Per tributar un determinat impost cal ser més gran de 16 anys i tenir uns ingressos
        iguals o superiors a 1000 € mensuals. Pregunta a l’usuari la seva edat i els seus
        ingressos mensuals i mostra per pantalla si ha de tributar o no.
        7.*/

    public static void main(String[] args) {

        int age = askAge();
        int salary = askSalary();
        tributeYesOrNot(age,salary);


    }

    private static void tributeYesOrNot(int age, int salary) {
        if(age > 16 && salary >= 1000){

            System.out.println(" Has de tributar");

        }else System.out.println("No has de tributar");

    }

    private static int askSalary() {

        System.out.println("Introdueix el teu salari mensual: ");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }

    private static int askAge() {

        System.out.println("Introdueix la teva edat: ");
        Scanner sc = new Scanner(System.in);

        return sc.nextInt();
    }
}
