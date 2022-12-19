public class Main {
    

        public static void main(String[] args) {
            Synchronization sThread = new SynchronizationThread();
    
            new Thread() {
                public void run() {
                    sThread.withdraw(1000);
                }
            }.start();
    
            new Thread() {
                public void run() {
                    sThread.deposit(10000);
                }
            }.start();
    
            
        }
        
    } 
}
