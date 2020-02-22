
public class Piscina {

	public static void main(String[] args) {
				
		double raio = raio(6);
		System.out.println(raio);
		
		double pi = area(raio);
		System.out.println(pi);
		
		double total = resutotal(6);
		System.out.println(total);
	}
	public static double raio(double diametro) {
		return diametro / 2;
		
	}
	public static double area(double raio) {
		return Math.PI * Math.pow(raio, 2);
	}
	public static double resutotal(int diametro) {
		double raio = raio(diametro);
		double area = area(raio);
		return area * 75;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
