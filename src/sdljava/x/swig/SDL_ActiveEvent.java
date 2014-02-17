/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package sdljava.x.swig;

public class SDL_ActiveEvent {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected SDL_ActiveEvent(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SDL_ActiveEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      SWIG_SDLEventJNI.delete_SDL_ActiveEvent(swigCPtr);
    }
    swigCPtr = 0;
  }

  public void setType(short type) {
    SWIG_SDLEventJNI.set_SDL_ActiveEvent_type(swigCPtr, type);
  }

  public short getType() {
    return SWIG_SDLEventJNI.get_SDL_ActiveEvent_type(swigCPtr);
  }

  public void setGain(short gain) {
    SWIG_SDLEventJNI.set_SDL_ActiveEvent_gain(swigCPtr, gain);
  }

  public short getGain() {
    return SWIG_SDLEventJNI.get_SDL_ActiveEvent_gain(swigCPtr);
  }

  public void setState(short state) {
    SWIG_SDLEventJNI.set_SDL_ActiveEvent_state(swigCPtr, state);
  }

  public short getState() {
    return SWIG_SDLEventJNI.get_SDL_ActiveEvent_state(swigCPtr);
  }

  public SDL_ActiveEvent() {
    this(SWIG_SDLEventJNI.new_SDL_ActiveEvent(), true);
  }

}
