/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gljava.opengl.ftgl;

public class FTGLBitmapFont extends FTFont {
  private long swigCPtr;

  protected FTGLBitmapFont(long cPtr, boolean cMemoryOwn) {
    super(SWIG_FTGLJNI.SWIGFTGLBitmapFontUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FTGLBitmapFont obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected FTGLBitmapFont() {
    this(0, false);
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      SWIG_FTGLJNI.delete_FTGLBitmapFont(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

public FTGLBitmapFont(String fontFilePath) throws FTGLException {
    this(SWIG_FTGLJNI.new_FTGLBitmapFont(fontFilePath), true);
    if (error() != 0) {
        throw new FTGLException("error, code=" + error());
    }
}
}