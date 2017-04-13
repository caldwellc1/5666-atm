
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
	java ATM screen buystamp
	java ATM braille deposit	
	java ATM braille  withdraw
	java ATM braille  transfer
	java ATM braille  paygas
	java ATM braille buystamp
	java ATM speech deposit	
	java ATM speech  withdraw
	java ATM speech  transfer
	java ATM speech  paygas
	java ATM speech buystamp
	java ATM hologram deposit	
	java ATM hologram  withdraw
	java ATM hologram  transfer
	java ATM hologram  paygas
	java ATM hologram buystamp