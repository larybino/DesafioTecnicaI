
## Técnica

1) Observe o trecho de código abaixo: int INDICE = 13, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA); Ao final do processamento, qual será o valor da variável SOMA? <br>-> [SomaIndice](./src/SomaIndice.java)<br>

2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.<br> -> [FibonacciCheck](./src/FibonacciCheck.java) <br>


3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:<br>
• O menor valor de faturamento ocorrido em um dia do mês;<br>
• O maior valor de faturamento ocorrido em um dia do mês;<br>
• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.<br>

IMPORTANTE:<br>
a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;<br>
b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;<br>
-> [FaturamentoDistribuidora](./src/FaturamentoDistribuidora.java)<br>



4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:<br>
• SP – R$67.836,43<br>
• RJ – R$36.678,66<br>
• MG – R$29.229,88<br>
• ES – R$27.165,48<br>
• Outros – R$19.849,53<br>

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora. <br>
-> [PercentualFaturamento](./src/PercentualFaturamento.java)<br>

5) Escreva um programa que inverta os caracteres de um string.<br>

IMPORTANTE:<br>
a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;<br>
b) Evite usar funções prontas, como, por exemplo, reverse; <br> -> [StringReverser](./src/StringReverser.java)

