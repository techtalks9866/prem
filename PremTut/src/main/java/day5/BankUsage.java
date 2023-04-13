package day5;

public class BankUsage {

//      void test(Bank bank){
//          bank.credit(1234);
//      }
    void test(ReferenceBank obj){
        obj.credit(1234);
    }

    void test(ABCBank obj){
        obj.credit(1234);
    }

    void test(HIJK obj){
        obj.credit(1234);
    }
}
