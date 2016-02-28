
public class C_StringReverse {
    public static String get(String forward) {
        if(forward == null ){
        	return null;
        }
        if(forward.equals("")){
        	return "";
        }

        char[] ch = forward.toCharArray();
        for(int i=0; i<ch.length/2; i++){
            char temp = ch[ch.length-1-i];
        	ch[ch.length-1-i] = ch[i];
        	ch[i] = temp;
        }
        return String.copyValueOf(ch);
    }
}
