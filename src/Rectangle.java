public class Rectangle {
    int length;
    int width;


void insert(int l, int w){
length = l;
width = w;


}
void calculateArea(){
System.out.println(length*width);
}
class TestRectangle{
public static void main(String[] args){
    Rectangle  Rectangle1 = new Rectangle();
    Rectangle Rectangle2 = new Rectangle();
    Rectangle1.insert(20,5);
    Rectangle2.insert(11,5);
    Rectangle1.calculateArea();
    Rectangle2.calculateArea();
}}
}

