import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaEncadeada {

    private Nodo cabeca;

    public ListaEncadeada() {
        this.cabeca = null;
    }

    public void adicionar(int dado) {
        Nodo novoNodo = new Nodo(dado);
        if (this.cabeca == null) {
            cabeca = novoNodo;
        } else {
            Nodo atual = cabeca;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNodo;
        }
    }

    public void inserirApos(int n1, int n2) {
        Nodo atual = cabeca;
        while (atual != null && atual.dado != n1) {
            atual = atual.proximo;
        }
        if (atual != null) {
            Nodo novoNodo = new Nodo(n2);
            novoNodo.proximo = atual.proximo;
            atual.proximo = novoNodo;
        } else {
            System.out.println("Valor " + n1 + " não encontrado na lista.");
        }
    }

    public void imprimirLista() {
        Nodo atual = cabeca;
        while (atual != null) {
            System.out.print(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirListaOrdenada() {
        List<Integer> elementos = new ArrayList<>();
        Nodo atual = cabeca;
        while (atual != null) {
            elementos.add(atual.dado);
            atual = atual.proximo;
        }

        Collections.sort(elementos);

        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
