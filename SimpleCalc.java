public class SimpleCalc {
        
        int number1;
        int number2;
        
        public SimpleCalc(int n1, int n2) {
            number1 = n1;
            number2 = n2;
        }
        public int add() {
            return number1 + number2;
        }
        public int sub() {
            return number1 - number2;
        }
        public int mult() {
            return number1 * number2;
        }
        public double div() {
            return number1 / number2;
        }
    }