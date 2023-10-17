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
Count()- after filtering to check how many elements we got --->Terminal
Collect()- After filtering we can colllect data and store in some other collection--->Terminal
Distinct() - used for getting unique values after filtering--------->non terminal Operatio
forEach()- this will read each and every value from the Stream-------->terminal
limit()------->non terminal Operatio
filter()-------->non terminal Operatio
map()-------->non terminal Operatio
flatmap()  --------->non terminal Operation

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

 _______________________________________________________
[FLATMAP] ( it will take each and every object from the collection and return the object. it os used when we have collections inside collections. map returns single object at a time but flatmap returns stream of objects at a time .

 one input----> map()-----> one output
 one input----->flatmap()------> stream of objects _______________________________________________________
HANDSON

List<Integer> lst1=Arrays.asList(1,2);
List<Integer> lst1=Arrays.asList(3,4);
List<Integer> lst1=Arrays.asList(5,6);

List<List<Integer>> finallist=Arrays.asList(lst1,lst2,lst3);

List<Integer> ar=finallist.stream().flatmap(x->x.stream()).collect(Collectors.toList());

/// [if we have to increment every value by 10 ]

List<Integer> ar=finallist.stream().flatmap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
 
______________________________________________________
[HANDSON 2]

List<String> lst1=Arrays.asList("Mishra","Tiwari");
List<String> lst1=Arrays.asList("Amit","Utkarsh");
List<String> lst1=Arrays.asList("Rishant","Shivam");

List<List<String>> s=Arrays.asList(list1,list2,list3);
List<String> result=s.stream().flatmap(x->x.stream()).collect(Collectors.toList());

system.out.println(result);

________________________________________________________
[HANDSON 3]

class Student{
String sname;
int sid;
char grade;

// constructors
}

public class Demo
{
public static void main(String[] args)
{
List<Student> s1=new ArrayList<Student>();
s1.add(new Student("Smith",101,'A'));
s1.add(new Student("Sonu",102,'C'));
s1.add(new Student("Aman",105,'A'));

List<Student> s2=new ArrayList<Student>();
s1.add(new Student("Smi",10,'A'));                     
s1.add(new Student("Son",108,'C'));                    
s1.add(new Student("Ama",109,'A'));                    


List<List<Student>> finalList=Arrays.asList(s1,s2);

List<String> namesList==finalList.stream()             
.flatmap(x->x.stream())                               
.map(s->s.name)                                        
.collect(Collectors.toList());                         

______________________________________________________
Non terminal methods are used for processing and always returm a stream of objects and Terminal Operstions always execute before the termination of the program and after non terminal and terminal operations are carried on the stream given after non terminal operations

[Terminal operations]                                  
collect()                                             
count()                                               
min(val1,val2)                                                 
max()                                                 
forEach()                                              
toArray()                                             

_____________________________________________________

distinct() , count() , limit()                          

List<String> str=Arrays.asList("Honda","Bike","car","Honda","Scooter");   

//distinct()                                           
List<String> s= str.stream().distinct().collect(Collectors.toList());   

//count()                                              
int num=str.stream().count();  

//limit()                                               
List<Strig> s= str.stream().limit(3).collect(Collectors.toList());

// to check the number of even numbers in list

List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8,9);
int resulr= numbers.stream().filter(n->n%2==0).count();
                                                      
// min                                                  
Optional<Integer> min=numbers.stream().min((val1,val2)->{return val1.compareTo(val2)});
                                                        
min.get();// to get min value


// reduce   (  combines the objects into one single onject   

List<String> list=Arrays.asList("a","b","c","d");
Optional<String>reduced= list.stream().reduce((value,combinedvalue)->{return combinedvalue+value;});                                 
reduced.get();                                        

// toArray                                            
List<String> list=Arrays.asList("a","b","c","d");
Object arr[]=list.stream().toArray();
System.out.println(arr.length);

 ___________________________________________________
 Sorted()                                              

 List<Integer> list1=Arrays.asList(1,2,9,4,1,6);
 List<Integer> result=list1.stream().sorted().collect(Collectors.toList());                                                   

 // reverseOrder
 List<Integer> result=list1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());                          

                                                     ____________________________________________________
  anyMatch() --> if matches with atleast one value the return true else false ,                                          
  allmatch()--->every value should start with the predicate else it will return false                                        
noneMatch() --->  if the objet is not matching with any in stream then it will return true else return false.                                               

Set<String> fruits=new HashSet<>();
fruits.add("apple");
fruits.add("aana");
fruits.add("guvava");
fruits.add("betroot");

// anymatch()                                       
boolean result= fruits.stream().anymatch(value->{return value.startWith("one);}); //false                              
                                                      
//allmatch()                                           
boolean result= fruits.stream().allmatch(value->{return value.startWith("one);});  //false                      

//noneMatch()                                         
boolean result= fruits.stream().noneMatch(value->{return value.startWith("one);}); // true               

_______________________________________________________
findAny()--> return any object or elements from the stream and return null if dont have any element.        
findFirst()---> return first element from the collection

List<String> l=Arrys.asList("one","two","three");
Optonal<String> ele = l.stream().findAny();
ele.get();///to print Value 

//findFirst() 
Optonal<String> ele = l.stream().findFirst();

______________________________________________________
CONCATENATING THE STREAMS                               

List<String> l=Arrys.asList("one","two","three");       
List<String> list=Arrays.asList("a","b","c","d");      

Stream stream1=l.stream();
Stream stream2=list.stream();                         
List<String> finallist= Stream.concat(stream1, stream2).collect(Collectors.toList());
System.out.println(finallist);

_______________________________________________________
PARALLEL STREAM                                      

in streams we first add the collection to the stream for the processing but the processing in the stream happens sequentially . in order to fasten the performance we need to process the objects/elements in the stream parallely, ie. if there are 4 objects in stream then we 2-2 objects as 2 streams and proess then parallely.
Stream<Student> parallelStream = studentList.parallelStream();                          
_______________________________________________________
HANDSON                                                 
  class Student
  {
  String name;
  int score;
  }
  //constructor;
  // getters for name and score;
  }

// normal stream
public class demo
{
public static void main(String[] args)
{
List<Student> studentList=Arrays.asList(
new Student("Rishant",100),
new Student("Shivam",29),
new Student("Abhisheak",99),
new Student("Saurabh",88)
);

studentList.stream().
filter(e->e.getScore()>=80)
.limit(3)
.forEach(st->Systemout.println(st.getName()+" "+st.getSecore()));
  }
  }

//using parallelStream                                 

studentList.parallelStream().                         
filter(e->e.getScore()>=80)                         
.limit(3)                                             
.forEach(st->Systemout.println(st.getName()+" "+st.getSecore()));                                     
// convert stream to parallelStream                   
// parallel()  method                                        

   studentList.stream().parallel().
filter(e->e.getScore()>=80)
.limit(3)
.forEach(st->Systemout.println(st.getName()+" "+st.getSecore()));

                                                     
                                                       
