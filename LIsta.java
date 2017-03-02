public class Lista{
 private class No{
   private  int x;
   private No prox;
   private No ant;

   public void setX(int  x){
            this.x = x;
  }
  public int  getX(){
             this.return x;
  }

  public void setAnt (No ant){
           this.ant = ant;
  }
  public No getAnt(){
            this.return ant;
  }

  public void setProx(No prox){
           this.prox = prox;
  }
  public No getProx(){
            this.return prox;
  }



  private No cabeca, fim;

  public void inserir (int x){
         No novo = new  No();
         novo.setX(x);
         this.pe = novo;
         cabeca = pe;


  }
  public void remover (){

  }

  public  boolean pesquisar (int busca){
    No cursor = cabeca;
    while (cursor.getX() != busca && cursor != null){
          cursor=cursor.getProx();
    }
    if (cursor == null){
       return false;
    }else{
       return true;
   }
 }

 }
}
