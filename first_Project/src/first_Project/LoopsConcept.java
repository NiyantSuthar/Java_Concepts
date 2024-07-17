package first_Project;

public class LoopsConcept {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println("Number: " + i);
            i++; 
        }
        
        int j = 1;
        do {
            System.out.println("Number: " + j);
            j++; 
        } while (j <= 10);
        
        for (int k = 1; k <= 10; k++) {
            System.out.println("Number: " + k);
        }
    }
}

