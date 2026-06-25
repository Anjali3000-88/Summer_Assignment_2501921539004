import java.util.Stack;
public class temp {
    Stack<Integer> helperstack = new Stack<>();
    int n = temperature.length;
    int[] ans = new int[n];
    for (int i = n - 1; i >= 0; i--) {
        while (!helperstack.isEmpty() && temperature[i] >= temperature[helperstack.peek()]) {
            helperstack.pop();
        }
        if (!helperstack.isEmpty()) {
            ans[i] = helperstack.peek() - i;
        } 
        helperstack.push(i);
        }
    
    return ans;
}
