public class Largestofthree {
    public static void main(String[]args){
        int a=10;
        int b=15;
        int c=18;
        if(a>b && a>c){
            System.out.println("the larges number is:" +a);
        }
        else if(b>a && b>c){
            System.out.println("the largest number is:" +b);
        }
        else{
            System.out.println("the largest number is:" +c);
        }
    }
    
}
