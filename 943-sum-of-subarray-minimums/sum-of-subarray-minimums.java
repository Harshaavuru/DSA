class Solution {
    public int sumSubarrayMins(int[] arr) {
        long mod=1000000007; 
        int n=arr.length; 
        int[] left=new int[n]; 
        int[] right=new int[n]; 
        Stack<Integer>empty=new Stack<>(); 
        for(int i=0;i<n;i++){ 
            while(!empty.isEmpty() && arr[empty.peek()]>arr[i]){ 
                empty.pop();
            }
            if(empty.isEmpty()){ 
                left[i]=i+1;
            }
            else{ 
                left[i]=i-empty.peek();
            }
            empty.push(i);
        }
        empty.clear();
        for(int i=n-1;i>=0;i--){ 
            while(!empty.isEmpty() && arr[empty.peek()]>=arr[i]){ 
                empty.pop();
            } 
            if(empty.isEmpty()){ 
                right[i]=n-i; 
            }
            else{ 
                right[i]=empty.peek()-i; 
            }
            empty.push(i);
        }
        long mainans=0; 
        for(int i=0;i<n;i++){ 
            long contribution=(long) arr[i]*left[i]*right[i];
            mainans=(mainans+contribution)%mod ;
        }
        return (int)mainans; 
    }
}