public class Principal{
	public static void main(String [] args){
    
	Triangulo f1= new Triangulo(); 
        f1.setBase(10);
	f1.setAlt (5);
	f1.setLd1 (10);
	f1.setLd2 (10);

	Trapezio f2 = new Trapezio();
	f2.setBama(8);
	f2.setBame(6);
	f2.setH(3);
	f2.setLad1(4);
	f2.setLad2(4);
	
	Retangulo f3 = new Retangulo();
	f3.setLado1(7);
	f3.setAltura1(5);
	
	Quadrado f4 = new Quadrado();
	f4.setLado(3);
	
	Circunferencia f5 = new Circunferencia();
	f5.setRaio(4);
		
	System.out.println ("ÁREA DO TRIÂNGULO: " + f1.calcArea()  + "\n PERÍMETRO DO TRIÂNGULO: " + f1.calcPeri());
	System.out.println ("\n\n ÁREA DO TRAPEZIO: " + f2.calcArea()  + "\n PERÍMETRO DO TRAPEZIO: " + f2.calcPeri());
	System.out.println ("\n\n ÁREA DO RETÂNGULO: " + f3.calcArea()  + "\n PERÍMETRO DO RETÂNGULO: " + f3.calcPeri());
	System.out.println ("\n\n ÁREA DO QUADRADO: " + f4.calcArea()  + "\n PERÍMETRO DO QUADRADO: " + f4.calcPeri());
	System.out.println ("\n\n ÁREA DA CIRCUNFERÊNCIA: " + f5.calcArea()  + "\n PERÍMETRO DA CIRCUNFERÊNCIA: " + f5.calcPeri());

	}
	
	
}
