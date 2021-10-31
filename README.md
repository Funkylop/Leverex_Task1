# Leverex_Task1

# 1
  To compile Main.java create src/main dir, then open cmd in this dir and enter: javac -d ../../bin Main.java.
  Run compilation Main.class in task1 dir with the command: java -classpath ./bin main.Main.
# 2
  In task1 dir u must enter the following commands:
   1. jar -cmf manifest.mf main.jar -C bin .
   2. java -jar main.jar
  and u should get the string "Hello world" in the console as in the 1st point.
 # 3
  1. Download lib(for example: junit)
  2. Open src/main, enter following command: javac -cp .;"D:\Leverex\task1\lib\junit-4.13.2.jar" -d ../../bin Main.java
  3. Open task1 dir, and enter: java -classpath ./bin main.Main
 # 4
  A separate file with the .class extension is created for each class declared in the Main class.
 # 5
 A separate file with the .class extension is created for an anonymous class, while the lambda function is converted to a private method of the class at compile time.
