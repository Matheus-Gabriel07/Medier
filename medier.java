import java.util.*;

public class medier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean contin = true;

        int opc = 0; 
        int granIn = 0;
        int granFi = 0;
        double valueConver = 0;
        double resp = 0;

        int num = 0;

        do {
            System.out.println("Medier\n\b"
                    + "=======================\n"
                    + "INSTRUÇÕES\b\n"
                    + "Dgite [1] caso queira fazer uma conversão na mesma unidade\n"
                    + "Dgite [2] caso queira fazer uma conversão na mesma unidade\n");
            opc = sc.nextInt();

            if (opc == 1) { // Mesma unidade
                System.out.println("\n==================\n"
                            +"Digite o número corespondente da grandeza\n"
                            +"[1] Volume\n"
                            +"[2] Massa\n"
                            +"[3] Comprimento\n"
                            +"[4] Área\n");
                opc = sc.nextInt();

                switch (opc) {
                    case 1:
                        System.out.println("\n==================\n"
                            +"Digite o valor incial da grandeza\n"
                            +"[1] mm³\n"
                            +"[2] cm³\n"
                            +"[3] dm³\n"
                            +"[4] m³\n"
                            +"[5] dam³\n"
                            +"[6] hm³\n"
                            +"[7] km³\n");
                        granIn = sc.nextInt();

                        System.out.println("\n==================\n"
                            +"Digite o valor incial da grandeza\n"
                            +"[1] mm³\n"
                            +"[2] cm³\n"
                            +"[3] dm³\n"
                            +"[4] m³\n"
                            +"[5] dam³\n"
                            +"[6] hm³\n"
                            +"[7] km³\n");
                        granFi = sc.nextInt();

                        System.out.println("\n==================\n"
                            +"Digite o número a ser convertido");
                        num = sc.nextInt();
                        break;

                    case 3:
                        System.out.println("\n==================\n"
                            +"Digite o valor incial da grandeza\n"
                            +"[1] mm\n"
                            +"[2] cm\n"
                            +"[3] dm\n"
                            +"[4] m\n"
                            +"[5] dam\n"
                            +"[6] hm\n"
                            +"[7] km\n");
                        granIn = sc.nextInt();

                        System.out.println("\n==================\n"
                            +"Digite o valor incial da grandeza\n"
                            +"[1] mm\n"
                            +"[2] cm\n"
                            +"[3] dm\n"
                            +"[4] m\n"
                            +"[5] dam\n"
                            +"[6] hm\n"
                            +"[7] km\n");
                        granFi = sc.nextInt();

                        System.out.println("\n==================\n"
                            +"Digite o número a ser convertido");
                        num = sc.nextInt();
                        break;
                }
            }

            if (opc == 2) { // Unidade diferentes

            } else {
                System.out.println("=======================\n"
                        + "OPÇÃO INVÁLIDA\n"
                        + "=======================\n");
            }

        } while (contin);
        sc.close();

    }
}