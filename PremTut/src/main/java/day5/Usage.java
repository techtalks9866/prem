package day5;

public class Usage {
    public static void main(String[] args) {
        BankUsage bankUsage = new BankUsage();
        ReferenceBank referenceBank = new ReferenceBank();
        bankUsage.test(referenceBank);

        HIJK hijk = new HIJK();
        bankUsage.test(hijk);

        DEFBank defBank =new DEFBank();
        bankUsage.test(defBank);























//        int           i             = 20;
        Bank bank = new ReferenceBank();
        //Up casting(automatic casting)

 //        int           i             = 20;
        ReferenceBank referenceBank3 = (ReferenceBank) bank;
        //Down casting(you need mention explicitely)

























        bank.credit(1234);

        //Data type                       Object type
        ReferenceBank referenceBank1 = new ReferenceBank();
        //Data type                  //another refernce type
        ReferenceBank referenceBank2 = referenceBank1;




//        Bank abstractClass = new AbstractClass();
//        abstractClass.credit();
//
//
//        Bank bank = new ConcreteClass();
//        bank.getAmount();
//
//
//
//
//
//        Constructordemo constructordemo = new Constructordemo();
//        Constructordemo constructordemo1 = new Constructordemo(123);
//
//        //Instance of
//        ConcreteClass concreteClass = (ConcreteClass) bank;
//        System.out.println(bank instanceof ConcreteClass);
        Bank abcBank = new ABCBank() {
            @Override
            public void credit(int amount) {

            }

            @Override
            void test() {

            }
        };
        System.out.println(abcBank.getAmount());
    }
}
