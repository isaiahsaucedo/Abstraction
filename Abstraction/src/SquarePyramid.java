// Isaiah Saucedo 
public class SquarePyramid extends Shape implements AreaMeasureable, VolumeMeasureable{
	double  baseWidth, baseHeight;
	
	
	public SquarePyramid(Vertex v1, double baseWidth, double baseHeight) {
		v = new Vertex[1]; 
		v[0] = v1; 
		this.baseHeight = baseHeight; 
		this.baseWidth = baseWidth; 
		
	}
	
	public double getArea() {
		double a2; 
		double b2;
		double c2; 
		double area; 
		
		a2 = baseHeight; 
		b2 = baseWidth / 2; 
		c2 = (a2 * a2) + (b2 * b2); // pytha. thm.
		
		area = (2 * baseWidth * c2) + (baseWidth * baseWidth); 
		return area; 
		
		
		
		
		
		
		
	}
	
	public double getVolume() {
		double volume;  
		
		volume = 0.33 * (baseWidth * baseWidth) * baseHeight; 
		
		return volume; 
		 
	}
	public String toString() {
		String str = ""; 
		str += "Square Pyramid:\nVolume: " + getVolume() + "\n" + "Area: " + getArea() + "\n"; 
		return str; 
	}
}
