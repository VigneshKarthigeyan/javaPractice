public class warmUp4 {
    static long repeatedString(String s, long n) {
        if(s.equals("a")){
            return n;
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                count+=1;
            }
        }
        long rep=count*(n/s.length());
        long rem=n%s.length();
        for(int i=0;i<rem;i++){
            if(s.charAt(i)=='a'){
                rep+=1;
            }
        }
        return rep;
    }

    public static void main(String[] args) {
        long a=repeatedString("a",1000000000000);
        System.out.println(a);
    }
}
