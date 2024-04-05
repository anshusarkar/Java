package Manual_linked_list.Manual_linked_list_Using_abstruct_class;

abstract class Node {

    Integer var ; // abstruct classes arn't used for instance variables lol 
    Integer Next_var ;

}


class Manual_linked_list_Using_abstruct_class extends Node {

    Manual_linked_list_Using_abstruct_class () {

        this.var =  var;
        this.Next_var = null ;

    }

    public static void main(String[] args) {

        Manual_linked_list_Using_abstruct_class N1 = new Manual_linked_list_Using_abstruct_class() ;
        Manual_linked_list_Using_abstruct_class N2 = new Manual_linked_list_Using_abstruct_class() ;

        N1.var = 1 ;
        N1.Next_var = N2.var ;
        N2.var = 2 ;
        N2.Next_var = null ;

        System.out.println(N1.var);
        System.out.println(N2.var);



    }

}