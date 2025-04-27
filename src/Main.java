import model.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

      try {
          ConsultarEndereco consultarEndereco = new ConsultarEndereco();


          System.out.println("Digite o cep para consulta: ");
          var cep = scanner.nextLine();
          Endereco novoEndereco = consultarEndereco.buscarCep(cep);
          System.out.println(novoEndereco);

          GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();
          geradorDeArquivo.salvarJson(novoEndereco);

      }catch (RuntimeException | IOException e) {
          System.out.println(e.getMessage());
          System.out.println("Finalizada a aplicação");
      }

}

}