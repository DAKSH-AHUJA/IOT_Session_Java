package day13;

public class ProductId {
    public static void main(String[] args) {

        int[] ids = {101, 102, 103, 104};
        int search = 103;

        boolean found = false;

        for (int i = 0; i < ids.length; i++) {
            if (ids[i] == search) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Product ID exists");
        } else {
            System.out.println("Product ID does not exist");
        }
    }
}