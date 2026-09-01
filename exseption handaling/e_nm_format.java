public class e_nm_format {
    public static void main(String[] args) {
        try {
           String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null.");

        }
         try{
            String str1 = "Hello";
            int num = Integer.parseInt(str1);
            System.out.println("Converted number: " + num);
         } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
         }
       
    }
}
