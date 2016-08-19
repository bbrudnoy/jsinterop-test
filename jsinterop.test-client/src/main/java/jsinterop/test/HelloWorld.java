package jsinterop.test;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 *
 */
@JsType(namespace = JsPackage.GLOBAL)
public class HelloWorld {

  public String hello = "Hello";
  public String world = "World";
}
