package com.bruce.app;

import com.bruce.proto.v1.Foo;

public final class App {
  private App() {}

  public static void main(String[] args) {
    final Foo foo = Foo.newBuilder().setBaz("qux").build();
  }
}
