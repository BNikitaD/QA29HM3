package lesson4;

public class Class2QA29 {
    public static void main(String[] args) {

        int [] mass = new int[] {2,4,6,8,10};

       int colichestvo = mass.length;
       int sum = 0;
       int max = 0;
       int min = 0;

       for (int number : mass){
           sum=sum+number;
       }
       for(int number : mass){
           if(number> max){
               max = number;
           }
       }
       for(int number : mass){
           if(number<min){
               min = number;
           }
       }


       System.out.println(colichestvo);
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);

    }
}
