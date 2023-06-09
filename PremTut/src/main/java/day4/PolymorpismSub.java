package day4;

public class PolymorpismSub extends PolymorpismSuper {

    //One can have many forms
    //Overloading - compile time
    //OverRiding - runtime time
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }

    @Override
    void superMethod(){
        System.out.println("I am sub method");
        //10 lines
    }
}
