package Manual_linked_list ;


public class Manual_linked_list {

    // Has error 
    public static void main(String[] args) {
        Manual_linked_list_node obj = new Manual_linked_list_node();
        Manual_linked_list_node obj2 = new Manual_linked_list_node();

        obj.index = 1;
        obj.Next = obj2 ;
    
        obj2.index = 2;
        obj2.Next = null ;

        System.out.println(obj);
        System.out.println(obj2);

}
}




