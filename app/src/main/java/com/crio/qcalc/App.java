
package com.crio.qcalc;


public class App {


    public static void main(String[] args) {

        System.out.println("Starting QCalc..");

        StandardCalculator calc = new StandardCalculator();

        calc.add(1, 2);

        System.out.println(calc.getResult());


        // StandardCalculator calc = new StandardCalculator();

        // calc.add(Double.MAX_VALUE, 1.0);

        // calc.printResult();

        // // StandardCalculator calc = new StandardCalculator();

        // calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

        // calc.printResult();


        LogicCalculator calc_l = new LogicCalculator();

        calc_l.OR(8, 6);

        calc_l.printResult();
        calc_l.AND(8, 6);

        calc_l.printResult();



    }

    public String getGreeting() {
        return "Welcome to Calculator QCalc";
    }


}
