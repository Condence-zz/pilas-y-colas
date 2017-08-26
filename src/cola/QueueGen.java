package cola;  
import excepciones.QueueException; 
public class QueueGen<E> { 
    private int front;
    private int rear; 
    public static final int tamCola=5;
    private E[] cola;
    public QueueGen(int tamCola) {   
        cola = (E[]) new Object[tamCola];
        front = -1;
        rear = -1;
    }     
    public boolean full(){ 
        return rear == cola.length-1;
    }
    public boolean empty(){
        return front == rear;
    }
    public void enqueue(E elemento) throws QueueException {
        if (!full()) { 
            cola[++rear] = elemento;
        } else {
            throw new QueueException("La cola esta llena.. Elimine datos...");
        }
    }
    public E dequeue() throws QueueException {
        if (!empty()) {
            return cola[++front];
        } else {
            throw new QueueException("La cola esta vacia.. Inserte datos..."); 
        }
    }
    
    public E peek(){
        if (!empty()) {
            return cola[0];
        } else {
            throw new QueueException("La cola esta vacia.. Inserte datos...");
        } 
    }
    @Override
    public String toString() {
        return "QueueGen{" + "cola=" + cola + ", front=" + front + ", rear=" + rear + '}';
    }
    
}
