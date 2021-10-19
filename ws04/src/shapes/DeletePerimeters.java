package shapes;

public class DeletePerimeters {
	public Shape[] deleteParams(Shape[] shapes, int count) {
		// Value of the min and max shapes. They are stored to later find that
		// value and eliminate.
		double minTriangle = Double.MAX_VALUE, maxCircle = Double.MAX_VALUE;
		// Indicates first iteration.
		boolean firstT = true, firstC = true;
		// Arrays to store all the positions with the same perimeter, in case 
		// if there is more than one; -1 indicates end of same occurrences.
		int[] posTriangle = {-1, -1, -1, -1, -1, -1, -1 },
			  posCircle   = {-1, -1, -1, -1, -1, -1, -1 };
		// Index to know element's position in the array.
		int idx = 0;
		// Index to know how many equal elements are in the array and their position.
		int equalT= 0, equalC = 0;
		
		for(Shape s : shapes) {
			if(count > 0) {
			if(s.getClass().getSimpleName() == "Triangle") {
				//if(firstT) {
//					minTriangle = s.getPerimeter();
//					posTriangle[0] = idx;
//					firstT = false;
//				}else {
					if(minTriangle > s.getPerimeter()) {
						minTriangle = s.getPerimeter();
						// Reset the positions array, lower perimeter found.
						for(int arr : posTriangle) {
							arr = -1;
						}
						equalT = 0;
						posTriangle[0] = idx;
					}else if(minTriangle == s.getPerimeter()) {
						posTriangle[++equalT] = idx;
					}
				//}
				if(s.getClass().getSimpleName() == "Circle") {
//					if(firstC) {
//						maxCircle= s.getPerimeter();
//						posCircle[0] = idx;
//						firstC = false;
//					}else {
						if(maxCircle> s.getPerimeter()) {
							maxCircle = s.getPerimeter();
							// Reset the positions array, higher perimeter found.
							for(int arr : posCircle) {
								arr = -1;
							}
							equalC = 0;
							posCircle[0] = idx;
						}else if(minTriangle == s.getPerimeter()) {
							posCircle[++equalC] = idx;
							}
						}
					//}
				idx++;
				}
			}
			count--;
		}
				
		if(posTriangle[0] == -1 && posCircle[0] == -1) { 
			return shapes;
		}
		
		Shape[] newShape = new Shape[shapes.length - (equalT + equalC)];
		
		// Reusing variables to copy, reset values
		equalT = 0;
		equalC = 0;
		
		for(int i=0; i < idx; i++) {
			if(i!=posTriangle[equalT] && i != posCircle[equalC]) {
				newShape[i] = shapes[i];
			}else {
				if(i == posTriangle[equalT])
					equalT++;
				else
					equalC++;
			}
		}
		return newShape;
	}
}
