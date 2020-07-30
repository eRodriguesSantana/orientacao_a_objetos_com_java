Crie uma interface chamada FormatadorNome que possui o método String formatarNome(String nome, String sobrenome).

<br/>

Crie uma classe chamada Autoridade que possui atributos como nome, sobrenome e uma instância de FormatadorNome. Essa classe deve possuir um método getTratamento() que delega a formatação do nome para a instância de FormatadorNome.

<br/>

Crie a seguintes implementações da interface FormatadorNome:

<br/>

<ul>
<li>Informal: retorna somente o primeiro nome</li>
<li>Respeitoso: deve receber em seu construtor a informação se é masculino ou feminino, e retornar "Sr." ou "Sra." seguido do sobrenome</li>
<li>ComTítulo: deve receber em seu construtor o título e retornar o título seguido de nome e sobrenome. Exemplo: "Magnífico Pedro Cabral"</li>
</ul>

<br/>

Crie testes de unidade que fazem os testes da classe Autoridade com cada uma das implementações da interface.
