run :
		javac -cp src src/Main.java -d dist
		java -cp dist Main
Main.class: ./src/Main.java
	  javac -cp src src/Main.java -d dist

Main.class: ./dist/Main.class
		java -cp dist Main

clean:
		rm -rf dist

