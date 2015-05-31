# This Makefile compiles the *.c files present in the src/ directory and links
# them to create the libexample.so library.

.PHONY: clean

CFLAGS  += -Iinclude -fPIC
LDFLAGS += -shared

OBJS = $(patsubst %.c,%.o,$(wildcard src/*.c))

%.o: %.c
	gcc -c $< $(CFLAGS) -o $@

libexample.so: $(OBJS)
	gcc -o $@ $(LDFLAGS) $(OBJS)

clean:
	-rm -f libexample.so $(OBJS)
