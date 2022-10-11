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
