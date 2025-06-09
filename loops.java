public class loops {
    public static void main(String[] args) {
        int sum=0;
        //while(i>0){
          //System.out.println(i);
          //i=i-1;
          for(int i=0;i<100;i++){
             if(i==55){
                continue;
             }
             sum=sum+i;
          }
          System.out.println(sum);
    }
  }

