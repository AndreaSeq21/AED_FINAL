
package Business.Person;

/**
 *
 * @author Bhagyashri Chavan
 */
public class CDCEmployee extends Person{
    
    private int id;
    private static int count = 1;

    public CDCEmployee() {
        
        id = count;
        count++;
    }
    
    
     public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
        return this.getFirstName()+" "+this.getLastName();
    }
    
    
}
