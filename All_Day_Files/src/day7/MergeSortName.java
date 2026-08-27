package day7;

public class MergeSortName {

    static void mergeSortt(String[] names, int left, int right) {
        if (left >= right)
            return;
        int mid = (left + right) / 2;
        mergeSortt(names, left, mid);
        mergeSortt(names, mid + 1, right);
        String[] temp = new String[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            temp[k++] = names[i].compareToIgnoreCase(names[j]) < 0
                    ? names[i++]
                    : names[j++];
        }
        while (i <= mid)
            temp[k++] = names[i++];
        while (j <= right)
            temp[k++] = names[j++];
        for (i = 0; i < temp.length; i++)
            names[left + i] = temp[i];
    }
    public static void main(String[] args) {

        String[] names = {
            "Ravi",
            "Anita",
            "Suresh",
            "Meena",
            "Arjun",
            "Priya",
            "Kiran",
            "Deepa"
        };

        mergeSortt(names, 0, names.length - 1);

        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
