# 📦 Projeto Consulta CEP

Este projeto em Java permite consultar um endereço a partir de um CEP utilizando a API ViaCEP.
Ele trata exceções de forma elegante, gera um arquivo JSON com os dados recebidos, e organiza as classes seguindo boas práticas de programação.

### 🚀 Tecnologias utilizadas
Java 21

API ViaCEP

Biblioteca Gson (gerenciamento de JSON) — adicionada via Maven

Java HttpClient (para requisições HTTP)

### 🛠️ Funcionalidades
Consulta de endereço a partir do CEP digitado pelo usuário

Tratamento de exceções para problemas de conexão e CEP inválido

Geração automática de um arquivo .json com os dados do endereço

Organização do código em camadas:

Model (Endereco) — usando record

Service (ConsultarEndereco) — busca o CEP via API

GeradorDeArquivo — cria o arquivo JSON

Main — ponto de entrada da aplicação

## 📥 Instalação

Clone este repositório:
git clone https://github.com/seu-usuario/seu-repositorio.git
Abra o projeto em sua IDE (ex: IntelliJ IDEA, Eclipse).

Baixe o .jar do Gson usando o Maven ou adicione o .jar manualmente.

Certifique-se de estar usando Java 21 ou compatível.
## ▶️ Como executar
No terminal, será solicitado que você digite um CEP:

## Após informar o CEP, o programa:

Consultará a API do ViaCEP.

Mostrará o endereço completo no terminal.

Gerará um arquivo .json com o conteúdo do endereço.

## ⚡ Melhorias futuras
Validação de CEP no formato correto (somente números ou com hífen)

Consultar múltiplos CEPs em sequência

Interface gráfica (Swing/JavaFX)