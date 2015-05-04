#Choosing between xml and JSON
<hr/>

For my project I created an application that would communicate with a JSON or XML backend. I say 'or' because I tried out both, initially. I found them both to be incredibly useful in their own right but I will be using this paper to expalin why I ultimately chose to use XML over JSON in the end.

So before I get into why I chose XML over JSON, it's probably important to know what JSON and XML actually is.


+![Json](http://www.tridiondeveloper.com/wp-content/uploads/2013/09/logo-json.png)


JSON is short for JavaScript Object Notation, and is a way to store information in an organized, easy-to-access manner. In a nutshell, it gives us a human-readable collection of data that we can access in a really logical manner.

Storing JSON Data

As a simple example, information about me might be written in JSON as follows:
```
var jason = {
	"age" : "24",
	"hometown" : "Missoula, MT",
	"gender" : "male"
};
```

This creates an object that we access using the variable jason. By enclosing the variable’s value in curly braces, we’re indicating that the value is an object. Inside the object, we can declare any number of properties using a "name": "value" pairing, separated by commas. To access the information stored in jason, we can simply refer to the name of the property we need. For instance, to access information about me, we could use the following snippets:

#What is XML?
<hr/>
![Xml](http://icons.iconarchive.com/icons/custom-icon-design/pretty-office-7/256/Xml-tool-icon.png)

<ul>
<li> stands for EXtensible Markup Language</li>
<li> is a markup language much like HTML</li>
<li> was designed to describe data, not to display data</li>
<li> tags are not predefined. You must define your own tags</li>
<li> is designed to be self-descriptive</li>
<li> is a W3C Recommendation</li>
</ul>

Xml is for carrying information not for display information like HTML is.

````
<note>
  <to>Tove</to>
  <from>Jani</from>
  <heading>Reminder</heading>
  <body>Don't forget me this weekend!</body>
</note>
````
XML doesn't actually do anything. It's just informantion wrapped in tags.

#References
<hr/>
<ul>
<li>http://www.copterlabs.com/blog/json-what-it-is-how-it-works-how-to-use-it/</li>
<li>http://www.w3schools.com/xml/xml_whatis.asp</li>
</ul>
