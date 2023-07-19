package com.onsoft.Exception;

public class ErrorEx {
  public void test1() {
	  test2();
  }
  public void test2() {
	  
	  test1();
  }
}
