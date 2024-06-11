//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        lista.adicionar(1);
        lista.adicionar(2);
        lista.adicionar(3);
        System.out.print("Lista original: ");
        lista.imprimirLista();

        lista.inserirApos(2, 4);
        System.out.print("Lista após inserir 4 após 2: ");
        lista.imprimirLista();

        lista.inserirApos(5, 6);

        System.out.print("Lista final: ");
        lista.imprimirLista();

        System.out.print("Lista final em ordem crescente: ");
        lista.imprimirListaOrdenada();
    }
}
