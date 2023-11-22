public class StringReverse {
    public static void main(String[] args){
        String str = "IPL-is-worst-game:to-watch";
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        String str2 = sb.toString();
        System.out.println(sb.toString());
    }
}
