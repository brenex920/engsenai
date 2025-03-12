package engsenai.calcular_formulas.model;

public class Quadrado {

	public double lado;
	
	public void setlado(double lado) {
		
		
	}
	
	public double calcularArea() {
	
		double area = lado * 2;
		return area;
	
		
	}
	
	public double calcularPerimetro() { 
	
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void moatrarDados() {
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("------------------------------");
		System.out.println("lADO: " + lado);
		System.out.println("AREA: " + calcularArea()); 
		System.out.println("PERIMETRO: " + calcularPerimetro()); 
	}
	
}
	

