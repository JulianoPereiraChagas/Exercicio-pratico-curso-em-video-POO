public class Livro implements publicacao {
    private String titulo;
    private String autor;
    private String editora;
    private int totalDePaginas;
    private int paginaAtual;
    private boolean aberto;
    public Pessoa leitor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getTotalDePaginas() {
        return totalDePaginas;
    }

    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Livro(Pessoa leitor, boolean aberto, int paginaAtual, int totalDePaginas, String editora, String autor, String titulo) {
        this.leitor = leitor;
        this.aberto = aberto;
        this.paginaAtual = paginaAtual;
        this.totalDePaginas = totalDePaginas;
        this.editora = editora;
        this.autor = autor;
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", totalDePaginas=" + totalDePaginas +
                ", paginaAtual=" + paginaAtual +
                ", aberto=" + aberto +
                ", leitor=" + leitor +
                '}';
    }

    @Override
    public void abrir() {

    }

    @Override
    public void fechar() {

    }

    @Override
    public void avancarPag(int quant) {

    }

    @Override
    public void voltarPag(int quant) {

    }

    @Override
    public void avancarPag(int quant, double valor) {

    }

    @Override
    public void voltarPag(int quant, double valor) {

    }

    @Override
    public void folhear(int quant, double valor) {

    }
}