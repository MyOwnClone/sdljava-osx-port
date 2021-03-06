/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gljava.opengl.ftgl;

public class FTGLTextureFont extends FTFont {
  private long swigCPtr;

  protected FTGLTextureFont(long cPtr, boolean cMemoryOwn) {
    super(SWIG_FTGLJNI.SWIGFTGLTextureFontUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FTGLTextureFont obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected FTGLTextureFont() {
    this(0, false);
  }

  protected void finalize() {
    delete();
  }

  public void delete() {
    if(swigCPtr != 0 && swigCMemOwn) {
      swigCMemOwn = false;
      SWIG_FTGLJNI.delete_FTGLTextureFont(swigCPtr);
    }
    swigCPtr = 0;
    super.delete();
  }

  public FTGLTextureFont(String fontFilePath) {
    this(SWIG_FTGLJNI.new_FTGLTextureFont__SWIG_0(fontFilePath), true);
  }

  public FTGLTextureFont(SWIGTYPE_p_unsigned_char pBufferBytes, int bufferSizeInBytes) {
    this(SWIG_FTGLJNI.new_FTGLTextureFont__SWIG_1(SWIGTYPE_p_unsigned_char.getCPtr(pBufferBytes), bufferSizeInBytes), true);
  }

  public boolean faceSize(long size, long res) {
    return SWIG_FTGLJNI.FTGLTextureFont_FaceSize(swigCPtr, size, res);
  }

  public void render(String string) {
    SWIG_FTGLJNI.FTGLTextureFont_Render__SWIG_0(swigCPtr, string);
  }

  public void render(SWIGTYPE_p_wchar_t string) {
    SWIG_FTGLJNI.FTGLTextureFont_Render__SWIG_1(swigCPtr, SWIGTYPE_p_wchar_t.getCPtr(string));
  }


}