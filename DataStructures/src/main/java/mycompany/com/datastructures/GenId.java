
package mycompany.com.datastructures;

public class GenId {
        static int id = 0;
        
        public static int create() {
            id++;
            return id;
         }
        
}
