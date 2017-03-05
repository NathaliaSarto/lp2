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
            if cabeca == null{
             this.fim = novo;
             cabeca = fim;
            }else{
             novo.setAnt(fim);
             fim.setProx(novo);
             fim=novo;
            }
            novo.st

  }
  public void remover (){
         this.fim = fim.getAnt();
         this.fim.setProx(null);
           if (fim == null){
            cabeca = null;
           }else{
            this.fim.setProx(null);
           }
   

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
