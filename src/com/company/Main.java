package com.company;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int c = 0;
        try {
            c = calc.devide.apply(a, b); //3:0
        }catch (Exception e){
            System.out.println("Деление на 0!");
        }
        calc.println.accept(c);
    }
}
