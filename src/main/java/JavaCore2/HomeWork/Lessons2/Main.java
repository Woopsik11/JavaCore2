package JavaCore2.HomeWork.Lessons2;

public class Main {

    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "57", "54"},
                {"98", "22", "4", "tr"},
                {"549", "1001", "-47", "-800"}};

        String[][] arr2 = new String[][]{
                {"4", "8", "14", "13"},
                {"9", "8", "42", "54"},
                {"98", "7", "35", "24"},
                {"549", "1001", "-47", "800"}};

        String[][] arr3 = new String[][]{
                {"4", "8", "14", "8"},
                {"9", "8", "42", "54"},
                {"98", "7", "4", "5"},
                {"549", "1001", "-47", "-800"}};


        try {
            ArraySum.sum(arr1);
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            ArraySum.sum(arr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            ArraySum.sum(arr3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
