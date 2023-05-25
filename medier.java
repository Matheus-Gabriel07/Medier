import java.util.*;

public class medier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean contin = true;

        int resp;

        do {
            System.out.println("Medier\n\b"
                    + "=======================\n"
                    + "INSTRUÇÕES\b\n"
                    + "Dgite [1] caso queira fazer uma conversão na mesma unidade\n"
                    + "Dgite [2] caso queira fazer uma conversão na mesma unidade\n\n");
            resp = sc.nextInt();

            if (resp == 1) { // Mesma unidade

            }

            if (resp == 2) { // Unidade diferentes

            } else {
                System.out.println("=======================\n"
                        + "OPÇÃO INVÁLIDA\n"
                        + "=======================\n");
            }

        } while (contin);
        sc.close();

    }
}