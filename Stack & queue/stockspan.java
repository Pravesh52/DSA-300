import java.util.Stack;

public class stockspan {
    static class Pair{
        int price;
        int span;

        Pair(int price, int span){
            this.price=price;
            this.span=span;
        }
    }
    public static void main(String[] args) {
        int prices[]={100, 80, 60, 70, 60, 75, 85};
        Stack<Pair>stack=new Stack<>();
        
        for(int price: prices){
            int span=1;
            while(!stack.isEmpty() && stack.peek().price<=price){
                span+=stack.peek().span;
                stack.pop();
            }

            // push current price and span

            stack.push(new Pair(price, span));

            // print span

            System.out.println(span+" ");
            
        }


    }
}
