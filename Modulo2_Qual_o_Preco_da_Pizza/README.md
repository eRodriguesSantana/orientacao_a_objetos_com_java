Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado. Essa classe também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.

<br/>

É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma variável estática na classe Pizza para guardar esse tipo de informação (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o método estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.

<br/>

Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

<br/>

Crie uma classe Principal com o método main() que faz o seguinte:

<br/>

<ul>
<li>Cria 3 pizzas com ingredientes diferentes</li>
<li>Adiciona essas Pizzas em um CarrinhoDeCompra</li>
<li>Imprime o total do CarrinhoDeCompra</li>
<li>Imprime a quantidade utilizada de cada ingrediente</li>
</ul>

<br/>

Implemente no Eclipse uma classe chamada Principal em que se criam 3 instâncias da classe Paciente com valores diferentes e se imprime no console o resultado dos dois métodos criados.
