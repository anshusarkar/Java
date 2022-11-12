class this_to_pass_as_argument_in_the_constructor_call
{  
    this_to_pass_as_argument_in_the_constructor_call obj;  
    this_to_pass_as_argument_in_the_constructor_call(this_to_pass_as_argument_in_the_constructor_call obj){  
      this.obj=obj;  
    }  
    void display(){  
      System.out.println(obj.data);//using data member of A4 class  
    }  
    
     
    int data=10;  
    this_to_pass_as_argument_in_the_constructor_call(){  
        this_to_pass_as_argument_in_the_constructor_call b = new this_to_pass_as_argument_in_the_constructor_call(this);  
     b.display();  
    }  
    public static void main(String[] args){  
        this_to_pass_as_argument_in_the_constructor_call a=new this_to_pass_as_argument_in_the_constructor_call();  
  }  
}
  