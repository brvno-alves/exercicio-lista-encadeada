public class Nodo {

    int dado;
    Nodo proximo;

    public Nodo(int dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public Nodo getProximo() {
        return proximo;
    }
    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
