class Super_Keyword {
    public static void main(String[] args) {
        childs c = new childs() ;
        c.child();
    }
}
class parents {
    void parent () {
        System.out.println("Hello I am a parent !");
    }
}
class childs extends parents {
    void child () {
        super.parent();
        System.out.println("Hello, and I am his child !");
    }
}

