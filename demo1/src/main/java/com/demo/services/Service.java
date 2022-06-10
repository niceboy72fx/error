package com.demo.services;

import java.util.*;
import com.opencsv.bean.CsvBindByPosition;

public class Service {
      @CsvBindByPosition(position = 1)
      private static Date date;

      @CsvBindByPosition(position = 2)
      private static int open;

      @CsvBindByPosition(position = 3)
      private static int high;

      @CsvBindByPosition(position = 4)
      private static int low;

      @CsvBindByPosition(position = 5)
      private static int close;

      @CsvBindByPosition(position = 6)
      private static int volume;

      @CsvBindByPosition(position = 7)
      private static String currency;

      public Service() {

      }

      public static Date getDate() {
            return date;
      }

      public static void setDate(Date date) {
            Service.date = date;
      }

      public static int getOpen() {
            return open;
      }

      public static void setOpen(int open) {
            Service.open = open;
      }

      public static int getHigh() {
            return high;
      }

      public static void setHigh(int high) {
            Service.high = high;
      }

      public static int getLow() {
            return low;
      }

      public static void setLow(int low) {
            Service.low = low;
      }

      public static int getClose() {
            return close;
      }

      public static void setClose(int close) {
            Service.close = close;
      }

      public static int getVolume() {
            return volume;
      }

      public static void setVolume(int volume) {
            Service.volume = volume;
      }

      public static String getCurrency() {
            return currency;
      }

      public static void setCurrency(String currency) {
            Service.currency = currency;
      }
}
