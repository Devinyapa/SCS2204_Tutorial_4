object main extends App{

    def  toUpper(x:String):String={
       var text:String=""

       for(i<- x){
         if((i.toInt > 96) && (i.toInt < 123) ){
            text+=(i.toInt-32).toChar
         }else{
            text+=i
         }
       }
       return text

    }

    def  toLower(x:String):String={
       var text:String=""

       for(i<- x){
         if((i.toInt > 64) && (i.toInt < 91) ){
            text+=(i.toInt+32).toChar
         }else{
            text+=i
         }
       }
       return text

    }

    def formatName(name:String)(position:Int*)(func:(String)=>String):String={

      if(position.isEmpty){
        func(name)

      }else{
        var text:String= ""
        var k = 0

        for(i<-name){
          if(position.contains(k)) text=text+func(i.toString)
          else text=text+i.toString
          k=k+1
        }

        return text
      }


    }

    println(formatName("Benny")()(toUpper))
    println(formatName("Niroshan")(0,1)(toUpper))
    println(formatName("Saman")()(toLower))
    println(formatName("Kumara")(5)(toUpper))

}
