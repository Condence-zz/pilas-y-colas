package pruebas; 

import cola.QueueGen; 
import excepciones.QueueException;
import java.util.Stack; 
public class PruebaQueueGen { 
    public static void main(String[] args) throws QueueException {
        String errorMessage = null;
        
        // Cree una instancia de una cola circular para guardar enteros, de tamaño 5
        QueueGen queue = new QueueGen(5);  
        
        // Agregue los siguientes valores a la cola: 1, 2, 3. 
        try { 
            queue.enqueue(1);
            System.out.println(queue);
            queue.enqueue(2);
            System.out.println(queue);
            queue.enqueue(3);
            System.out.println(queue);
        } catch(QueueException e) {
            System.out.println(e);
        } 
        
        // Extraiga dos valores de la cola 
        try { 
            queue.dequeue();
            System.out.println(queue);  
            queue.dequeue();
            System.out.println(queue);  
        } catch(QueueException e) {
            System.out.println(e);
        }
        
        // Agregue los siguientes valores a la cola: 4, 5.
        try { 
            queue.enqueue(4);
            System.out.println(queue); 
            queue.enqueue(5); 
            System.out.println(queue);
        } catch(QueueException e) {
            System.out.println(e);
        }
        
        // Extraiga cuatro valores de la cola 
        try { 
            queue.dequeue();
            System.out.println(queue);
            queue.dequeue();
            System.out.println(queue);
            queue.dequeue();
            System.out.println(queue);
            queue.dequeue();
            System.out.println(queue);
        } catch(QueueException e) {
            System.out.println(e);
        }
        
        // Agregue los siguientes valores a la cola: 6, 7, 8, 9, 10, 11. 
        try { 
            queue.enqueue(6); 
            System.out.println(queue);
            queue.enqueue(7); 
            System.out.println(queue);
            queue.enqueue(8); 
            System.out.println(queue);
            queue.enqueue(9); 
            System.out.println(queue);
            queue.enqueue(10); 
            System.out.println(queue);
            queue.enqueue(11); 
            System.out.println(queue);  
        } catch(QueueException e) {
            System.out.println(e);
        }
        System.out.println("----------------------------");
        // Cree una instancia de una cola circular para guardar cadenas, de tamaño 4 
        QueueGen queue2 = new QueueGen(4);  
        
        // Agregue los siguientes valores a la cola: “A”, “B”.  
        try { 
            queue2.enqueue("A");
            System.out.println(queue2);
            queue2.enqueue("B");
            System.out.println(queue2); 
        } catch(QueueException e) {
            System.out.println(e);
        } 
        
        // Extraiga tres valores de la cola 
        try { 
            queue2.dequeue();
            System.out.println(queue2);
            queue2.dequeue();
            System.out.println(queue2);
            queue2.dequeue();
            System.out.println(queue2); 
        } catch(QueueException e) {
            System.out.println(e);
        }

        // Agregue los siguientes valores a la cola: “C”, “D”, “E”, “F”.  
        try { 
            queue2.enqueue("C");
            System.out.println(queue2);
            queue2.enqueue("D");
            System.out.println(queue2); 
            queue2.enqueue("E");
            System.out.println(queue2); 
            queue2.enqueue("F");
            System.out.println(queue2); 
        } catch(QueueException e) {
            System.out.println(e);
        }
        System.out.println("----------------------------");
        // Cree una instancia de una cola circular de tipo crudo, de tamaño 4 
        QueueGen queue3 = new QueueGen(4);  
        
        // Agregue los siguientes valores a la cola: 1, “A”, 2.  
        try { 
            queue3.enqueue(1);
            System.out.println(queue3);
            queue3.enqueue("A");
            System.out.println(queue3);
            queue3.enqueue(2);
            System.out.println(queue3); 
        } catch(QueueException e) {
            System.out.println(e);
        } 
        
        // Extraiga dos valores de la cola 
        try { 
            queue3.dequeue();
            System.out.println(queue3);
            queue3.dequeue();
            System.out.println(queue3); 
        } catch(QueueException e) {
            System.out.println(e);
        }

        // Agregue los siguientes valores a la cola: “B”, “C”.  
        try { 
            queue3.enqueue("B");
            System.out.println(queue3);
            queue3.enqueue("C");
            System.out.println(queue3);  
        } catch(QueueException e) {
            System.out.println(e);
        }
         
    } 
}
