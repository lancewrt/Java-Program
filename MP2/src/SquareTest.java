// Title: Lesson 2 MP 02
// Date: 11-07-2022
// Author: Lance Bernal
class Square{
        public int side;
        static final int SIDES_NUMBER = 4;
        
        public float perimeter(){
            float peri = SIDES_NUMBER * side;
            return peri;
        }
        public float area(){
            float area = side * side;
            return area;
        }
}
public class SquareTest {
    public static void main(String[] args){
        Square obj = new Square();
        obj.side = 5;
        
        System.out.println("The perimenter is: " + obj.perimeter());
        System.out.println("The area is: " + obj.area());
    }
    
}
