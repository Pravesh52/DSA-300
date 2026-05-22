import java.util.Stack;

public class largesthistogram {
    public static void main(String[] args) {

        int height[]={2,1,5,6,2,3};
        Stack<Integer>stack=new Stack<>();
        int maxarea=0;
    

        int n=height.length;

        for(int i=0;i<=n;i++){
            int currheight;

            if(i==n){
                currheight=0;
            }else{
                currheight=height[i];
            }

            while(!stack.isEmpty() && currheight<height[stack.peek()]){
                int width;
                int h=height[stack.pop()];

                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                
                maxarea=Math.max(maxarea, h*width);
            }
            stack.push(i);
        }

        System.out.println(maxarea+" ");

        
    }
}
