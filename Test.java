public class Test {
    public static void main(String[] args) {
        if(args.length>0){
            System.out.println("The command line argument is: ");
            for(String val: args){
                System.out.println(val);
            }
        }
        else{
            System.out.println("The command line argument doesn't exit");
        }
    }
}
