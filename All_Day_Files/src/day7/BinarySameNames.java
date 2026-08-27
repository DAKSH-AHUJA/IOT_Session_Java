package day7;

public class BinarySameNames {

    public static void main(String[] args) {

        String[] names = {
            "Aarav", "Aarav", "Aarav",
            "Karan", "Karan",
            "Michael", "Michael", "Michael"
        };

        String target = "Michael";

        int first = -1;
        int last = -1;

        int start = 0;
        int end = names.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (names[mid].equals(target)) {
                first = mid;
                end = mid - 1;       
            }
            else if (names[mid].compareTo(target) < 0) {
                start = mid + 1;    
            }
            else {
                end = mid - 1;      
            }
        }

        start = 0;
        end = names.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (names[mid].equals(target)) {
                last = mid;
                start = mid + 1;     
            }
            else if (names[mid].compareTo(target) < 0) {
                start = mid + 1;     
            }
            else {
                end = mid - 1;       
            }
        }

        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}
