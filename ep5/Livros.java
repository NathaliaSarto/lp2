public class Livros {
private static Livros instancia;
protected int totalLivrosClarisse;
protected int TotalLivrosRick;
protected int TotalLivrosAlencar;
private Livros(){}
public static Livros getInstancia(){
       if (instancia == null){
          instancia = new Livros()
        return instancia;
       }
}
