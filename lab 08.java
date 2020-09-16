public class Recursion{
   public static int power(int base, int exp){
      if(exp == 0) {
         return 1;
      }
      if(exp == 1) {
         return base;
      }
      return base * power(base, exp-1);
   }

   public static int count(int num, int target){
      if(!(num % 10 == target)) {
         return 0;
      }
     
      return 1 + count(num/10,target);
   }
   
   public static int sumDigits(int num){
      if(num/10 == 0){
         return num%10;
      }
      return (num%10 + sumDigits(num/10));
   }
   
   public static int count(String str, char target){
      if(!(str.charAt(0) == target)){
        return 0; 
      }
      return 1 + count(str.substring(1),target);
   }
   
   /*public static int replace(String str, char from, char to){
      if(!str.charAt(0) == from){
         return 
      }
   }
   */
   public static void main(String[] args) {
   System.out.println(power(2, 3));
   System.out.println(count(2000,3));
   System.out.println(sumDigits(20));
   System.out.println(count("aabbcc",'a'));
   
   }
}
