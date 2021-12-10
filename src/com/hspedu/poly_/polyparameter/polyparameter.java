package com.hspedu.poly_.polyparameter;

public class polyparameter {
    public static void main(String[] args) {

       Worker jk = new Worker("jk", 20000);
       Manager michel = new Manager("michel", 40000, 20000);
        polyparameter polyparameter = new polyparameter();
        polyparameter.showEmpAnnual(jk);
        polyparameter.showEmpAnnual(michel);


    }
    public void showEmpAnnual(Employee e) {
        System.out.println(e.getAnnual());
    }

}



