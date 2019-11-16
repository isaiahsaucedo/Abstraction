// Isaiah Saucedo
public class Sphere extends Shape implements AreaMeasureable, VolumeMeasureable{
	double radius; 
	public Sphere(Vertex v1, double r) {
		v = new Vertex[1]; 
		v[0] = v1; 
		radius = r; 
	}
	
public double getArea() {
		
		double area; 
		double pi = 3.14; 
		
		area = 4 * pi * (radius * radius); 
		
		return area; 
		
		
		
	}
	
	public double getVolume() {
		double volume; 
		double pi = 3.14; 
		
		volume = 1.33 * pi * (radius * radius * radius);  
		
		return volume; 
		 
	}
	public String toString() {
		String str = ""; 
		str += "Sphere:\nVolume: " + getVolume() + "\n" + "Area: " + getArea() + "\n"; 
		return str; 
	}
}
