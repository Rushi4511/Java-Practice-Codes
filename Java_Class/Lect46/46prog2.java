class Outer {

    Outer() {
        System.out.println("Outer Const");
    }

    void fun() {
        // This is a local inner class
        class Inner1 {
            Inner1() {
                System.out.println("Inner1 const");
            }
            void create(){
            void createInner2() {
                // Another local inner class within Inner1
                class Inner2 {
                    Inner2() {
                        System.out.println("Inner2 Const");
                    }
                }

                Inner2 inner2 = new Inner2();
            }
	    }

            // This is a nested inner class within Inner1
            class Inner3 {
                Inner3() {
                    System.out.println("Inner3 const");
                }
            }
        }

        Inner1 inner1 = new Inner1();
        inner1.createInner2();
        Inner1.Inner3 inner3 = inner1.new Inner3();
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.fun();
    }
}
