public class Main {
  public static void main(String[] args) {
    int myNum = 5;               
    float myFloatNum = 5.99f;    
    char myLetter = 'D';        
    boolean myBool = true;       
    String myText = "Hello";        
    byte myNum1 = 100;
    short myNum2 = 455;
    int myNum3 = 1200;
    long myNum4 = 2927823L;
    float myNum5Quebrado = 929.7f;
    boolean isJavaFun = true;
    boolean isFishTasty = false; 
    int items = 50;
    float costPerItem = 9.99f;
    float totalCost = items * costPerItem;
    char currency = '$';
    float UltimoNumero = myNum2 * myNum2;
    
    System.out.println(isJavaFun);
    System.out.println(isFishTasty);
    System.out.println(myFloatNum);
    System.out.println(myLetter);
    System.out.println(myBool);
    System.out.println(myText);
    System.out.println(myNum1);
    System.out.println(myNum2);
    System.out.println(myNum3);
    System.out.println(myNum4);
    System.out.println(myNum5Quebrado);
    System.out.println(UltimoNumero);
    System.out.println("Number of items: " + items);
    System.out.println("Cost per item: " + costPerItem + currency);
    System.out.println("Total cost = " + totalCost + currency);
  }
}
