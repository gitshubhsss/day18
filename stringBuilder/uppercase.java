public class uppercase {
    public static String capitalizeTitle(String title) {
        
        int n=title.length();
        int index=0;
        String newTitle="";
        for(int i=0;i<n;i++){
            //making first index in capital
            if(i==index){
              newTitle=newTitle+title.toUpperCase().charAt(index);
            }
            
            else if(title.charAt(i)==' '){
                newTitle=newTitle+title.charAt(i);
                index=i+1;
            }
            else{
                newTitle=newTitle+title.toLowerCase().charAt(i);
            }
        }
        return newTitle;
    }
    public static void main(String[] args) {
        String title="hii i am shubham";
        System.out.println(capitalizeTitle(title));;
    }
}
