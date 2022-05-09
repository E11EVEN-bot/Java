public class String {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String x = "Hamza";
        System.out.println(x);


        //String
        String a = "ABS";
        String b = "GYM";
        String c = (a + " " + b);

        //String Length
        System.out.println(c.length());

        // String concatenation
        String d = a + " " + b;
        System.out.println(d);

        // String Replace
        System.out.println(c.replace("A", "B"));

        // String substring
        System.out.println(c.substring(0, 3));// ABS GYM (ABS is at positn {0,2} but 2 is not printed Hence (0,3))

        // 
        
    }
}
