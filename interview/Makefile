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

compile: sorting integer_fun

sorting: sorting/MergeSort.class

integer_fun: integer_fun/ReverseInteger.class
		
clean:
	cd sorting; make clean
	cd integer_fun; make clean
