package com.src;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamMinMax {

@SuppressWarnings("unchecked")
public static void main(String[] args) {
@SuppressWarnings("rawtypes")
ArrayList ts=new ArrayList();
ts.add(new Students(1,"Meera","ak",90,92,78));
ts.add(new Students(2,"ashmika","bk",90,92,67));
ts.add(new Students(3,"priya","ck",85,58,47));
ts.add(new Students(4,"pooja","dk",89,78,99));
ts.add(new Students(5,"sai","ek",35,59,98));
ts.add(new Students(6,"ram","fk",60,55,98));
ts.add(new Students(7,"Madhura","gk",77,87,56));
ts.add(new Students(8,"kiran","hk",70,89,77));

Students s=(Students) ts.stream().max((i1,i2)->((Students) i1).compareTo(i2)).get();
System.out.println(s);

List<Students> l=(List<Students>) ts.stream().sorted((o1,o2)->((Students)o1).sname.length()>((Students)o2).sname.length()?-1:1).collect(Collectors.toList());
        System.out.println(l);
       
        List<Students> l1=(List<Students>) ts.stream().sorted((o1,o2)->((Students)o1).total/3>((Students)o2).total/3?-1:1).collect(Collectors.toList());
        System.out.println(l1);
}

}
