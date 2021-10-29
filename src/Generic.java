import java.util.Arrays;

public class Generic<E> {

    private int size;
    private Object[] arr;

    public Generic() {
        size=0;
        arr=new Object[1];
    }

    public void add(E e)
    {
        if(this.size<arr.length)
            arr[size]=e;
        else
        {
            Object[] temp = arr;
            arr=new Object[size+1];
            for (int i=0;i<temp.length;i++)
            {
                arr[i]=temp[i];
            }
            arr[size]=e;
        }
        ++size;
    }

    public E getByIndex(int index)
    {
        if (index>=size)
        {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E)arr[index];
    }

    public static <E> void ArrayGeneric(E[] a, Generic<E> gen) {
        for (E e : a) gen.add(e);
    }

    public int getSize() {
        return size;
    }
    public void clearGen()
    {
        arr=new Object[1];
        size=0;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
