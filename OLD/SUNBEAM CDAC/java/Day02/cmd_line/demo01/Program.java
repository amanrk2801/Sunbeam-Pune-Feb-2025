class Program {
    public static void main(String[] arr) {
        if (arr.length < 2) {
            System.out.println("Pass atleast 2 arguments");
        } else {
            System.out.println("arr[0] - " + arr[0]);
            System.out.println("arr[1] - " + arr[1]);
            int n1 = Integer.parseInt(arr[0]); // unboxing
            int n2 = Integer.parseInt(arr[1]); // unboxing
            System.out.println("Addition = " + (n1 + n2));
        }
    }
}