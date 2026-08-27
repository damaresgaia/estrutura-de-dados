# Análise 

### Busca Linear
* **Melhor caso**: Quando o valor procurado está no início do vetor. Levou apenas **1 comparação** para qualquer tamanho de vetor.
* **Caso médio**: Quando o valor está no meio. O número de comparações foi exatamente metade do tamanho do vetor (**500** para 1.000 elementos, **5.000** para 10.000 e **50.000** para 100.000).
* **Pior caso**: Quando o valor está no fim do vetor. O algoritmo teve que checar o vetor inteiro, fazendo **1.000**, **10.000** e **100.000 comparações**. No vetor de 100.000 elementos, o tempo chegou a 1 ms.

### Busca Binária
* **Melhor caso**: Quando o valor procurado é o elemento central do vetor. Fez apenas **1 comparação** em todos os vetores.
* **Caso médio e Pior caso**: Quando o valor está no início ou no fim. O número de comparações cresce de forma logarítmica:
  * Vetor de 1.000: máximo de 10 comparações.
  * Vetor de 10.000: máximo de 14 comparações.
  * Vetor de 100.000: máximo de 17 comparações.

---

## 2. Implementação Própria vs Arrays.binarySearch

Não houve diferença significativa de tempo no terminal, ambas registraram 0 ms na maioria dos testes.

---

## 3. Pergunta do Dicionário (240.000 palavras)

* **Busca Sequencial no pior caso**: Precisaria de até **240.000 comparações** (olhando palavra por palavra até o fim).
* **Busca Binária no pior caso**: Precisaria de no máximo **18 comparações** (como dividimos a lista pela metade a cada passo, 2^18 = 262.144, que já cobre as 240.000 palavras).

### Generalização para qualquer entrada n:
* **Busca Sequencial**: Pior caso precisa de **n** comparações (Complexidade O(n)).
* **Busca Binária**: Pior caso precisa de **log2(n)** comparações (Complexidade O(log n)).
