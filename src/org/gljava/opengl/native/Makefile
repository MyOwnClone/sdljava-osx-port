SWIG = swig

CC = gcc

CFLAGS=-O3

INCLUDE=-I. -I$(JAVA_HOME)/include -I$(JAVA_HOME)/include/linux -I/usr/include -I/usr/local/include -I/System/Library/Frameworks/JavaVM.framework/Versions/A/Headers -I/opt/local/include/

GLJAVA_I=glew.i

GLJAVA_OBJ=glew_wrap.o
GLJAVA_LIB=-lGLEW

all:	libgljava.so

#
#
# NOTE:  if you want to work on the gljava native layer please un-comment the following line
#
#glew_wrap.c: glew.i gljava_common_typemaps.i opengl-1_1.i
#	$(SWIG) $(INCLUDE) -importall -java -package org.gljava.opengl.x.swig -outdir ../../../../org/gljava/opengl/x/swig glew.i

%.o: %.c
	$(CC) $(CFLAGS) $(INCLUDE) -c $< -o $@

libgljava.so: $(GLJAVA_OBJ)
	$(CC) -shared -o libgljava.so $(GLJAVA_OBJ) $(GLJAVA_LIB) $(LDFLAGS) -framework OpenGL
	cp libgljava.so ../../../../../lib

clean:
	rm *.o *.so
