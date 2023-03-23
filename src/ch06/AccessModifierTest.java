package ch06;

public class AccessModifierTest {
  AccessModifier amf = new AccessModifier();

  // amf.privateVariable = 100; // private member는 클래스 밖에서 접근 안됨.
  // amf.defaultVariable = 200; // default member는 동일 패키지에서 접근할 수 있음.
  // amf.protectedVariable = 300; // protected member는 동일 패키지에서 접근할 수 있음.
  // amf.publicVariable = 400; // public member는 어디서든 접근할 수 있음.

  // amf.print();
  // output:
  /**
   * privateVariable: 0
   * defaultVariable: 200
   * protectedVariable: 300
   * publicVariable: 400
   */
}
