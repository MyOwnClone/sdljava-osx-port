/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package sdljava.x.swig;

public final class SDLPressedState {
  public final static SDLPressedState PRESSED = new SDLPressedState("PRESSED", 0x01);
  public final static SDLPressedState RELEASED = new SDLPressedState("RELEASED", 0x00);

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static SDLPressedState swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + SDLPressedState.class + " with value " + swigValue);
  }

  private SDLPressedState(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private SDLPressedState(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private static SDLPressedState[] swigValues = { PRESSED, RELEASED };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


