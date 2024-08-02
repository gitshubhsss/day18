public class uppercase2 {
    public static String capitalizeTitle(String title) {
        
        int n=title.length();
        int index=0;
        String newTitle="";
        int length=0;
        for(int i=0;i<n;i++){
            //making first index in capital
            if(i==index){
                length++;
            }
            else if(length<=2){
                newTitle=newTitle+title.toLowerCase().charAt(i);
            }
            else if(title.charAt(i)==' '){
                newTitle=newTitle+title.charAt(i);
                index=i+1;
                length=0;
            }
            else{
                newTitle=newTitle+title.toLowerCase().charAt(i);
            }
        }
        return newTitle;
    }

    public static void main(String[] args) {
        String title="capiTalIze tHe titLe";
        System.out.println(capitalizeTitle(title));;
    }
}
