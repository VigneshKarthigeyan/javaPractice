
public class warmUp2 {
    static int countingValleys(int n, String s) {
        int count1=0,count2=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='U'){
                count1+=1;
            }
            else if(s.charAt(i)=='D'){
                count1-=1;
                if(count1==-1){
                    count2+=1;
                }
            }

        }
        return count2;

    }

    public static void main(String[] args) {
        int a=countingValleys(8,"UDDDUDUU");
        System.out.println(a);
    }
}
