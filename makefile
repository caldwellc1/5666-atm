
default:
	echo "make targets are {clean; test; build; buildall}"

clean:
	rm -f *.class
	rm -f *~

build:
	javac ATM.java

buildall:
	javac *.java

test:
	java ATM screen deposit	
	java ATM screen withdraw
	java ATM screen transfer
	java ATM screen paygas
	java ATM braille deposit	
	java ATM braille  withdraw
	java ATM braille  transfer
	java ATM braille  paygas
	java ATM speech deposit	
	java ATM speech  withdraw
	java ATM speech  transfer
	java ATM speech  paygas
