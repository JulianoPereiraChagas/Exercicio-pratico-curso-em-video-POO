public interface Publicacao {
    public void abrir();
    public void fechar();
    public void avancarPag(int quant);
    public void voltarPag(int quant);
    public void avancarPag(int quant, double valor);
    public void voltarPag(int quant, double valor);
    public void folhear(int quant, double valor);

    void folhear(int p);

    void avancarPag();

    void voltarPag();
}
