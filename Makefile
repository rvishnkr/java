JFLAGS=

# Recognize files with .class and .java extensions
.SUFFIXES: .class .java

# This is a rule to convert a file with .java extension
# into a file with a .class extension. The macro $< just
# supplies the name of the file (without the extension)
# that invoked this rule.
.java.class:
	javac $(JFLAGS) $<

all: compile

compile: sorting integer strings

sorting: sorting/MergeSort.class

integer: integer/ReverseInteger.class integer/Fibonacci.class

strings: strings/Permute.class
		
clean:
	cd sorting; make clean
	cd integer; make clean
	cd strings; make clean
