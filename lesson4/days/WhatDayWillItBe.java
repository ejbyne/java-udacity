public class WhatDayWillItBe
{
  public static void main(String[] args)
  {
    Day birthday = new Day(1989, 7, 1);
    Day referenceDay = new Day(1900, 1, 1);
    int weekday = (birthday.daysFrom(referenceDay) + 1) % 7;
    System.out.print("Weekday: ");
    System.out.println(weekday);
  }
}
