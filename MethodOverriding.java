class grandfather {
    void jean (){
        System.out.println("This is a jean of a grandfather !");
    }
}
class father extends grandfather {
    @Override
    void jean (){
        System.out.println("The jean of granderfther is now been OVERRIDEN into father class !");
    }
}
class DNA_TEST {
    public static void main(String[] args) {
     father dna = new father();
     dna.jean();   
    }
}