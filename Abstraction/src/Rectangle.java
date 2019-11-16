// Isaiah Saucedo 
public class Rectangle extends Shape implements PerimeterMeasureable, AreaMeasureable {
	public Rectangle(Vertex v1, Vertex v2, Vertex v3, Vertex v4) {
		v = new Vertex[4]; 
		v[0] = v1; 
		v[1] = v2; 
		v[2] = v3;
		v[3] = v4; 
	}
	
	public double getPerimeter() {
		double perimeter = 0; 
		perimeter += distance(v[0],v[1]);
		perimeter += distance(v[1],v[2]);
		perimeter += distance(v[2],v[3]);
		perimeter += distance(v[3],v[0]);

		return perimeter; 


	}
	
	public double getArea() {
		double height = distance(v[0],v[1]); 
		double base = distance(v[0], v[3]); 
		
		double area = base * height; 
		
		return area; 
		
		
		
		
	}
	
	public String toString() {
		String str = ""; 
		str += "Rectangle:\nPerimeter: " + getPerimeter() + "\n" + "Area: " + getArea() + "\n"; 
		return str; 
	}
}
