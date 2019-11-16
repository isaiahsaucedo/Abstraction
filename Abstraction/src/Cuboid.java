// Isaiah Saucedo 
public class Cuboid extends Shape implements AreaMeasureable, VolumeMeasureable{
	double width, height, depth; 
	public Cuboid(Vertex v1, double width, double height, double depth) {
		v = new Vertex[1];
		
		v[0] = v1; 
		
		this.width = width; 
		this.height = height; 
		this.depth = depth; 
		
		
	}
	
	public double getArea() {
		
		double area; 
		
		area = 2 * ((depth * width) + (width * height) + (height * depth)); 
		
		return area; 
		
		
		
	}
	
	public double getVolume() {
		double volume;  
		
		volume = depth * width * height;  
		
		return volume; 
		 
	}
	public String toString() {
		String str = ""; 
		str += "Cuboid:\nVolume: " + getVolume() + "\n" + "Area: " + getArea() + "\n"; 
		return str; 
	}
}
