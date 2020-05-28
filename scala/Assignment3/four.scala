object four{

def isEven(n:Int):Boolean = n match{
case 0 => true
case _ => isOdd(n-1)

}

def isOdd(n:Int):Boolean = !(isEven(n))

def main(args: Array[String]){
println(isEven(4),isEven(5));

}

}