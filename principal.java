import java.util.ArrayList;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        int n = 0;
        String RespStr;
        ArrayList<contatos> cont = new ArrayList<contatos>();

        while (true) {
            System.out.println("Escolha uma operação: \n 1-inserir \n 2-visualizar \n 3-excluir \n 4-atualizar \n 5-sair");
            resp = sc.nextInt();
            sc.nextLine(); // Consome a quebra de linha pendente

            if (resp == 1) {
                contatos c = new contatos();
                c.LerParametros();
                cont.add(c);
            } // fimse
            if (resp == 2) {
                System.out.println("Deseja visualizar a lista de contatos ou um em especifico? \n 1-Lista \n 2-Especifico");
                resp = sc.nextInt();
                sc.nextLine(); // Consome a quebra de linha pendente

                if (resp == 1) {
                    for (int i = 0; i < cont.size(); i++) {
                        cont.get(i).MostraParametros();
                    } // fim do for
                } // fimse
                if (resp == 2) {
                    System.out.println("Digite o numero de telefone do contato: ");
                    RespStr = sc.next();
                    sc.nextLine(); // Consome a quebra de linha pendente

                    for (int i = 0; i < cont.size(); i++) {
                        if (cont.get(i).telefone.matches(RespStr)) {
                            cont.get(i).MostraParametros();
                        } // fimse
                    } // fim do for
                } // Fimse
            } // fimse
            if (resp == 3) {
                System.out.println("Digite o numero de telefone do contato: ");
                RespStr = sc.next();
                sc.nextLine(); // Consome a quebra de linha pendente

                for (int i = 0; i < cont.size(); i++) {
                    if (cont.get(i).telefone.matches(RespStr)) {
                        cont.remove(i);
                    } // fimse
                } // fim do for
            } // fimse
            if (resp == 4) {
                System.out.println("Digite o numero de telefone do contato: ");
                RespStr = sc.next();
                sc.nextLine(); // Consome a quebra de linha pendente

                for (int i = 0; i < cont.size(); i++) {
                    if (cont.get(i).telefone.matches(RespStr)) {
                        cont.get(i).MostraParametros();
                        n = i;
                    } // fimse

                } // fim do for
                System.out.println("Digite o parametro que quer atualizar: \n -nome \n -email \n -endereço ");
                RespStr = sc.next();
                sc.nextLine(); // Consome a quebra de linha pendente

                if (RespStr.matches("nome")) {
                    System.out.println("Digite o novo nome:");
                    cont.get(n).nome = sc.nextLine();
                }
                if (RespStr.matches("email")) {
                    System.out.println("Digite o novo email:");
                    cont.get(n).email = sc.nextLine();
                }
                if (RespStr.matches("endereço")) {
                    System.out.println("Digite o novo endereço:");
                    cont.get(n).endereco = sc.nextLine();
                }

            } // fimse
            if (resp == 5) {
                break;
            } // fimse
        } // fim do while
    } // fim do main
} // fim da classe