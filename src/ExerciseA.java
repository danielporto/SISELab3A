public class ExerciseA {
    public static final int NUM_ITER = 1000;
    public static final int NUM_ELEMENTS = 5;


            static class MyThread extends Thread {
        private Map<Integer, Integer[]> database;
        private Random numGenerator;

                 MyThread (Map<Integer, Integer[]> database) {
                         this.database = database;
                         this.numGenerator = new Random();
                     }

                 public void run () {
                         for (int i = 0; i < NUM_ITER; i++) {
                             	//select an element to change
                             	int id = numGenerator.nextInt(NUM_ELEMENTS);
                             	//update the element
                             	Integer [] element = database.get(id);
                             	element[0]+=1;
                            	database.put(id, element);
                             	}//for
                         }//run

             }//Threadclass

             public static void main (String[] args) throws Exception {

             	Map<Integer, Integer[]> DB = new HashMap<Integer, Integer[]>();

             	// initialize the map
             	for(int i=0; i < NUM_ELEMENTS; i++) {
                 		DB.put(i, new Integer[] {0});
                 	}//for

                 Thread a = new MyThread(DB);
                 Thread b = new MyThread(DB);

                 a.start();
                 b.start();

                 a.join();
                 b.join();

                 // sum the elements in the map
                 int total = 0;
                 for(int i=0; i < NUM_ELEMENTS; i++) {
                         System.out.println("Elements in bucket #"+i+":"+DB.get(i)[0]);
                 		total += DB.get(i)[0];
                 	}//for

                 System.out.println("Total items:"+total);
             }
 }
