package com.company;

import java.util.Comparator;
public class EmpComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof SalariedEmployee && o2 instanceof SalariedEmployee)
            return (int) ((((SalariedEmployee) o2).calculatePay()) - (((SalariedEmployee) o1).calculatePay()));
       else if (o1 instanceof ContractEmployee && o2 instanceof ContractEmployee)
            return (int) ((((ContractEmployee) o2).calculatePay()) - (((ContractEmployee) o1).calculatePay()));
      else   if (o1 instanceof SalariedEmployee && o2 instanceof ContractEmployee)
            return (int) ((((ContractEmployee) o2).calculatePay()) - (((SalariedEmployee) o1).calculatePay()));
      else
            return (int) ((((SalariedEmployee) o2).calculatePay()) - (((ContractEmployee) o1).calculatePay()));

    }
}
