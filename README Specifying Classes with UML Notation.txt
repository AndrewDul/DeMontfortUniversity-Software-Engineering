

Specifying Classes with UML Notation

Before implementing a class in Object-Oriented Programming (OOP), it's important to create a class specification using UML (Unified Modeling Language). UML helps visualize the structure and behavior of classes and their relationships within a project.
What should be included in a class specification?


Purpose of the Object:

Describe what the object represents, its key properties (fields), and its behavior in the context of the application (methods). This description should clearly explain why the class exists and what it is used for.

Attributes (Fields):
List all the fields (variables) used in the class, specifying their data type and any constraints (e.g., int, String). Attributes describe the object's state.

Methods:
Provide a list of public methods that form the interface of the object. These methods describe the object's behavior, i.e., what the class can do. Also, mention any constraints on parameters and preconditions (e.g., "the value must be greater than 0").


Example of UML Class Specification:

Here’s how the OrderLine class would look using UML notation:


OrderLine
-----------
- id : String
- unitPrice : int  // in pence
- quantity : int
-----------
+ getCost() : int
+ setQuantity(int) : void



Explanation:


OrderLine: This is the name of the class.

id: A field of type String that stores the order identifier.

unitPrice: A field of type int that stores the unit price of the product in pence.

quantity: A field of type int that stores the quantity of the products ordered.

getCost(): A public method that returns the total cost of the order (unit price * quantity).

setQuantity(int): A public method that allows setting the quantity of ordered products.









