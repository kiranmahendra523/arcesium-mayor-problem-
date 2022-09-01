import java.util.*;
class HelloWorld {
    static void solve(char[] s,List<char[]> lt,int n,int i){
        
        if(i>n){
            lt.add(s);
            return;
        }
        char[] temp = s; 
        for(int j=1;j<=i;j++){
            int l = s[j-1]-'0';
            int k = s[j]-'0';
            temp[j] = Character.forDigit((l^k),10);
        }
        System.out.println(s);
        solve(temp,lt,n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<char[]> lt = new ArrayList<>();
        int n = sc.nextInt();
        String s = "100000000000000000000000000000000000000000000";
        solve(s.toCharArray(),lt,n,2);
        int sum=0;
        int k=0;
        char []res = lt.get(0);
        for(int i=n-1;i>=0;i--){
            if(res[i]=='1'){
                sum=sum+(int)Math.pow(2,k);
            }
            k++;
        }
        System.out.println(sum);
    }
}
