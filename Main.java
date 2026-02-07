/*public class Main{
    public static void main(String[] args){
         System.out.println("hello world");
        int A = 2; int b=30;
        System.out.println(A+b);
//       for (int i = 10;i>=0;i--){
            if (A%2==0){
           System.out.println("even" +" "+A);
            }
            else{
                System.out.println("odd" +" "+A);
            }


               
        }
    }

public class Main {
    public static void main(String[] args) {
        // Type your code below
        String coddy = "I am learning to code with Coddy!";
        
        // Don't change the line below
        System.out.println("coddy = \"" + coddy + "\"");
    }
}
    
public class Main {
    public static void main(String[] args) {
        // Create your String variables below
        String firstName="Alex";
        int age =12;
        String city ="New York";
        String hobby="Playing Guitar";
        String greeting="Hello, nice to meet you!";
        String favoriteQuote="Life is like a box of chocolates";
        String mood = "Happy";
        
        
        // Don't modify the code below
        System.out.println("Name: " + firstName);
        System.out.println(age);
        System.out.println("City: " + city);
        System.out.println("Hobby: " + hobby);
        System.out.println("Greeting: " + greeting);
        System.out.println("Favorite Quote: " + favoriteQuote);
        System.out.println("Current Mood: " + mood);
    }
}

*/

// public class Main{
//     public static void main (String[] args){
//         int i;
//         int j;
//         for(i=1;i<9;i++){
//             for(j=1;j<i;j++){
//         System.out.print("*");
//             }
//         System.out.println();
//         }
//     }
// }
/* 

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner ov = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = ov.nextInt();
        System.out.println("AGE IS " +age);
        if (age >10)
        {
            for(int i=0;i<10;i++){
            System.out.println("adult");}
        }else{
            System.out.println("child");
        }
    }
}


public class Main{
    public static void main(String[] args){
        String name = "uday and kumar";
       // System.out.println(name.length());
      // System.out.println(name.charAt(2));
     // String name2=name.replace('y', 'k');
     // System.out.println(name2);
     System.out.println(name.substring(0,8));
    }
}

public class Main{
    public static void main(String[] args){
        int[] a ={1,2,7,3,4,5};
        int n=a.length+1;
        int m = n*(n+1)/2;
        int b = 0;
        for(int i=0;i<a.length;i++)
        {
            b = b + a[i];
        }
      System.out.printf("%d %d",m-b, a.length);
    }
}
/* 
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers: ");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd");
        }

    }
}
  
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the numbers: ");
        int n = sc.nextInt();//;
        //ad new
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
}
}


public class Main
{
    public static void main(String  [] args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
*/
// import java.util.Arrays;
// public class Main{
//     public static void main(String[] args){
//         int [] a = new int[3];
//         a[0]=4;
//         a[1]=2;
//         a[2]=3;
//         System.out.println(a[0]);
//         Arrays.sort(a); //sort
//         System.out.println(a[0]); //after sort
//     }
// }
//multidimentional array
public class Main{
   public static void main(String[] args){
    int [] [] a= {{1,2,3}, {1,4,5}};
    System.out.println(a[0][2]);
   }}