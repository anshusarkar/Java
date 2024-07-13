import AccessModifers.Public.use_of_public_in_methods;

class method_call_of_public_classes  {
    public static void main(String[] args) {
        AccessModifers.Public.use_of_public_in_methods obj = new AccessModifers.Public.use_of_public_in_methods();
        obj.method();
    }
}

class method_call_of_public_classes2 extends AccessModifers.Public.use_of_public_in_methods {

    public static void main(String[] args) {
        method_call_of_public_classes2 obj2 = new method_call_of_public_classes2();
        obj2.method();
    }
    
}


// Conclusion : A public class followed by a public method can be imported or can be extended (or can be implemented if it's an inteface)
// then can be call through an object 