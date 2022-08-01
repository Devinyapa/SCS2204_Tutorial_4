object main extends App{

 def interest(deposit:Double)={
   if(deposit<=20000){
     deposit * 0.02
   }
   else if(deposit <= 200000){
     deposit * 0.04
   }

   else if(deposit <= 2000000){
     deposit * 0.035
   }
   else{
     deposit * 0.065
   }

}

println(interest(20000))
println(interest(200000))
println(interest(2000000))
println(interest(2500000))

}
