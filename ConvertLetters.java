/*
 *  Convert uppercase letters to lowercase letters and 
 *  lowercase letters to uppercase letters.
 * 
 * @author: OudonePKL
 */
public class ConvertLetters {

    // method for change letters
    public static void changeText(String q[]) {

        for (int i = 0; i < q.length; i++) {
            System.out.print(q[i]);
        }
        System.out.println();
        for (int i = 0; i < q.length; i++) {
            if (q[i].toUpperCase().equals(q[i])) {
                System.out.print(q[i].toLowerCase());
            } else {
                System.out.print(q[i].toUpperCase());
            }
        }
    }
 
    public static void main(String[] args) {

        String[] q = {"H","e","l","l","o","W","o","r","l","D"};

        // call the method
        changeText(q);

    }
}