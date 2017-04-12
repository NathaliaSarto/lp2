class Principal{
  public static void main(String []ars){
    Livros l1 = new Livros.getInstancia();
    Livros l2 = new Livros.getInstancia();
    l1.totalLivrosClarisee++;
    Livros l3 = new Livros.getInstancia();
    l3.totalLivrosClarisse+10;
    Livros l4 = new Livros.getInstancia();
    System.out.println(l1,l2,l3,l4);
  }
}
