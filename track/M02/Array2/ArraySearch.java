
class ArraySearch {

    void search(int arr[], int key) {
        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                System.out.println("Element Found at Index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found...");
        }
    }
}
