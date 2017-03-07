public class Quadrado extends FiguraGeometrica{
   private double lado; 	
	
   public void setLado(double lado){
      this.lado=lado;	   
   }
   public double getLado(){
	  return this.lado;
   }
   
   
   public double calcArea(){
	   lado * lado;
   }
   
   public doule calcPeri(){
	   lado * 4;
   }

}
