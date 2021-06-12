class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be negative";
    }
    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}
public class throwkeyword {
    public static double ar (double r) throws NegativeRadiusException{
        if(r<0){
            throw new NegativeRadiusException();
        }
        double area = Math.PI*r*r;
        return area;
    }
    public static int divide (int a,int b) {
        int result = (a / b);
        return result;
    }
    public static void main(String[] args) {

        try{
//            int c= divide(6,0);
//           System.out.println(c);
            double x= ar(-6);
            System.out.println(x);
        }
        catch (Exception e){
            System.out.println("Exception");
        }
    }
}
