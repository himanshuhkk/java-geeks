class swap{
    public static void main(String[] args) {
        int a = 10 , b = 5;
        System.out.println("The value of a and b before swapping are : " + a +" and "+  b);
        // a = a+b;
        // b = a-b;
        // a = a-b;
        a = a^b^(b=a);
        System.out.println("The value of a and b after swapping are : " + a +" and "+  b);
    }
}