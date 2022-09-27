public class Exp3que4 {
        int num = 41;
        int sum = 0;
        public int sum(){
            while (num > 40 && num < 250) {
                if (num % 5 == 0) {
                    sum = sum + num;
                }
                num++;
            }
            return sum;
        }
    public static void main(String[] args) {
        Exp3que4 obj = new Exp3que4();
        System.out.println(obj.sum());
    }
}


