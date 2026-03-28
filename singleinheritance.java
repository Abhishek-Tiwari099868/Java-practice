class Shape{
    public void area(){
        System.out.println("display area");
    }
class Triangle extends Shape{
    public void area (int l ,int h){
        System.out.println(0.5 * l * h);
    }
}
class euilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(0.5 * l * h);
}

}
}
public class singleinheritance {
    
}
