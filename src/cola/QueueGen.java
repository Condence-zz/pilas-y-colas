package cola;  
import excepciones.QueueException; 
public class QueueGen<E> { 
    private int front;
    private int rear; 
    public int tamCola ;
    private E[] cola;
    public QueueGen(int tamCola) { 
        this.tamCola = tamCola;
        cola = (E[]) new Object[tamCola];
        front = -1;
        rear = -1;
    }
    /**
     * 
     * @return 
     */
    public boolean full() { 
        if(rear==tamCola-1 && front==0 || rear+1==front){
            return true; 
        }
        else{
            return false; 
        }
    }
    /**
     * 
     * @return 
     */
    public boolean empty(){
        if(rear==-1 && front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    /**
     * 
     * @param elemento
     * @throws QueueException Si la cola esta llena 
     */
    public void enqueue(E elemento) throws QueueException { 
        if(full()==true){
            throw new QueueException("La cola esta llena.. Elimine datos...");
        } else {
                if (empty()) {
                front = 0;
                rear = 0;
            } else {
                if (rear == tamCola - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            } 
            cola[rear] = elemento;
                
        }
    }
    /**
     * 
     * @return
     * @throws QueueException 
     */
    public E dequeue() throws QueueException { 
        E aux = null;
        if(empty()==true){ 
            throw new QueueException("La cola esta vacia.. Inserte datos..."); 
        } else{ 
            aux = cola[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front++;
            }
        }
        return aux; 
    }
    /**
     * 
     * @return
     * @throws QueueException 
     */
    public E peek() throws QueueException {
        if (empty()) {
            return cola[front -1];
        } else {
            throw new QueueException("La cola esta vacia.. Inserte datos...");
        } 
    }
    @Override
    public String toString() {
        String cadena = "";
        int actual = front;
        if (!empty()) {
            while (actual != rear) {

                cadena = cadena + cola[actual] + ", ";

                if (actual == tamCola - 1) {
                    actual = 0;
                } else {
                    actual++;
                }
            }
            cadena = cadena + cola[rear];
        }
     
        return cadena;
    }
    
}
