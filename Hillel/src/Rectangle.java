
public class Rectangle {
    public static void main(String[] params){
         double perimeter = 14;
         double area = 12;
         findoutsides(perimeter, area);
    }
    public static void findoutsides(double perimeter, double area){
        //eitherside^2 - eitherside*perimeter/2 + area=0
        double width;
        double length;
        double discriminant = Math.pow((perimeter / 2),2) - 4*area;
        if (discriminant < 0) {
            System.out.println("There is no possible solution");
        } else if(discriminant==0){
            width = length = (perimeter / 2) / 2;
            System.out.println("Width = " + width);
            System.out.println("Length = " + length);
        } else {
            width = ((perimeter / 2) + Math.sqrt(discriminant)) / 2;
            length = ((perimeter / 2) - Math.sqrt(discriminant)) / 2;
            System.out.println("Width = " + width);
            System.out.println("Length = " + length);
        }
    }
}
