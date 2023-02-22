public class addcomplex {
    private int real;
    private int imag;
    public addcomplex(){
        this.real = 0;
        this.imag = 0;
    }
    public addcomplex(int real , int imag){
        this.real = real;
        this.imag = imag;

    }
    public  static addcomplex setNum(addcomplex o1 , addcomplex o2){
        addcomplex o3 = new addcomplex();
        o3.real = o1.real + o2.real;
        o3.imag = o1.imag + o2.imag;
        return o3;
    }
    public static void main(String[] args) {
        addcomplex obj = new addcomplex(2,3);
        addcomplex obj1 = new addcomplex(3,5);
        addcomplex object = setNum(obj , obj1);
        System.out.println("The addition is  " + object.real + " + i" + object.imag);

        

    }
}
