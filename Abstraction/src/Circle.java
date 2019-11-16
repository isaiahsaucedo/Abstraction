// Isaiah Saucedo 
public class Circle extends Shape implements PerimeterMeasureable, AreaMeasureable {
	
	public Circle(Vertex v1, Vertex v2) {
		v = new Vertex[2]; 
		v[0] = v1; 
		v[1] = v2; 
		 
	}
	
	public double getPerimeter() {
		double perimeter = 0; 
		double pi = 3.14; 
		perimeter += (distance(v[0],v[1])) * 2; // diameter 
		
		

		return perimeter * pi; 


	}
	
	public double getArea() {
		double radius = distance(v[0],v[1]); 
		double pi = 3.14; 
		
		double area = pi * (radius * radius); 
		
		return area; 
		
		
		
		
	}
	
	public String toString() {
		String str = ""; 
		str += "Circle:\nPerimeter: " + getPerimeter() + "\n" + "Area: " + getArea() + "\n"; 
		return str; 
	}
}
