package StringPrograms;

public class FirstRepetedCharecter {
    public static void main(String[] args) {
        String s="helloojj";
        char ch='\0';
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    ch=s.charAt(i);
                    break;//exit from innerloop if found

                }
            }
            if(ch !='\0'){
                break;//exit outerloop if found char
            }
        }
        if (ch != '\0') {
            System.out.println("First Repeated Character: " + ch);
        } else {
            System.out.println("No Repeated Character Found");
        }

    }
}
