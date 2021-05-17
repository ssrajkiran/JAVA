public class Reverse {

    public static String word[];
    public static void main(String [] args){
        String input = "Hello World!";
        StringBuilder array = new StringBuilder();

        array.append(input);
        System.out.println(array.reverse());

    }
}