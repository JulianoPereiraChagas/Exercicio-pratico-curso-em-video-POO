public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        if (pagAtual >= 0 && pagAtual <= this.totPaginas) {
            this.pagAtual = pagAtual;
        } else {
            System.out.println("Página inválida.");
        }
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

    @Override
    public void abrir() {
        this.aberto = true;
        System.out.println("Livro aberto.");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("Livro fechado.");
    }

    @Override
    public void folhear(int p) {
        if (!this.aberto) {
            System.out.println("Abra o livro antes de folhear.");
            return;
        }

        if (p < 0 || p > this.totPaginas) {
            System.out.println("Página inválida! O livro possui " + this.totPaginas + " páginas.");
        } else {
            this.pagAtual = p;
            System.out.println("Você foi para a página " + this.pagAtual + ".");
        }
    }

    @Override
    public void avancarPag() {
        if (!this.aberto) {
            System.out.println("O livro está fechado.");
            return;
        }

        if (this.pagAtual < this.totPaginas) {
            this.pagAtual++;
            System.out.println("Página atual: " + this.pagAtual);
        } else {
            System.out.println("Você já está na última página.");
        }
    }

    @Override
    public void voltarPag() {
        if (!this.aberto) {
            System.out.println("O livro está fechado.");
            return;
        }

        if (this.pagAtual > 0) {
            this.pagAtual--;
            System.out.println("Página atual: " + this.pagAtual);
        } else {
            System.out.println("Você já está na primeira página.");
        }
    }

    @Override
    public String detalhes() {
        return "Título: " + this.titulo +
                "\nAutor: " + this.autor +
                "\nTotal de páginas: " + this.totPaginas +
                "\nPágina atual: " + this.pagAtual +
                "\nAberto: " + this.aberto +
                "\nLeitor: " + this.leitor.getNome() +
                "\nIdade: " + this.leitor.getIdade() +
                "\nSexo: " + this.leitor.getSexo();
    }

    @Override
    public String toString() {
        return "Livro{" +
                "\n titulo='" + titulo + '\'' +
                ",\n autor='" + autor + '\'' +
                ",\n total de páginas=" + totPaginas +
                ",\n página atual=" + pagAtual +
                ",\n aberto=" + aberto +
                ",\n leitor=" + leitor +
                "\n}";
    }
}