# exercicio-lista-encadeada
Exercício da matéria Algoritmos e Estrutura de Dados do Mestrado Profissional em Engenharia da Computação e Sistemas - UEMA

Objetivo:
Implementar uma lista encadeada de valores inteiros em Java que permita adicionar valores, inserir um valor após um nodo específico e imprimir a lista.

Atividade 1: Implementar a Classe Nodo: Descrição: Criar uma classe chamada Nodo que representará um nodo da lista encadeada. Tarefa:
•	Declarar um campo int dado para armazenar o valor do nodo.
•	Declarar um campo Nodo proximo para referenciar o próximo nodo na lista.
•	Implementar um construtor que inicializa o campo dado e define proximo como null.

Atividade 2: Implementar a Classe ListaEncadeada
•	Descrição: Criar uma classe chamada ListaEncadeada que implementará a lista encadeada. Tarefa:
•	Declarar um campo Nodo cabeca para apontar para o primeiro nodo da lista.
•	Implementar os seguintes métodos:
•	adicionar(int dado): Adiciona um novo nodo ao final da lista.
•	inserirApos(int n1, int n2): Insere um novo nodo com valor n2 após o nodo que contém o valor n1.
•	imprimirLista(): Percorre e imprime todos os nodos da lista.

Atividade 3: Implementar o Método adicionar:Descrição: Implementar o método adicionar na classe ListaEncadeada.Tarefa:
•	Verificar se a lista está vazia (i.e., cabeca é null). Se estiver, criar um novo nodo e definir cabeca como este novo nodo.
•	Caso contrário, percorrer a lista até encontrar o último nodo e adicionar o novo nodo ao final.

Atividade 4: Implementar o Método inserirApos
•	Descrição: Implementar o método inserirApos na classe ListaEncadeada.
•	Tarefa:
•	Percorrer a lista para encontrar o nodo que contém o valor n1.
•	Se encontrar, criar um novo nodo com valor n2 e ajustá-lo para que seja inserido após o nodo com valor n1.
•	Se não encontrar, exibir uma mensagem informando que o valor n1 não foi encontrado.

Atividade 5: Implementar o Método imprimirLista: Descrição: Implementar o método imprimirLista na classe ListaEncadeada. Tarefa:
•	Percorrer a lista desde a cabeca, imprimindo o valor de cada nodo até o final da lista.

Atividade 6: Testar a Implementação
Descrição: Escrever um método main para testar a implementação das classes Nodo e ListaEncadeada.
Tarefa:
•	Criar uma instância da classe ListaEncadeada.
•	Adicionar alguns valores à lista.
•	Inserir um novo valor após um valor específico.
•	Imprimir a lista antes e depois da inserção.
•	Testar a inserção após um valor que não existe na lista.
