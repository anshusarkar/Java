class CallByvalue {
    int data = 50; 
    void change(int data) {
        data = data + 100;
    }

    public static void main(String[] args) {
        CallByvalue cv = new CallByvalue();
        System.out.println("Value before change : " + cv.data); 
        cv.change(500);
        System.out.println("Value after change : " + cv.data); //No change will take place in the instance varriabel as in the method the value 
    }
}