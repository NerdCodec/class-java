import java.util.*;
public class Group {
    public String GroupName;
    public String GroupElement;
    public int GroupIndex;    
public static void main(String[]args){
   Scanner sc = new Scanner(System.in);

   //creating an object of the class Group
   Group umoja = new Group();
   umoja.GroupName = "Code Weavers";
   umoja.GroupElement="Beta";
   umoja.GroupIndex=12;

   //printing case of the output
   System.out.print("GroupName: " + umoja.GroupName);
   System.out.print("\nGroupIndex: " + umoja.GroupIndex);
   System.out.print("\nGroupElement: " + umoja.GroupElement);

}

}
