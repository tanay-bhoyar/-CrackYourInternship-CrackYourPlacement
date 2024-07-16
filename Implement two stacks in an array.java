class twoStacks {
    
    List<Integer> check = new ArrayList<>();
    
    twoStacks() {
        check.add(-1);
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        check.add(0,x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        check.add(check.size(),x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(check.get(0)==-1){
            return -1;
        }else{
            return check.remove(0);
        }
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(check.get(check.size()-1)==-1){
            return -1;
        }else{
            return check.remove(check.size()-1);
        }
    }
}
