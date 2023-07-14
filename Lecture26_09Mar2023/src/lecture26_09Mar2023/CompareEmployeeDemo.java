package lecture26_09Mar2023;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CompareEmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Matthew", 37, "FT");
        Employee e2 = new Employee("Alice", 45, "PT");
        Employee e3 = new Employee("Bob", 88, "FT");
        Employee e4 = new Employee("Zach", 19, "PT");
        List<Employee> staffList = new LinkedList<Employee>();
        staffList.add(e1);
        staffList.add(e2);
        staffList.add(e3);
        staffList.add(e4);
        
        
        Collections.sort(staffList, new CompareEmpByStatus());
        
        showAll(staffList);
    }
    
    
    
    public static void showAll(Collection<Employee> inputList) {
        for (Employee value : inputList) {
            System.out.println(value.toString());
        }
        System.out.println("*****");
    }
}
