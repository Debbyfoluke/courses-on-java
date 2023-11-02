package java_course_part3.collections;

import java.util.Comparator;

public class EmailComparator  implements Comparator<Customer> {

    @Override
    public int compare(Customer customer, Customer t1) {
        return customer.getEmail().compareTo(Customer.getEmail());
    }
}
