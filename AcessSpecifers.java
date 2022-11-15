class AcessSpecifers {
    public static void main(String []args){
        
        
        AcessSpecifers obj = new AcessSpecifers();
        obj.private_method();
        Pub objp = new Pub();
        objp.public_method();
    }
    private void private_method(){
        System.out.println("Hi! I am private");
    }
}
class Pub{
    public void public_method(){
        System.out.println("Hi! I am public method of another class");
    }
}

