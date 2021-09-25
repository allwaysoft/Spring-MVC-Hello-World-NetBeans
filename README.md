# Spring-MVC-Hello-World-NetBeans
<h3>prerequisites</h3>
<ul>
  <li>Java 11</li>
  <li>Apache NetBeans IDE 12.4</li>
  <li>Tomcat 8.5</li>
</ul>
<h3>Steps for creating Spring MVC Hello World example on NetBeans.</h3>
<p>1)Go to File -> New Project -> Java with Maven -> Web Applicaton. </p>

![hola_01](Pictures/hola_01.png)
<p>2) You will see below screen, put name project and Groud id, again click on next.</p>

![hola_02](Pictures/hola_02.png)
<p>We need to select server and Java EE version</p>

![hola_03](Pictures/hola_03.png)
<p>Add spring dependency in pom.xml. We require spirng core and spring mvc dependency here.</p>

![hola_04](Pictures/hola_04.png)
<h3>Create Controller and view</h3>
<p>Create a package named "com.albertocorona.helloword" create a controller class named HelloController.java</p>

![Hello_05](Pictures/Hello_05.png)
<p>Create JSP named index.jsp in Web Pages folder. </p>

![hell0_06](Pictures/hell0_06.png)
<p>Modify index.jsp as below</p>

![hello_07](Pictures/hello_07.png)

<p>Create folder named WEB-INF/ in Web Pages folder. </p>

![hello_08](Pictures/hello_08.png)
<p>Create hello.jsp in /WEB-INF/ folder</p>

![hello_09](Pictures/hello_09.png)
<p>Modify hello.jsp as below</p>

![hello_10](Pictures/hello_10.png)
<h3>Configuring spring mvc application</h3>
<p>Create xml file named "web.xml" in /WEB-INF folder as below.</p>

![hello_11](Pictures/hello_12.png)
<p>Create xml file named "" in /WEB-INF folder as below.</p>

![hello_11](Pictures/hello_11.png)
<h3>it's time to do maven buid</h3>
<p>Right click on project -> clean and build</p>
<p> posible error as below.</p>

![hello_13](Pictures/hello_13.png)
<p> How fix it, update version maven-war-plugin in file pom.xml to 3.2.2  </p>
<p>After resolved the problem.</p>
<p>You will see below screen</p>

![hello_14](Pictures/hello_14.png)
<p>When you click on above link, you will get below screen.</p>

![hello_15](Pictures/hello_15.png)














