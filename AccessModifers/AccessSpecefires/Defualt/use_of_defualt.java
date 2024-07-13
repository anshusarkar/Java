package AccessModifers.AccessSpecefires.Defualt;

class use_of_defualt { // a class without it's access specified is called a defualt one 
    void sayHello(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        use_of_defualt a = new use_of_defualt();
        a.sayHello();
    }

}
