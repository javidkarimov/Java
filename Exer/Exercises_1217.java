package exercises;

/**
 *
 * @author JavKa
 * You can take exercises from: https://www.w3resource.com/java-exercises/conditional-statement/index.php
 */
public class Exercises {

    public static void main(String[] args) {

        System.out.println("You Can Find Given Exercises Solution");
        System.out.println("");
        exercise_14();
        exercise_15();
        exercise_16();
        exercise_17();
        exercise_18();
    }

    public static void exercise_14() {
        System.out.println("********** Exercise 14 **********");
        int given=5;//Bunu Scanner ile yaza bilerdim ki input value-nu colden gotursun. Amma hele kecmemisik deye yazmadim
        for(int reqem = 0;reqem<5;reqem++){
            System.out.println(given+" "+"X"+" "+reqem+" = "+given*reqem);
            
        }
        System.out.println("******************************");
        System.out.println("");
    }

    public static void exercise_15() {
        System.out.println("********** Exercise 15 **********");
        int given=5;
        int sum=0;
        int size=given*2;
        System.out.println("The odd numbers are :");
        for(int i=1;i<size;i+=2){
        System.out.println(i);
        sum=sum+i;
        }
        System.out.println("The Sum of odd Natural Number upto "+given+" terms is: "+sum);
        System.out.println("******************************");
        System.out.println("");

        
    }
    
    public static void exercise_16() {
        System.out.println("********** Exercise 16 **********");
         for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
        }
        System.out.println("");
        System.out.println("******************************");
        System.out.println("");

    }
    
     public static void exercise_17() {
        System.out.println("********** Exercise 17 **********");
         for (int i = 1; i <5; i++) {
            System.out.println("");
            for (int j = 1; j <= i; j++) {
                System.out.print(i);

            }
        }
        System.out.println("");
        System.out.println("******************************");
        System.out.println("");

    }
      public static void exercise_18(){
        System.out.println("********** Exercise 18 **********");
         int eded1 = 1;
        int eded2 = 2;
        for (int i = 1; i <=4; i++) {
            System.out.println("");
            for (int j = eded1; j < eded2; j++) {
                System.out.print(j+" ");
            }
            eded1 = eded1 + i;
            eded2 = eded2 + i+1;
        }
        System.out.println("");
    
        System.out.println("******************************");
        System.out.println("");

    }
//       public static void exercise_19(){
//        System.out.println("********** Exercise 19 **********");
//        int given=5;//Bunu Scanner ile yaza bilerdim ki input value-nu colden gotursun. Amma hele kecmemisik deye yazmadim
//       
//        System.out.println("******************************");
//        System.out.println("");
//
//    }
    
}
