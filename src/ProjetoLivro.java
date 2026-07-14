public class ProjetoLivro {

    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Pedro", 22, "Masculino");
        p[1] = new Pessoa("Maria", 25, "Feminino");

        l[0] = new Livro("Aprendendo Java", "Gustavo Guanabara", 300, p[0]);
        l[1] = new Livro("Aprendendo POO", "Gustavo Guanabara", 500, p[1]);

        l[0].abrir();
        l[0].folhear(400);
        System.out.println(l[0].detalhes());

        // agora quando você tentar ultrapassar o limite de paginas, apareça uma mensagem falando que a pagina é invalida
    }
}