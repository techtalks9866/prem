package day6;

public class StaticMembers {
    final static String organaization = "TestOrg";

      static double tempCoverter(double fahrenheit){
        // calculate celsius temperature
        double celsius = (fahrenheit - 32) / 1.8;
        return celsius;
    }
}
