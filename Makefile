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

compile: sorting numbers strings

sorting: sorting/MergeSort.class sorting/SelectionSort.class sorting/BubbleSort.class

numbers: numbers/ReverseInteger.class numbers/Fibonacci.class numbers/PiApprox.class

strings: strings/Permute.class
		
clean:
	cd sorting; make clean
	cd numbers; make clean
	cd strings; make clean
