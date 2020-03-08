package klef;
import java.util.*;
public class collections
{
    private static Scanner sc;

	public static void main(String[] args) 
    {
    	sc = new Scanner(System.in);
    	Customlist<Integer> list = new Customlist<Integer>();
    	System.out.println("Initial list:");
    	System.out.println(list);
    	System.out.println("How many elements do you want to add");
        int noOfAdd=sc.nextInt();
        System.out.println("enter elements:");
        for (int i=0;i<noOfAdd;i++)
        {
        	int adding=sc.nextInt();
        	list.add(adding);
        }
        System.out.println("Total list after adding elements:");
        System.out.println(list);
        System.out.println("enter index to be removed");
        int removeElement;
        removeElement=sc.nextInt();
        list.remove(removeElement);
        System.out.println("Total list after removing elements:"+list);
        System.out.println("value at index 0 is "+ list.fetch(0));
        System.out.println("value at index 1 is:"+list.fetch(1));
        System.out.println("total size"+list.size());
    }
}