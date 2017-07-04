import java.util.*;

 class Main {

    public static void main(String[] args) {
        Stack<Integer>st = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();
        st.push(a[0]);
        int curr = 0;
        int maxi = 0;
        int top = 0;
        for(int i=1;i<n;i++)
        {
            curr = a[i];
            if(!st.empty())
            {
                while(true)
                {
                    if(st.empty())
                        break;
                    if(curr>=maxi)
                    {
                        maxi = curr;
                        System.out.print(maxi+" ");
                        st.pop(); //throw
                    }
                    else
                        break;
                }    
            }
            st.push(curr);
            
        }
        while(true)
        {
            if(st.empty())
                break;
            st.pop();
            System.out.print("-1 ");
        }
    }
}