public class Triangulo extends FiguraGeomerica{
  private double alt, ld1, ld2, base;

  public void setAlt(double alt){
    this.alt=alt;
  }
  public void setLd1(double ld1){
    this.ld1=ld1;
  }
  public void setLd2(double ld2){
    this.ld2=ld2;
  }
  public void setBase(double base){
    this.base=base;
  }


  public double getAlt(){
    return this.alt;
  }
  public double getLd1(){
    return this.ld1;
  }
  public double getLd2(){
    return this.ld2;
  }
  public double getBase(){
    return this.base;
  }


  public double calcArea(){
    return (get.Base()*getAlt())/2;
  }

  public double calcPerim(){
    return get.Base() + get.Ld1() + get.Ld2;

  }


}
