package day5;

import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class subarrayWithsum{

        public static void main(String[] args) {
            LinkedList<String> list1 = new LinkedList<>();
            list1.add("A");
            list1.add("B");
            list1.add("C");

            LinkedList<String> list2 = new LinkedList<>();
            list2.add("D");
            list2.add("E");

            list1.addAll(1, list2);

            System.out.println(list1);
        }


}