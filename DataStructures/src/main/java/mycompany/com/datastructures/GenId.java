
package mycompany.com.datastructures;
//comentário apenas para gerar o primeiro commit
public class GenId {
        static int id = 0;
        
        public static int create() {
            id++;
            return id;
         }
        
}
