# StoreTech
>StoreTech é um trabalho acadêmico, do [Centro Universitário UniBH](https://www.unibh.br/) cujo objetivo é realizar o desenvolvimento de um sistema para controle de vendas de uma loja, com tela de cadastro e vendas.

💻 Requisitos:
* IDE(Integrated Development Environment): [Netbeans](https://netbeans.apache.org/download/nb125/nb125.html);
* [JDK(Java Development Kit)](https://www.oracle.com/java/technologies/downloads/);
* [Git](https://git-scm.com/downloads);
* Conta no [github](https://github.com/);
* [MySQL server](https://dev.mysql.com/downloads/file/?id=508935);
* [MySQL Workbench](https://dev.mysql.com/downloads/file/?id=507335).
  - É imprescindível que você crie um schema com o nome de storetech no Workbench.
  - Após a criação do schema, utilize o DUMP que se encontra na pasta /BD, disponível do projeto.

Com todos os requisitos preenchidos, vamos para a criação do ambiente local, onde ficarão os arquivos do projeto.

## Baixando o projeto:
1. Clique no botão **fork**, localizado no canto superior direito. Fork nada mais é do que uma cópia atual do repositório;
2. Depois de realizar o fork, uma cópia do projeto ficará disponível em seus repositorios. Copie a URL do repositório e guarde-a pois precisaremos dela mais tarde;
3. Inicie o terminal do gitbash ou um terminal de sua preferência;
* Navegue até a pasta que você deseja que os arquivos do projeto sejam armazenados.
4. Comandos:
* Crie um novo repositório git, com o seguinte comando:
```git init```
Usaremos esse repositório para receber um repositório remoto existente.
* Defina e relacione um repositório remoto, digitando o seguinte comando (substitua LINK pela url copiada no passo 2):
```git remote add origin LINK```
E para finalizar baixe o conteúdo disponível na url que você informou no passo anterior, com o comando:
```git pull origin master```
Pronto! A partir deste momento todos os arquivos estarão na pasta que você definiu anteriormente.

## Executando o projeto:
Para facilitar, disponibilizamos a ultima versão em formato .jar na raiz deste projeto, basta executar para ter acesso a todas as funcionalidades do sistema. 
Caso queira executar o projeto pela sua IDE basta localizar a classe nomeada como Principal, localizada no pacote tela, botão direito e executar arquivo/projeto.

## Executando os testes:
Dentro da sua IDE navegue até a classe CadastroClienteTest("Pacotes de Teste/tela/CadastroClienteTest"), clique com o botão direito em qualquer espaço em branco dentro da classe e selecione a opção Testar arquivo.

* Obs: A Feature está disponível na linguagem Gherkin, no caminho "Pacotes de Teste/<pacote default>/cadastro.feature".



