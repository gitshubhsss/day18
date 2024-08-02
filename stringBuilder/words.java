import java.util.Arrays;

public class words {
    public static void main(String[] args) {
         String text = "First leTTeR of EACH Word";
        String[] words = text.split("\\s+"); // Splits the string by whitespace
        String suString="";
        // Print each word
       int i=0;
       while (i<words.length) {

        if(words[i].length()<=2){
            for(int j=i;j<words[i].length();j++){
                suString=suString+text.toLowerCase().charAt(j);
            }
        }

        if(words[i].length()>2){
            for(int j=i;j<words[i].length();j++){
                if(i==j){
                    suString=suString+text.toUpperCase().charAt(j);
                }
                else{
                    suString=suString+text.toLowerCase().charAt(j);
                }
            }
        }

       

        i++;
       }
        
        // Alternatively, you can use Arrays.toString to print the entire array
       
    }
}
