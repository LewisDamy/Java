package services;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.ArrayList;
import java.util.List;

public class PrintService {

    List<Integer> list = new ArrayList<>();

    public void addValue(Integer value) {
        list.add(value);
    }
    public Integer first() {
        if(list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        return list.get(0);
    }

    public void print() {
        if (list.isEmpty()) {
            throw new IllegalStateException("List is empty");
        }
        System.out.println(list);
    }
}
