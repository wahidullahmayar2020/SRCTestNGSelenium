package class25.overriding;

public class KhadijaTester {
    public static void main(String[] args) {
        Object [] arr={new String("Test"),new Khadija("ksdk"),}
        /*KFather obj1=new Ozoda("Ozoda");
        obj1.eat();
        obj1.sleep();*/
       // String as=new Khadija("name"); CE because no inheritance relationship
       // executeAllMethods(new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khadija"));
        KFather[] kFatherArr={new KFather("Mirza"),new Ozoda("Ozoda"),new Khadija("Khadija")};
        executeAllMethods(kFatherArr);
    }

    static void  executeAllMethods(KFather kFather,Ozoda ozoda,Khadija khadija){

        kFather.eat();
        kFather.sleep();
        ozoda.eat();
        ozoda.sleep();
        khadija.eat();
        khadija.sleep();
    }

    static  void executeAllMethods(KFather [] kFatherArr){

        for (KFather kFather:kFatherArr
             ) {
            kFather.sleep();
            kFather.eat();
        }
    }
}
