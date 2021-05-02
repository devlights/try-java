default: showenv run

showenv:
	@echo '|----------  ENV  ----------|'
	@java -version

clean:
	@echo '|---------- CLEAN ----------|'
	rm -rf tryjava/bin
	mkdir -p tryjava/bin

build: clean
	@echo '|---------- BUILD ----------|'
	javac -d tryjava/bin -cp tryjava/src tryjava/src/com/github/devlights/tryjava/App.java

run: build
	@echo '|----------  RUN  ----------|'
	java -cp tryjava/bin com.github.devlights.tryjava.App
