public class Strings{
    public static void main(String[] args){
        // length
        String ninja = "Coding Dojo is awesome";
        int length = ninja.length();
        System.out.println("String length is: " + length);

        // concatenate
        String string1 = "My name is ";
        String string2 = "Desiree";
        String string3 = string1.concat(string2);
        System.out.println(string3);

        // format
        String string4 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(string4);

        // indexOf
        String string5 = "Welcome to Coding Dojo";
        int a = string5.indexOf("Coding");
        int b = string5.indexOf("co");
        int c = string5.indexOf("pizza");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // trim
        String sentence = "     spaces!!!     ";
        System.out.println(sentence.trim());

        // uppercase/lowercase
        String d = "HELLO";
        String e = "world";
        System.out.println(d.toLowerCase());
        System.out.println(e.toUpperCase());

        // equality
        String f = new String("word");
        String g = new String("word");
        System.out.println(f == g);
        System.out.println(f.equals(g));
    }
}