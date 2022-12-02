package Hierarchical_Inheritance;

public class HierarchicalInheritacnce {
    int A_method(int classname){
        System.out.println("This is a method of block "+classname+" !");
        return classname ;
    }

}
class block1 extends HierarchicalInheritacnce {
    public static void main(String[] args) {
        HierarchicalInheritacnce obj = new HierarchicalInheritacnce();
        obj.A_method(1);
    }
}

class block2 extends HierarchicalInheritacnce {
    public static void main(String[] args) {
        HierarchicalInheritacnce obj2 = new HierarchicalInheritacnce();
        obj2.A_method(2);
    }
}
