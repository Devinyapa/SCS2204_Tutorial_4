import scala.io.StdIn.readInt

object main extends App{

 print("Enter your integer:")
 val i=readInt()

 def evenOdd(i:Int)=i match {
   case i if(i<0) => println(i+" is negative")
   case i if(i==0) => println(i+" is zero")
   case i if(i%2==0)=> println(i+" is an even number")
   case i if(i%2==1)=> println(i+" is an odd number")

  }

evenOdd(i)

}
