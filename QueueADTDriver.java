public class QueueADTDriver {

    public static void main(String [] args){
        QueueADT q = new QueueADT(5);

        q.enqueue(19);
        q.enqueue(202);
        q.enqueue(233);
q.enqueue(1192);
        System.out.println("First number in the queue is: " + q.getFront());
        q.dequeue();
        System.out.println("First number in the queue is: " + q.getFront());
        q.dequeue();
        System.out.println("First number in the queue is: " + q.getFront());
        q.dequeue();

        if (q.isEmpty())
            System.out.println("Queue Is Empty");
        else
            System.out.println("Queue Is Not Empty");

    }
}
