# Stream

Stream is used for perforrming operations process data from collections .

java.io.streams;  to work with the files ,binary data
java.util.streams; used with the collections


FILTER- based on some condition it will filter the data and store the data to another collection 

MAP - it performs operations on each and every object/element from the collection and stores the result in some other collection

a- take data from the collections to the stream,                                                
b- perform the operations like filter, map on the stream,                               
c- store the result into anotherr collection

Methods Availabe in Streams are
Sorted()- used before and after filtering data from the streams
Count()- after filtering to check how many elements we got
Collect()- After filtering we can colllect data and store in some other collection
Distinct() - used for getting unique values after filtering
forEach()- this will read each and every value from the Stream
min()
max()

__________________________________________________________[FILTER]____________________________________________
HANDSON (1)
______________________________________________________
ArrayList<Integr> n=new ArrayList<>();
n.add(19);
n.add(38);
n.add(39);
     OR
List<Integer> n=Arrays.asList(10,29,29,38,29);
List<Integer> evennum=new ArrayList<Integer>();
__________________________________     
[without Streams]

for(int num:n){
if(num%2==0){
evennum.add(num);
} 
}

________________________________                               
[with Streams]


evennum=n.stream().filter(e->e%2==0).collect(Collectors.toList());
System.out.orintln(evennum);
  OR
evennum=n.stream().filter(e->e%2==0).forEach(e->System.out.println(e));
  OR
evennum=n.stream().filter(e->e%2==0).forEach(System.out::println);


_______________________________________________________
HANDSON(2)
_______________________________________________________
List<Strimng> names=Arrays.asList("Shivam","Rishant","Shashwat");
List<String> result=new ArrayList<String>();
result=names.stream().filter(str->dtr.length()>6 && str.length()<8).collect(Colllectors.toList());

OR (directly print without storing on other streams)

names.stream().filter(str->dtr.length()>6 && str.length()<8).forEach(str->System.out.println(str));
________________________________________________________
HANDSON (3)
________________________________________________________
List<String> words=Arrays.asList("a","syatem","enend",null,"sk",null);
List<String> result=new ArrayList<String>();
result=words.stream().filter(str->str!=null).collect(Collectors.toList()); 
________________________________________________________
HANDSON 4 (if collections store objects instead of primite data types then how do we process data in the filter method)
________________________________________________________

class Product{
int id;
String name;
duble price;

public product(int id,String name,double price){
this.id=id;
thos.name=name;
this.price=price;
}
}

public class Filter{
public static void main(String[] args){

List<Product> pro=new ArrayList<Product>();
pro.add(new Product(12,"Amit",234));
pro.add(new Product(13,"Rishant",123));
pro.add(new Product(14,"Shivani",233));

pro.stream()
.filter(p->p.price>25000)
.forEach(pr->System.out.println(pr.price());
}
}


___[MAP]______________________________________________
add the elemets from the collection to the stream and process them in the stream.map tranform the objcts by applying some operations on each and evey element and store them in some other collection/target.
_______________________________________________
HANDSON[1]
______________________________________________
List<Integer> vechile=Arrays.asList("bus","car","flight");
List<String> vechileList=new ArrayList<Integer>();
for(String name:vechile){
vechileList.add(name.toUpperCase());
}

       OR

 List<Integer> vechile=Arrays.asList("bus","car","flight");
List<String> vechileList=new ArrayList<Integer>();
vechileList=vechile.stream().map(name->name.toUppercase()).collect(Collectors.toList());
____________________________________________________
HANDSON[2]
____________________________________________________

List<String> vechiles=Arrays.asList("bus","car","flight");
List<String> leng=new ArayList<String>();
leng=vechiles.stream().map(name->name.length()).collect(Collectors.toList());

____________________________________________________
HANDSON[3]
_____________________________________________________

List<Integer> num=Arrays.asList(220,3,43,2);
List<Integer> target=new ArrayList<Integer<();

num.stream().map(n->n*3).forEach(number->System.out.println(number));

OR
num.stream().map(n->n*3).forEach(>System.out::println);

______________________________________________________
HANDSON[4] (Filter and Map)
______________________________________________________

class Employee
{
int empid;
String empname;
int salary;
}
{
//constructor
}
}

public classs Deno{
public static void main(string[] args)
{
List<Employee> empList=new ArrayList<>();
empList.add(new Employee(101,"alex",2333));

          OR
  List<Employee> empList=Arrays.asList(
  new Emplyee(101,"Eishnt",343323),
  new Employee(102,"sidiend",39343));


  empList.stream().filer(emp->emp.salary>20000)
               .map(e->e.salary)
               .forEach(employee->System.out.println(employee));
