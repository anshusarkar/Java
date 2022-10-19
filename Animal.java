 class Animal {
    static int leg = 4 ; // leg object // That dosen't mean a variable is an object // variables get deceared outside of methods includeing main method as they compile before methods 
    static String Animalclass = "Mamal";
    static void cow(){
        System.out.println("Animal = Cow,");
        System.out.println("Animalclass = " + Animalclass+",");
        System.out.println("Cow has " + leg + " legs,");
        System.out.println("it is called Bos Torus in nomenclature.");
        
    }
    static void tiger(){
        System.out.println("Animal = Tiger,");
        System.out.println("Animalclass = " + Animalclass+",");
        System.out.println("Tiger has "+ leg +" legs,");
        System.out.println("Tiger is called Panthera Tigress in nomenclature.");
    }
    public static void main(String[] args) {
        System.out.println("================================");
        cow();
        System.out.println("================================");
        tiger();
        System.out.println("================================");
        
    }
}
class Fernitaure extends Animal { //Class inhertance using extends keyword
    static void table(){
        System.out.println("Fernitaure = Table,");
        System.out.println("Table has " + leg + " legs,");
    }    
    public static void main(String[] args) {
        table();
    }
}