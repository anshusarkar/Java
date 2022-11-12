class Constractor {

    //The Special method or function in c's term that shars the same nane as of its class and dosen't return a value is called a Constructor
    //Constructor are of 3 types:
    // 1. Default constructor (constractor without acess specifiers)&(this constractors are just an object of a class )
    // 2. Paramateried constructor(constractor with data thypes or parameters)
    // 3. Non argument constractor (same as default constructor but get's inicited at the outside of main method unlike defualt constractor)
     
    Constractor(){
        
    }



    public static void main(String[] args){
        Constractor c = new Constractor(); //Assinging the constroctor as an varriable object   
        System.out.println(c);
    }
    


}