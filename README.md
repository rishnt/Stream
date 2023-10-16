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

______________________________________________________________________
HANDSON (1)

ArrayList<Integr> n=new ArrayList<>();
n.add(19);
n.add(38);
n.add(39);

     OR

List<Integer> n=Arrays.asList(10,29,29,38,29);
List<Integer> evennum=new ArrayList<Integer>();

                                                                        ____________________________________     
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


______________________________________________________________________
HANDSON(2)

List<Strimng> names=Arrays.asList("Shivam","Rishant","Shashwat");
List<String> result=new ArrayList<String>();
result=names.stream().filter(str->dtr.length()>6 && str.length()<8).collect(Colllectors.toList());

OR (directly print without storing on other streams)

names.stream().filter(str->dtr.length()>6 && str.length()<8).forEach(str->System.out.println(str));
_________________________________________________________________________
HANDSON (3)

List<String> words=Arrays.asList("a","syatem","enend",null,"sk",null);
List<String> result=new ArrayList<String>();
result=words.stream().filter(str->str!=null).collect(Collectors.toList()); 
_________________________________________________________________________
HANDSON 4 (if collections store objects instead of primite data types then how do we process data in the filter method)


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
