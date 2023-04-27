package dynamic_array;

public class DynamicArray {
    private int[] array; // variable array[] is an array
    private int count; // count will deal with no of element add by you
    private int size; // size will with size of array[]

    public DynamicArray() {
        array = new int[1];
        count = 0;
        size = 1;
    }

    // function add an element at the end of array
    public void add(int data) {
        // check no of element is equal to size of array
        if (count == size) {
            growSize(); // make array size double
        }
        array[count] = data; // insert element at end of array
        count++;
    }

    // function makes size double of array
    public void growSize() {
        int[] temp = new int[0];
        if (count == size) {
            // temp is a double size array of array
            // and store array elements
            temp = new int[size * 2];
            {
                for (int i = 0; i < size; i++) {
                    temp[i] = array[i]; // copy all array value into temp
                }
            }
        }
        array = temp;
        size = size * 2;
    }

    // the function reduces the size of the array, removes empty cells
    public void shrinkSize() {
        int[] temp = new int[0];
        if (count > 0) {
            temp = new int[count]; // temp is a count size array and store array elements
            for (int i = 0; i < count; i++) {
                temp[i] = array[i]; // copy all array value into temp
            }
            size = count;
            array = temp;
        }
    }

    // function add an element at given index
    public void addAt(int index, int data) {
        if (count == size) { // if size is not enough make size double
            growSize();
        }

        for (int i = count - 1; i >= index; i--) {
            array[i + 1] = array[i]; // shift all element right from given index
        }
        array[index] = data; // insert data at given index
        count++;
    }

    // function remove last element or put zero at last index
    public void remove() {
        if (count > 0) {
            array[count - 1] = 0;
            count--;
        }
    }

    // function shift all element of right side from given index in left
    public void removeAt(int index) {
        if (count > 0) {
            for (int i = index; i < count - 1; i++) {
                array[i] = array[i + 1]; // shift all element of right side from given index in left
            }
            array[count - 1] = 0;
            count--;
        }
    }

    public void set(int index, int data) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = data;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        if (index < count) {
            return array[index];
        } else {
            return 0;
        }
    }

    public void clear() {
        count = 0;
        if (size > 1) {
            int[] newArray = new int[1];
            array = newArray;
            size = 1;
        }
    }

    public boolean contains(int data) {
        for (int i = 0; i < count; i++) {
            if (array[i] == data) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public long removeLast() {
        if (count == 0) {
            throw new IllegalStateException("Dynamic array is empty");
        }

        long startTime = System.nanoTime();
        int value = array[count - 1];
        count--;
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public long removeFirst() {
        if (count == 0) {
            throw new IllegalStateException("Dynamic array is empty");
        }

        long startTime = System.nanoTime();
        int value = array[0];

        for (int i = 1; i < count; i++) {
            array[i - 1] = array[i];
        }

        count--;
        long endTime = System.nanoTime();

        return endTime - startTime;
    }

    public static void main(String[] args) {
        DynamicArray da = new DynamicArray();
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);

        // print all array elements after add 9 elements
        System.out.println("Elements of array:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);

        // shrinkSize of array
        da.shrinkSize();

        // print all array elements
        System.out.println("Elements of array after shrinkSize of array: ");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);

        // add an element at index 1
        da.addAt(1, 22);

        // print Elements of array after adding an
        // element at index 1
        System.out.println("Elements of array after add an element at index 1:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);

        // delete last element
        da.remove();

        // print Elements of array after delete last
        // element
        System.out.println("Elements of array after delete last element:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);

        // delete element at index 1
        da.removeAt(1);

        // print Elements of array after delete
        // an element index 1
        System.out.println("Elements of array after delete element at index 1:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // print size of array and no of element
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);

        System.out.println("////////////////////HOMEWORK/////////////////////");

        // set an element at index
        da.set(7, 88);
        System.out.println("Elements of array after set an element 88 at index 7:");
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);

        // get an element at index
        System.out.println("Give element by index 7: " + da.get(7));

        // method contains
        System.out.println(da.contains(22));

        // method isEmpty
        System.out.println(da.isEmpty());

        // remove first
        System.out.println(da.removeFirst());
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // remove last
        System.out.println();
        System.out.println(da.removeLast());
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);
        for (int i = 0; i < da.size; i++) {
            System.out.print(da.array[i] + " ");
        }

        // clear array
        da.clear();
        System.out.println("Size of array: " + da.size);
        System.out.println("No of elements in array: " + da.count);
    }
}
