public class FirstAddressExcercise {
   public static void main (String[] a){
         displayAddress();
   }
   
   public static void displayAddress(){
   
      String[] company = {
      "Xiaomi Company", 
      "68, Jiaoling Dong Road", 
      "Yizhuang, Beijing, China", 
      "Company: Xiaomi Inc."
      };
      
      for (int i = 0; i < 4; i++){
      System.out.println(company[i]);
      }
   }
}