# Java Orientado a Objeto: Tratamento de exceção - introducao
Relembrando tratamento de exceção no Java

## Modo de excursão do Java - Pilha
<p>Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo executados.</p>
<p>Além do bloco de código a pilha guarda as variáveis e as referências desse bloco.</p>
<p>Assim a JVM organiza a execução e sabe exatamente qual método que está sendo executado que é sempre o método no topo da pilha.</p>
<p>A JVM também sabe quais outros precisam ser executados ainda, que são justamente os métodos abaixo.</p>

## Exceção em Java
* Toda exceção em Java possui um nome que identifica. Exceções não tratadas caem na pilha de execução procurando por alguém que saiba lidar com ela.
* <b>try / catch</b> : Para tratarmos uma execeção, que pode ocorrer enquanto nosso programa esta sendo executado, precimos tratá-la antecipadamente com um bloco de código específico. A lógica de tratamento de erro no bloco catch só é disparada quando uma exececução é lancada dentro de um bloco <b>try</b>.
```
try {
 // tratamento de exceção. Se ocorrer execeção o catch irá executar.
} catch (Execption ex) {
 ex.printStackTrace();
}
```
* Lancamento de exceções:
** Para lançar uma exceção, além de instanciá-la, é necessário lançá-la através do throw. Além de ser lança por uma variável de referencia. A execeção pode ser lançada diretamente pelo throw.
```
 Exception ex = new Exception();
 throw ex;
 ```
 ou 
 ```
 throw new Excepction();
 ```
 <p>Quando ocorre uma exceção. o código para de executar. Podemos atribuir uma mensagem à exceção através do construtor.</p>
 <p>Mais: </p>
 
 * Exceções tem um nome e. caso esse nome seja expressivo, documenta o problema que está ocorrendo.
 * Exceções podem ter uma mensagem, ou seja, o problema e o estado das variáveis podem ser descritos na mensaegem.
 * Exceções mudam o fluxo de execução, ou seja evitam que o problema siga o fluxo "normal" quando algo excepcional acontece.
 * Exceções podem ser tratadas, ou seja, podemos voltar para a execução "normal" caso o "problema" esteja resolvido.
 
 ## Classificação de Exceções 
 * Implícitas: Exceções que não precisam de tratamento de demostram serem contornáveis.
 * Explícitas: Exceções que precisam ser tratadas e que apresentam condições incontornáveis. - <b>throw</b>
 
 <p>Erros dos tipos throwables: <p>
 
 * Checked Exception: Erros que acontencem fora do controle do programa, mas que devem ser tratados pelo desenvolvidor para o programa funcionar.
 * Unchecked (Runtime): Erros que podem ser evitados se forem tratados e analisados pelo desenvolvidor.
 * Error: Usado pela JVM que serve para indicar se existe algum problema e recurso do programa, tornando a execução impossível de continuar.
 
 <p> - Exceções são separadas em duas grandes categorias: aquelas que são obrigatoriariamente verificadas pelo compilador e as que não são verificadas. As primeiras são denominadas checked e são criadas através do pertencimento a uma hierarquia que não passe por RuntimeException. As segundas são as unchecked, e são criadas como descendentes de RuntimeException.
 
 ## Hierarquias de exceções
 - Throwable
 - - Error
 - - - StackOverflowError
 - - Exception
 - - - RuntimeException
 - - - - ArithmeticException
 - - - - NullPointerException
 - - - IOException


<p> - Throwable: é uma classe que precisa se extendida para que seja possível jogar um objeto na pilha, através da palavra reservada <b>throw</b></p>
<p> - É na classe Throwable que temos praticamente todo código relacionado às exceções, inclusive ```getMessage()``` e ```printStackTrace()```. Todo o resto da hierarquia apenas possui algumas sobrecargas de construtores para comunicar mensagens específicas. </p>
<p> - A hirarquia iniciada com a classe Throwable é dividida em exceções e erros. Exceções são usadas em códigos de aplicação. Erros são usados exclusivamente pela máquina virtual.</p>
<p> - Classes que herdam de ```Error``` são usadas para comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem criar erros que herdam de ``Èrror```.
<p> - ```StackOverflowError``` é um erro da máquina virtual para informar que a pilha de execução não tem mais memória. </p>
<p>Existe uma diferença entre <b>Error</b> e <b>Exception</b>. O Error é algo que não pode mais ser tratado, ao contratário da Exception que trata seus erros, pois todas as subclasses de Exception são exceções e devem ser tratadas (thowns). Os erros da classe Error ou RuntimeException são erros e não precisam de tratamento, por essse motivo é usao o <b>try/catch</b> e/ou propagação com <b>thow/thowns</b>.<p>

* Exception - É a raiz das classes originárias da classe Throwable, onde mosra as situações em que a aplicação pode querer capturar e realizar um tratamento para conseguir realizar o processamento.
* Error - Também é raiz das classes originárias da clase Throwable, indicando as situações em que a aplicação não deve tentar tratar, como ocorrências que não deveriam acontencer.



#### Referências:
> <https://www.devmedia.com.br/trabalhando-com-excecoes-em-java/27601>
