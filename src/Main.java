import model.Endereco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        ConsultarEndereco consultarEndereco = new ConsultarEndereco();

        System.out.println("Digite o cep para consulta: ");
        var cep = scanner.nextLine();

        Endereco novoEndereco = consultarEndereco.buscarCep(cep);
        System.out.println(novoEndereco);

}

}