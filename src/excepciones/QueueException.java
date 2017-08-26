package excepciones; 
public class QueueException extends RuntimeException { 
    public QueueException() {
    }
    public QueueException(String msj) {
        super(msj);
    }   
} 