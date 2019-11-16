// Isaiah Saucedo 
public class Triangle extends Shape implements PerimeterMeasureable, AreaMeasureable {
	
	public Triangle(Vertex v1, Vertex v2, Vertex v3) {
		v = new Vertex[3]; 
		v[0] = v1; 
		v[1] = v2; 
		v[2] = v3;
	}
	
	public String toString() {
		String str = ""; 
		str += "Triangle:\nPerimeter: " + getPerimeter() + "\n" + "Area: " + getArea() + "\n"; 
		return str; 
	}
	public double getPerimeter() {
		double perimeter = 0; 
		perimeter += distance(v[0],v[1]);
		perimeter += distance(v[1],v[2]);
		perimeter += distance(v[2],v[0]);
		return perimeter; 


	}
	
	public double getArea() {
		double height = distance(v[0],v[1]); 
		double base = distance(v[0], v[2]); 
		
		double area = 0.5 * (base * height); 
		
		return area; 
		
		
		
		
	}
}
