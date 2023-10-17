Objective: To implement the concept of interfaces and packages in Java.

Pre-Lab Exercise:

Create a package called shape2d. In that package declare an interface called
twod and three classes Square, Rectangle and Circle. In all three classes
implement the twod interface. In interface twod declare two methods area()
and perimeter(). Both returns double value. Square class contains one instance
variable called side of double type, a parameterized constructor for initializing
that member, area() and perimeter() methods for computing and returning the
area and perimeter of the square using appropriate formulae. Similarly
Rectangle class contains two instance variables called length and breadth of
double type, a parameterized constructor with two parameters for initializing
those members, area() and perimeter() methods for computing and returning
the area and perimeter of the rectangle using appropriate formulae. Circle
class contains one instance variable called radius of double type, a
parameterized constructor for initializing that member, area() and perimeter()
methods for computing and returning the area and perimeter of the circle
using appropriate formulae.

Create another package called shape3d. In that package declare an interface
called threed and three classes Cube, Cuboid and Sphere. In all three classes
implement the threed interface. In interface threed declare two methods
volume() and surfaceArea(). Both returns double value. Cube class extends
the Square class. It contains a parameterized constructor for setting the value
for the member side of its super class through the super class constructor,
volume() and surfaceArea() methods for computing and returning the volume
and surface area of the cube using appropriate formulae. Similarly Cuboid
class extends the Rectangle class, one instance variable called height and a
parameterized constructor with 3 parameters len, bdth, and hgt for setting the
values for its member height and its super class members length and breadth
through the super class constructor, volume() and surfaceArea() methods for
computing and returning the volume and surface area of the cuboid using
appropriate formulae. Sphere class extends Circle class contains a
parameterized constructor for initializing its super class member radius
through super class constructor, volume() and surfaceArea() methods for
computing and returning the volume and surface area of the sphere using

appropriate formulae. Create a class ShapeDemo outside the packages and
declare a main method for creating objects of all 2D and 3D shapes, calculate
area, perimeter, volume and surface area accordingly using the appropriate
interface references and display.

Lab Exercise:

Create a package named pkbanking. In that package define a sub package
named pkinterface. The package pkinterface contains an interface named
Transaction with a data member min_balance initialized to 500, two methods
namely void withdraw(double) and void deposit(double) and another interface
named InterestRate with two data members sbrate with 4%, fdrate with
8.25%.

Create another package named pkaccount. In that package create an abstract
class called Account that has the protected data members accnumber of int
type, balance of double, constructors for initialization. Define two
subpackages sb and fd in pkaccount. In sb package derive a class called
SBAccount from Account class that implements both Transaction and
InterestRate interfaces. Also it has constructors for initialization using super
class constructors, deposit(double), withdraw(double), and calc_interest()
methods. Provide a parameterized constructor with two parameters account
number, and init_balance and assign these values to the appropriate data
members of the class using super class constructor. The deposit method
should take one double type argument amount and adds the amount to the
balance if the amount is positive. The withdraw method, should take one
double type argument amount and checks if balance - amount is greater than
min_balance. If so, it should subtract the amount from balance. Otherwise it
should display error message. The calc_interest() method should compute
interest for the balance amount available @ sbrate p.a. and the interest amount
should be credited to the balance.
In fd package derive a class called FDAccount from Account class that
implements InterestRate interface. It has one data member period of int type.
Provide parameterized constructor with parameters for accno, period and
deposit amount for initializing them using super class constructor. Provide a
method called calc_interest() for calculating interest for the deposit amount

for the given period @ fdrate p.a. and returns the calculated interest, and
another method called close() which calls calc_interest() add it to the balance.
Create third package named pkcustomer which contains a class Customer.
The data members of the class are cust_id of int type, name, and address of
string type, and Array of objects of SBAccount and FDAccount. Provide
parameterized constructor with cust_id, name and address as parameters for
initializing. Provide a method called createAccount(int type). Based on the
value of type (SB, or FD) create a new account of given type and store it in
the corresponding array. Provide a method transaction(int type) {type may be
withdraw, deposit or calc_interest on SBAccount, closing of FDAccount} to
perform the requested transaction on the requested account object.
To demonstrate all the functionalities of above classes, create a class called
BankDemo and declare a main method to create an array of 5 elements of
Customer objects, and perform manipulations on the objects by creating SB
and FD accounts, depositing and withdrawing amount from SB accounts, and
closing FD accounts.
