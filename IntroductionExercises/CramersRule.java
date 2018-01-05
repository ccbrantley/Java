/*
a       b
3.4x + 50.2y = 44.5    e
2.1x + .55y = 5.9      f
c       d
Cramers Rule
x = ed-bf   y = af-ec
    ad-bc       ad-bc  */
public class forever {
    public static void main(String[] args){
        double x = ((44.5 * .55) - (50.2 * 5.9))/ ((3.4 * .55) - (50.2 * 2.1));
        double y = ((3.4 * 5.9)-(44.5 * 2.1)) / ((3.4 * .55)-(50.2 * 2.1));
        System.out.println("x = " + ((44.5 * .55) - (50.2 * 5.9))/ ((3.4 * .55) - (50.2 * 2.1)));
        System.out.println("y = " + ((3.4 * 5.9)-(44.5 * 2.1)) / ((3.4 * .55)-(50.2 * 2.1)));
        System.out.println(3.4 * x + 50.2 * y);
        System.out.println(2.1* x + .55 * y);

    }
}
