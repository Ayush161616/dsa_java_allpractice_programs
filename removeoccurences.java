public class removeoccurences {
    static  String remove(String s , int idx){
        if(idx==s.length()) return " ";
        String smallans = remove(s,idx+1);
        char currChar = s.charAt(idx);
        if(currChar!='a'){
            return currChar + smallans;

        }
        else {
            return smallans;
        }
    }
}
