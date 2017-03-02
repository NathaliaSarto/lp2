public class Ponto{

        private  double x,y;
        public Ponto (){
         System.out.println ("Construtor 1- "+ this);
        }

        public Ponto (double x, double y){
          System.out.println ("Construtor 2");
          this.x = x;
          this.y = y;
        }

         public void setX(double x){
            this.x = x;
          }
          public double  getX(){
             return x;
          }



          public void setY(double y){
             this.y = y;
          }
          public double  getY(){
             return y;
          }

public static void main(String [] args){


  Ponto p1 = new Ponto();
  p1.setX(10);
  p1.setY(15);

  Ponto p2 = new Ponto();
  p2.setX(20);
  p2.setY(30);

  double subx = p1.getX()- p2.getX();
  double suby = p2.getY() - p1.getY();
  double distancia = Math.sqrt ( subx * subx + suby * suby);
  
  
  double area = (p1.getY() + p2.getY())*Math.abs(p1.getX() - p2.getX())/2;

  System.out.println (" ");
  System.out.println ("ATIVIDADE 1");
  System.out.println ("DISTANCIA ENTRE PONTOS:" + " " + distancia);
  System.out.println (" ");
  System.out.println ("ATIVIDADE 2");
  System.out.println ("ÁREA SOB A RETA:" + " " + area);
  System.out.println (" ");
  System.out.println (p1.getX() + " " + p1.getY() );
  System.out.println (p2.getX() + " " + p2.getY() );

  Ponto p3 = new Ponto();
  p3.setX(50);
  p3.setY(70);
  p3 = p1;

  System.out.println (p3.getX() + " " + p3.getY() );

  Ponto p4 = new Ponto (4.00, 5.00);

  Reta r1 = new Reta();
  r1.setP1(p1);
  r1.setP2(p2);


  r1.getP1().getX();
  r1.getP2().getY();
  r1.getP1().setX(30);
  r1.getP2().setY(40);
   


 System.out.println ( " " );
 System.out.println (r1.getP1().getX());
 System.out.println (r1.getP1().getY());
 System.out.println (r1.getP2().getX());
 System.out.println (r1.getP2().getY()); 

}



}
