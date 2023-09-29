run :
		javac -cp src src/Main.java -d out
		java -cp out Main
Main.class: ./src/Main.java
	  javac -cp src src/Main.java -d out

Main.class: ./out/Main.class
		java -cp out Main

clean:
		rm -rf out

