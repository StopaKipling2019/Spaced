public class Main {

    public static void main(String[] args) {
	// write your code here
        double x1=5;
        double x2=4;
        double x3=-3;
        double y1=2;
        double y2=9;
        double y3=2;
        double z1=-5;
        double z2=2;
        double z3=6;
        double d12=Math.sqrt(Math.pow(y1-y2,2)+Math.pow(x1-x2,2)+Math.pow(z1-z2,2));
        double d13=Math.sqrt(Math.pow(y1-y3,2)+Math.pow(x1-x3,2)+Math.pow(z1-z3,2));
        double d23=Math.sqrt(Math.pow(y2-y3,2)+Math.pow(x2-x3,2)+Math.pow(z2-z3,2));
        double maxI=Math.max(d12,d13);
        double maxF=Math.max(maxI,d23);
        double minI=Math.min(d12,d23);
        double minF=Math.min(minI,d23);
        System.out.println(maxF);
        System.out.println(minF);

    }
}
