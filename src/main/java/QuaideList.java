public class QuaideList {

    private int size = 0;
    private String[] quaideArray;

    public QuaideList () {
        quaideArray = new String[10];
    }

    public void add(String nextElement) {
        if(size < quaideArray.length) {
            quaideArray[size] = nextElement;
            size++;
        }
        else {
            String[] newArray = new String[quaideArray.length * 2];
            System.arraycopy(quaideArray,0,newArray,0, size);
            quaideArray = new String[newArray.length];
            System.arraycopy(newArray,0,quaideArray,0, size);
            size++;
        }
    }

    public String get(int index) {
        if(index < 0 || index >= quaideArray.length) {
            throw new IndexOutOfBoundsException("Index does not exist in this QuaideList!");
        }else {
            return quaideArray[index];
        }
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if(index < 0 || index >= quaideArray.length) {
            throw new IndexOutOfBoundsException("This index does not exist!");
        }else {
            String[] newArray = new String[quaideArray.length];
            System.arraycopy(quaideArray, 0, newArray, 0, index);
            System.arraycopy(quaideArray, index + 1, newArray, index, quaideArray.length - (index + 1));
            System.arraycopy(newArray, 0, quaideArray, 0, size);
            size--;
        }
    }

    public boolean isEmpty() {
        if(size == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contains(String element) {
        for(int i = 0; i < size; i++) {
            if(quaideArray[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    //test print function
    public void print() {
        for(int i = 0; i < quaideArray.length; i++) {
            System.out.println(quaideArray[i]);
        }
        System.out.println(quaideArray.length);
    }

    public static void main(String[] args) {
        QuaideList test = new QuaideList();
        test.add("A");
        test.add("B");
        test.add("C");
        test.add("D");
        test.print();
        test.get(15);

    }
}
