public class warmUp3 {
    static int jumpingOnClouds(int[] c) {
        int count=0;
        for(int i=0;i<c.length-1;i++){
            if(i<c.length-2 && c[i+2]==0){
                count+=1;
                i+=1;
            }
            else {
                count+=1;
            }
        }
//        if(c[c.length-3]==1){
//            count+=1;
//        }
        return count;
    }

    public static void main(String[] args) {
        int a[]={0,0,1,0,0,1,0,0};
        int b=jumpingOnClouds(a);
        System.out.println(b);
    }
}
