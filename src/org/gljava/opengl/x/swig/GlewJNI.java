/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version: 1.3.22
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.gljava.opengl.x.swig;

import java.nio.*;

public class GlewJNI {

  static {
    try {
      // if set don't loadLibrary ourselves, let client of library do it
      if (System.getProperty("sdljava.bootclasspath") == null &&
	  System.getProperty("gljava.bootclasspath") == null) {
	System.loadLibrary(System.getProperty("user.dir")+ "/" + "libgljava.so");
	    
	SWIG_glew_init();
      }

    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load. \n" + e);
      System.exit(1);
    }
  }

  public final static native long SWIG_glew_init();
  public final static native ShortBuffer glewGetErrorString(long jarg1);
  public final static native void glClearIndex(float jarg1);
  public final static native void glClearColor(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glClear(long jarg1);
  public final static native void glIndexMask(long jarg1);
  public final static native void glColorMask(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glAlphaFunc(long jarg1, float jarg2);
  public final static native void glBlendFunc(long jarg1, long jarg2);
  public final static native void glLogicOp(long jarg1);
  public final static native void glCullFace(long jarg1);
  public final static native void glFrontFace(long jarg1);
  public final static native void glPointSize(float jarg1);
  public final static native void glLineWidth(float jarg1);
  public final static native void glLineStipple(int jarg1, int jarg2);
  public final static native void glPolygonMode(long jarg1, long jarg2);
  public final static native void glPolygonOffset(float jarg1, float jarg2);
  public final static native void glPolygonStipple(ShortBuffer jarg1);
  public final static native void glGetPolygonStipple(ShortBuffer jarg1);
  public final static native void glEdgeFlag(short jarg1);
  public final static native void glEdgeFlagv(ShortBuffer jarg1);
  public final static native void glScissor(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glClipPlane(long jarg1, DoubleBuffer jarg2);
  public final static native void glGetClipPlane(long jarg1, DoubleBuffer jarg2);
  public final static native void glDrawBuffer(long jarg1);
  public final static native void glReadBuffer(long jarg1);
  public final static native void glEnable(long jarg1);
  public final static native void glDisable(long jarg1);
  public final static native short glIsEnabled(long jarg1);
  public final static native void glEnableClientState(long jarg1);
  public final static native void glDisableClientState(long jarg1);
  public final static native void glGetBooleanv(long jarg1, ShortBuffer jarg2);
  public final static native void glGetDoublev(long jarg1, DoubleBuffer jarg2);
  public final static native void glGetFloatv(long jarg1, FloatBuffer jarg2);
  public final static native void glGetIntegerv(long jarg1, IntBuffer jarg2);
  public final static native void glPushAttrib(long jarg1);
  public final static native void glPopAttrib();
  public final static native void glPushClientAttrib(long jarg1);
  public final static native void glPopClientAttrib();
  public final static native int glRenderMode(long jarg1);
  public final static native long glGetError();
  public final static native ShortBuffer glGetString(long jarg1);
  public final static native void glFinish();
  public final static native void glFlush();
  public final static native void glHint(long jarg1, long jarg2);
  public final static native void glClearDepth(double jarg1);
  public final static native void glDepthFunc(long jarg1);
  public final static native void glDepthMask(short jarg1);
  public final static native void glDepthRange(double jarg1, double jarg2);
  public final static native void glClearAccum(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glAccum(long jarg1, float jarg2);
  public final static native void glMatrixMode(long jarg1);
  public final static native void glOrtho(double jarg1, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native void glFrustum(double jarg1, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6);
  public final static native void glViewport(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glPushMatrix();
  public final static native void glPopMatrix();
  public final static native void glLoadIdentity();
  public final static native void glLoadMatrixd(DoubleBuffer jarg1);
  public final static native void glLoadMatrixf(FloatBuffer jarg1);
  public final static native void glMultMatrixd(DoubleBuffer jarg1);
  public final static native void glMultMatrixf(FloatBuffer jarg1);
  public final static native void glRotated(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void glRotatef(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glScaled(double jarg1, double jarg2, double jarg3);
  public final static native void glScalef(float jarg1, float jarg2, float jarg3);
  public final static native void glTranslated(double jarg1, double jarg2, double jarg3);
  public final static native void glTranslatef(float jarg1, float jarg2, float jarg3);
  public final static native short glIsList(long jarg1);
  public final static native void glDeleteLists(long jarg1, int jarg2);
  public final static native long glGenLists(int jarg1);
  public final static native void glNewList(long jarg1, long jarg2);
  public final static native void glEndList();
  public final static native void glCallList(long jarg1);
  public final static native void glCallLists(int jarg1, long jarg2, Buffer jarg3);
  public final static native void glListBase(long jarg1);
  public final static native void glBegin(long jarg1);
  public final static native void glEnd();
  public final static native void glVertex2d(double jarg1, double jarg2);
  public final static native void glVertex2f(float jarg1, float jarg2);
  public final static native void glVertex2i(int jarg1, int jarg2);
  public final static native void glVertex2s(short jarg1, short jarg2);
  public final static native void glVertex3d(double jarg1, double jarg2, double jarg3);
  public final static native void glVertex3f(float jarg1, float jarg2, float jarg3);
  public final static native void glVertex3i(int jarg1, int jarg2, int jarg3);
  public final static native void glVertex3s(short jarg1, short jarg2, short jarg3);
  public final static native void glVertex4d(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void glVertex4f(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glVertex4i(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glVertex4s(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glVertex2dv(DoubleBuffer jarg1);
  public final static native void glVertex2fv(FloatBuffer jarg1);
  public final static native void glVertex2iv(IntBuffer jarg1);
  public final static native void glVertex2sv(ShortBuffer jarg1);
  public final static native void glVertex3dv(DoubleBuffer jarg1);
  public final static native void glVertex3fv(FloatBuffer jarg1);
  public final static native void glVertex3iv(IntBuffer jarg1);
  public final static native void glVertex3sv(ShortBuffer jarg1);
  public final static native void glVertex4dv(DoubleBuffer jarg1);
  public final static native void glVertex4fv(FloatBuffer jarg1);
  public final static native void glVertex4iv(IntBuffer jarg1);
  public final static native void glVertex4sv(ShortBuffer jarg1);
  public final static native void glNormal3b(byte jarg1, byte jarg2, byte jarg3);
  public final static native void glNormal3d(double jarg1, double jarg2, double jarg3);
  public final static native void glNormal3f(float jarg1, float jarg2, float jarg3);
  public final static native void glNormal3i(int jarg1, int jarg2, int jarg3);
  public final static native void glNormal3s(short jarg1, short jarg2, short jarg3);
  public final static native void glNormal3bv(ByteBuffer jarg1);
  public final static native void glNormal3dv(DoubleBuffer jarg1);
  public final static native void glNormal3fv(FloatBuffer jarg1);
  public final static native void glNormal3iv(IntBuffer jarg1);
  public final static native void glNormal3sv(ShortBuffer jarg1);
  public final static native void glIndexd(double jarg1);
  public final static native void glIndexf(float jarg1);
  public final static native void glIndexi(int jarg1);
  public final static native void glIndexs(short jarg1);
  public final static native void glIndexub(short jarg1);
  public final static native void glIndexdv(DoubleBuffer jarg1);
  public final static native void glIndexfv(FloatBuffer jarg1);
  public final static native void glIndexiv(IntBuffer jarg1);
  public final static native void glIndexsv(ShortBuffer jarg1);
  public final static native void glIndexubv(ShortBuffer jarg1);
  public final static native void glColor3b(byte jarg1, byte jarg2, byte jarg3);
  public final static native void glColor3d(double jarg1, double jarg2, double jarg3);
  public final static native void glColor3f(float jarg1, float jarg2, float jarg3);
  public final static native void glColor3i(int jarg1, int jarg2, int jarg3);
  public final static native void glColor3s(short jarg1, short jarg2, short jarg3);
  public final static native void glColor3ub(short jarg1, short jarg2, short jarg3);
  public final static native void glColor3ui(long jarg1, long jarg2, long jarg3);
  public final static native void glColor3us(int jarg1, int jarg2, int jarg3);
  public final static native void glColor4b(byte jarg1, byte jarg2, byte jarg3, byte jarg4);
  public final static native void glColor4d(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void glColor4f(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glColor4i(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glColor4s(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glColor4ub(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glColor4ui(long jarg1, long jarg2, long jarg3, long jarg4);
  public final static native void glColor4us(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glColor3bv(ByteBuffer jarg1);
  public final static native void glColor3dv(DoubleBuffer jarg1);
  public final static native void glColor3fv(FloatBuffer jarg1);
  public final static native void glColor3iv(IntBuffer jarg1);
  public final static native void glColor3sv(ShortBuffer jarg1);
  public final static native void glColor3ubv(ShortBuffer jarg1);
  public final static native void glColor3uiv(IntBuffer jarg1);
  public final static native void glColor3usv(IntBuffer jarg1);
  public final static native void glColor4bv(ByteBuffer jarg1);
  public final static native void glColor4dv(DoubleBuffer jarg1);
  public final static native void glColor4fv(FloatBuffer jarg1);
  public final static native void glColor4iv(IntBuffer jarg1);
  public final static native void glColor4sv(ShortBuffer jarg1);
  public final static native void glColor4ubv(ShortBuffer jarg1);
  public final static native void glColor4uiv(IntBuffer jarg1);
  public final static native void glColor4usv(IntBuffer jarg1);
  public final static native void glTexCoord1d(double jarg1);
  public final static native void glTexCoord1f(float jarg1);
  public final static native void glTexCoord1i(int jarg1);
  public final static native void glTexCoord1s(short jarg1);
  public final static native void glTexCoord2d(double jarg1, double jarg2);
  public final static native void glTexCoord2f(float jarg1, float jarg2);
  public final static native void glTexCoord2i(int jarg1, int jarg2);
  public final static native void glTexCoord2s(short jarg1, short jarg2);
  public final static native void glTexCoord3d(double jarg1, double jarg2, double jarg3);
  public final static native void glTexCoord3f(float jarg1, float jarg2, float jarg3);
  public final static native void glTexCoord3i(int jarg1, int jarg2, int jarg3);
  public final static native void glTexCoord3s(short jarg1, short jarg2, short jarg3);
  public final static native void glTexCoord4d(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void glTexCoord4f(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glTexCoord4i(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glTexCoord4s(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glTexCoord1dv(DoubleBuffer jarg1);
  public final static native void glTexCoord1fv(FloatBuffer jarg1);
  public final static native void glTexCoord1iv(IntBuffer jarg1);
  public final static native void glTexCoord1sv(ShortBuffer jarg1);
  public final static native void glTexCoord2dv(DoubleBuffer jarg1);
  public final static native void glTexCoord2fv(FloatBuffer jarg1);
  public final static native void glTexCoord2iv(IntBuffer jarg1);
  public final static native void glTexCoord2sv(ShortBuffer jarg1);
  public final static native void glTexCoord3dv(DoubleBuffer jarg1);
  public final static native void glTexCoord3fv(FloatBuffer jarg1);
  public final static native void glTexCoord3iv(IntBuffer jarg1);
  public final static native void glTexCoord3sv(ShortBuffer jarg1);
  public final static native void glTexCoord4dv(DoubleBuffer jarg1);
  public final static native void glTexCoord4fv(FloatBuffer jarg1);
  public final static native void glTexCoord4iv(IntBuffer jarg1);
  public final static native void glTexCoord4sv(ShortBuffer jarg1);
  public final static native void glRasterPos2d(double jarg1, double jarg2);
  public final static native void glRasterPos2f(float jarg1, float jarg2);
  public final static native void glRasterPos2i(int jarg1, int jarg2);
  public final static native void glRasterPos2s(short jarg1, short jarg2);
  public final static native void glRasterPos3d(double jarg1, double jarg2, double jarg3);
  public final static native void glRasterPos3f(float jarg1, float jarg2, float jarg3);
  public final static native void glRasterPos3i(int jarg1, int jarg2, int jarg3);
  public final static native void glRasterPos3s(short jarg1, short jarg2, short jarg3);
  public final static native void glRasterPos4d(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void glRasterPos4f(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glRasterPos4i(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glRasterPos4s(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glRasterPos2dv(DoubleBuffer jarg1);
  public final static native void glRasterPos2fv(FloatBuffer jarg1);
  public final static native void glRasterPos2iv(IntBuffer jarg1);
  public final static native void glRasterPos2sv(ShortBuffer jarg1);
  public final static native void glRasterPos3dv(DoubleBuffer jarg1);
  public final static native void glRasterPos3fv(FloatBuffer jarg1);
  public final static native void glRasterPos3iv(IntBuffer jarg1);
  public final static native void glRasterPos3sv(ShortBuffer jarg1);
  public final static native void glRasterPos4dv(DoubleBuffer jarg1);
  public final static native void glRasterPos4fv(FloatBuffer jarg1);
  public final static native void glRasterPos4iv(IntBuffer jarg1);
  public final static native void glRasterPos4sv(ShortBuffer jarg1);
  public final static native void glRectd(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void glRectf(float jarg1, float jarg2, float jarg3, float jarg4);
  public final static native void glRecti(int jarg1, int jarg2, int jarg3, int jarg4);
  public final static native void glRects(short jarg1, short jarg2, short jarg3, short jarg4);
  public final static native void glRectdv(DoubleBuffer jarg1, DoubleBuffer jarg2);
  public final static native void glRectfv(FloatBuffer jarg1, FloatBuffer jarg2);
  public final static native void glRectiv(IntBuffer jarg1, IntBuffer jarg2);
  public final static native void glRectsv(ShortBuffer jarg1, ShortBuffer jarg2);
  public final static native void glVertexPointer(int jarg1, long jarg2, int jarg3, Buffer jarg4);
  public final static native void glNormalPointer(long jarg1, int jarg2, Buffer jarg3);
  public final static native void glColorPointer(int jarg1, long jarg2, int jarg3, Buffer jarg4);
  public final static native void glIndexPointer(long jarg1, int jarg2, Buffer jarg3);
  public final static native void glTexCoordPointer(int jarg1, long jarg2, int jarg3, Buffer jarg4);
  public final static native void glEdgeFlagPointer(int jarg1, Buffer jarg2);
  public final static native void glGetPointerv(long jarg1, long jarg2);
  public final static native void glArrayElement(int jarg1);
  public final static native void glDrawArrays(long jarg1, int jarg2, int jarg3);
  public final static native void glDrawElements(long jarg1, int jarg2, long jarg3, Buffer jarg4);
  public final static native void glInterleavedArrays(long jarg1, int jarg2, Buffer jarg3);
  public final static native void glShadeModel(long jarg1);
  public final static native void glLightf(long jarg1, long jarg2, float jarg3);
  public final static native void glLighti(long jarg1, long jarg2, int jarg3);
  public final static native void glLightfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glLightiv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glGetLightfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glGetLightiv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glLightModelf(long jarg1, float jarg2);
  public final static native void glLightModeli(long jarg1, int jarg2);
  public final static native void glLightModelfv(long jarg1, FloatBuffer jarg2);
  public final static native void glLightModeliv(long jarg1, IntBuffer jarg2);
  public final static native void glMaterialf(long jarg1, long jarg2, float jarg3);
  public final static native void glMateriali(long jarg1, long jarg2, int jarg3);
  public final static native void glMaterialfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glMaterialiv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glGetMaterialfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glGetMaterialiv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glColorMaterial(long jarg1, long jarg2);
  public final static native void glPixelZoom(float jarg1, float jarg2);
  public final static native void glPixelStoref(long jarg1, float jarg2);
  public final static native void glPixelStorei(long jarg1, int jarg2);
  public final static native void glPixelTransferf(long jarg1, float jarg2);
  public final static native void glPixelTransferi(long jarg1, int jarg2);
  public final static native void glPixelMapfv(long jarg1, int jarg2, FloatBuffer jarg3);
  public final static native void glPixelMapuiv(long jarg1, int jarg2, IntBuffer jarg3);
  public final static native void glPixelMapusv(long jarg1, int jarg2, IntBuffer jarg3);
  public final static native void glGetPixelMapfv(long jarg1, FloatBuffer jarg2);
  public final static native void glGetPixelMapuiv(long jarg1, IntBuffer jarg2);
  public final static native void glGetPixelMapusv(long jarg1, IntBuffer jarg2);
  public final static native void glBitmap(int jarg1, int jarg2, float jarg3, float jarg4, float jarg5, float jarg6, ShortBuffer jarg7);
  public final static native void glReadPixels(int jarg1, int jarg2, int jarg3, int jarg4, long jarg5, long jarg6, Buffer jarg7);
  public final static native void glDrawPixels(int jarg1, int jarg2, long jarg3, long jarg4, Buffer jarg5);
  public final static native void glCopyPixels(int jarg1, int jarg2, int jarg3, int jarg4, long jarg5);
  public final static native void glStencilFunc(long jarg1, int jarg2, long jarg3);
  public final static native void glStencilMask(long jarg1);
  public final static native void glStencilOp(long jarg1, long jarg2, long jarg3);
  public final static native void glClearStencil(int jarg1);
  public final static native void glTexGend(long jarg1, long jarg2, double jarg3);
  public final static native void glTexGenf(long jarg1, long jarg2, float jarg3);
  public final static native void glTexGeni(long jarg1, long jarg2, int jarg3);
  public final static native void glTexGendv(long jarg1, long jarg2, DoubleBuffer jarg3);
  public final static native void glTexGenfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glTexGeniv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glGetTexGendv(long jarg1, long jarg2, DoubleBuffer jarg3);
  public final static native void glGetTexGenfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glGetTexGeniv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glTexEnvf(long jarg1, long jarg2, float jarg3);
  public final static native void glTexEnvi(long jarg1, long jarg2, int jarg3);
  public final static native void glTexEnvfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glTexEnviv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glGetTexEnvfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glGetTexEnviv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glTexParameterf(long jarg1, long jarg2, float jarg3);
  public final static native void glTexParameteri(long jarg1, long jarg2, int jarg3);
  public final static native void glTexParameterfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glTexParameteriv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glGetTexParameterfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glGetTexParameteriv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glGetTexLevelParameterfv(long jarg1, int jarg2, long jarg3, FloatBuffer jarg4);
  public final static native void glGetTexLevelParameteriv(long jarg1, int jarg2, long jarg3, IntBuffer jarg4);
  public final static native void glTexImage1D(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5, long jarg6, long jarg7, Buffer jarg8);
  public final static native void glTexImage2D(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6, long jarg7, long jarg8, Buffer jarg9);
  public final static native void glGetTexImage(long jarg1, int jarg2, long jarg3, long jarg4, Buffer jarg5);
  public final static native void glGenTextures(int jarg1, IntBuffer jarg2);
  public final static native void glDeleteTextures(int jarg1, IntBuffer jarg2);
  public final static native void glBindTexture(long jarg1, long jarg2);
  public final static native void glPrioritizeTextures(int jarg1, IntBuffer jarg2, FloatBuffer jarg3);
  public final static native short glAreTexturesResident(int jarg1, IntBuffer jarg2, ShortBuffer jarg3);
  public final static native short glIsTexture(long jarg1);
  public final static native void glTexSubImage1D(long jarg1, int jarg2, int jarg3, int jarg4, long jarg5, long jarg6, Buffer jarg7);
  public final static native void glTexSubImage2D(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6, long jarg7, long jarg8, Buffer jarg9);
  public final static native void glCopyTexImage1D(long jarg1, int jarg2, long jarg3, int jarg4, int jarg5, int jarg6, int jarg7);
  public final static native void glCopyTexImage2D(long jarg1, int jarg2, long jarg3, int jarg4, int jarg5, int jarg6, int jarg7, int jarg8);
  public final static native void glCopyTexSubImage1D(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6);
  public final static native void glCopyTexSubImage2D(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5, int jarg6, int jarg7, int jarg8);
  public final static native void glMap1d(long jarg1, double jarg2, double jarg3, int jarg4, int jarg5, DoubleBuffer jarg6);
  public final static native void glMap1f(long jarg1, float jarg2, float jarg3, int jarg4, int jarg5, FloatBuffer jarg6);
  public final static native void glMap2d(long jarg1, double jarg2, double jarg3, int jarg4, int jarg5, double jarg6, double jarg7, int jarg8, int jarg9, DoubleBuffer jarg10);
  public final static native void glMap2f(long jarg1, float jarg2, float jarg3, int jarg4, int jarg5, float jarg6, float jarg7, int jarg8, int jarg9, FloatBuffer jarg10);
  public final static native void glGetMapdv(long jarg1, long jarg2, DoubleBuffer jarg3);
  public final static native void glGetMapfv(long jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glGetMapiv(long jarg1, long jarg2, IntBuffer jarg3);
  public final static native void glEvalCoord1d(double jarg1);
  public final static native void glEvalCoord1f(float jarg1);
  public final static native void glEvalCoord1dv(DoubleBuffer jarg1);
  public final static native void glEvalCoord1fv(FloatBuffer jarg1);
  public final static native void glEvalCoord2d(double jarg1, double jarg2);
  public final static native void glEvalCoord2f(float jarg1, float jarg2);
  public final static native void glEvalCoord2dv(DoubleBuffer jarg1);
  public final static native void glEvalCoord2fv(FloatBuffer jarg1);
  public final static native void glMapGrid1d(int jarg1, double jarg2, double jarg3);
  public final static native void glMapGrid1f(int jarg1, float jarg2, float jarg3);
  public final static native void glMapGrid2d(int jarg1, double jarg2, double jarg3, int jarg4, double jarg5, double jarg6);
  public final static native void glMapGrid2f(int jarg1, float jarg2, float jarg3, int jarg4, float jarg5, float jarg6);
  public final static native void glEvalPoint1(int jarg1);
  public final static native void glEvalPoint2(int jarg1, int jarg2);
  public final static native void glEvalMesh1(long jarg1, int jarg2, int jarg3);
  public final static native void glEvalMesh2(long jarg1, int jarg2, int jarg3, int jarg4, int jarg5);
  public final static native void glFogf(long jarg1, float jarg2);
  public final static native void glFogi(long jarg1, int jarg2);
  public final static native void glFogfv(long jarg1, FloatBuffer jarg2);
  public final static native void glFogiv(long jarg1, IntBuffer jarg2);
  public final static native void glFeedbackBuffer(int jarg1, long jarg2, FloatBuffer jarg3);
  public final static native void glPassThrough(float jarg1);
  public final static native void glSelectBuffer(int jarg1, IntBuffer jarg2);
  public final static native void glInitNames();
  public final static native void glLoadName(long jarg1);
  public final static native void glPushName(long jarg1);
  public final static native void glPopName();
  public final static native void gluLookAt(double jarg1, double jarg2, double jarg3, double jarg4, double jarg5, double jarg6, double jarg7, double jarg8, double jarg9);
  public final static native void gluPerspective(double jarg1, double jarg2, double jarg3, double jarg4);
  public final static native void gluOrtho2D(double jarg1, double jarg2, double jarg3, double jarg4);
}
