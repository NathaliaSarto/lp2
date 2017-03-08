public class Trapezio extends FiguraGeometrica{
   private double bame, bama, lad1, lad2, h;
   
   
   public void setBame(double bame){
	 this.bame = bame;
   }	
   public void setBama(double bama){
	 this.bama = bama;
   }
   public void setH(double h){
	 this.h = h;
   }
   public void setLad1(double lad1){
	 this.lad1 = lad1;
   }
   public void setLad2(double lad2){
	 this.lad2 = lad2;
   }
	
	
    public double getBame(){
	 return this.bame;  
	}
	public double getBama(){
	 return this.bama;  
	}
	public double getH(){
	 return this.h;  
	}
	public double getLad1(){
	 return this.lad1;  
	}
	public double getLad2(){
	 return this.lad2;  
	}
	
	
	public double calcArea(){
	 return ((get.Bama() + get.Bame()) * get.H()) / 2;
	}
	
	public double calcPeri(){
	 return get.Bama() + get.Bame() + get.Lad1() + get.Lad2();
    }	
}
