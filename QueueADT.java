public class QueueADT {

    private int array[];
    private int first;
    private int last;
    private int maxSize;
    private int currentSize;

    public QueueADT(int size){

        array = new int[size];
        maxSize = size;
        first = 0;
        last = -1;
        currentSize = 0;
    }

    public void dequeue()
    {

        System.out.println("Deleting " + array[first] + " from the front");

        first = (first + 1) % maxSize;
        currentSize--;
    }

    public void enqueue(int item)
    {
        System.out.println("Adding " + item);
        last = (last + 1) % maxSize;
        array[last] = item;
        currentSize++;
    }


    public int getFront()
    {
        return array[first];
    }

    public Boolean isEmpty()
    {
        return (currentSize == 0);
    }


}

