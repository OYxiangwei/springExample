# springExample
spring入门
1、打开项目的 pom.xml ，添加 Spring 依赖。
2、创建接口类IOutputGenerator.java，两个实现类 CsvOutputGenerator.java/JsonOutputGenerator.java
3、创建一个需要用到输出的类 OutputHelper.java 
4、创建配置文件 Spring-Output.xml 
5、创建App.java读取配置文件获得输出类对象，调用要执行的方法
