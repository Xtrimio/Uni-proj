   public class ExampleClass {

        private int value = 0; 

        public ExampleClass () {
            value = 0; 
        }

        public ExampleClass (int i) {
            this.value = i;
        }

        public int getValue() {
            return value; 
        }

        public void setValue(int val) {
            this.value = val; 
        }

        public static void main(String[] args) {     
            ExampleClass example = new ExampleClass (20);
            example.setValue(20); 
            //Both lines above do same thing - why use constructor? 
            System.out.println(example.getValue());
        }
   }