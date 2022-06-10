package com.demo;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import com.demo.services.Service;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

public class Main {
   public  static void main(String[] args) throws IOException , CsvException {
           String csvFile = "Zcash.csv";
           List<Service> beans = new CsvToBeanBuilder(new FileReader(csvFile))
                   .withType(Service.class)
                   .build()
                   .parse();


       beans.forEach(System.out::println);
   }
}