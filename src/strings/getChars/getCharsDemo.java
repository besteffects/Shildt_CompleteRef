package strings.getChars;

public class getCharsDemo {
    public static void main(String[] args) {
        //start - index o the beginning of the substring
        // end - index that is one past to the end of the desired substring
        //buf[] - final array with the given number of chars
        // targetStart - and index within the target at which the substring will be copied
        String s= "This is a demo of the getChars method";
        int start =10;
        int end =14;
        char buf[] = new char[end-start];
        s.getChars(start,end,buf,0);
        System.out.println(buf);
    }
}
